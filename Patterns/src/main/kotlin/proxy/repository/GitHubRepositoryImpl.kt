package proxy.repository

import proxy.entity.AuthorRepo
import proxy.entity.InfoRepo
import proxy.retrofit.GitHubService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class GitHubRepositoryImpl : GitHubRepository {

    private val gitHubRepositoryCacheProxy = GitHubRepositoryCacheProxy()
    private val gitHubRepositoryDownloader = GitHubRepositoryDownloader(service)

    override fun getReposByAuthors(author: String): List<InfoRepo> {

        val cache = gitHubRepositoryCacheProxy.getReposByAuthors(author)

        return cache.ifEmpty {
            val repos = gitHubRepositoryDownloader.getReposByAuthors(author)
            gitHubRepositoryCacheProxy.setCacheReposByAuthor(author, repos)
            return@ifEmpty repos
        }
    }

    override fun getReposByName(nameRepo: String): List<AuthorRepo> {
        val cache = gitHubRepositoryCacheProxy.getReposByName(nameRepo)
        return cache.ifEmpty {
            val repos = gitHubRepositoryDownloader.getReposByName(nameRepo)
            gitHubRepositoryCacheProxy.setCacheReposByName(nameRepo, repos)
            return@ifEmpty repos
        }
    }

    companion object {
        private val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        private val service: GitHubService = retrofit.create(GitHubService::class.java)
    }

}