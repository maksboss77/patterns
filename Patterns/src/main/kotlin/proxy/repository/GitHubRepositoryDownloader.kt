package proxy.repository

import proxy.entity.RepoItem
import proxy.entity.EventsRepoItem
import proxy.entity.AuthorRepo
import proxy.entity.InfoRepo
import proxy.retrofit.GitHubService

class GitHubRepositoryDownloader(private val service: GitHubService) : GitHubRepository {

    override fun getReposByAuthors(author: String): List<InfoRepo> {
        println("Download...")
        val reposList = getGitHubRepositoriesByAuthor(author)
        val authorReposList = reposList.map {
            InfoRepo(it.name, it.html_url)
        }
        return authorReposList
    }

    override fun getReposByName(nameRepo: String): List<AuthorRepo> {
        println("Download...")
        val reposList = getGitHubRepositoriesByName(nameRepo)
        val nameReposList = reposList.map {
            AuthorRepo(it.actor.login, it.actor.url)
        }
        return nameReposList
    }

    private fun getGitHubRepositoriesByAuthor(author: String): List<RepoItem> {
        val body = service.reposByAuthors(author).execute().body()
        return body.orEmpty()
    }

    private fun getGitHubRepositoriesByName(nameRepo: String): List<EventsRepoItem> {
        val body = service.reposByName(nameRepo).execute().body()
        return body.orEmpty()
    }
}