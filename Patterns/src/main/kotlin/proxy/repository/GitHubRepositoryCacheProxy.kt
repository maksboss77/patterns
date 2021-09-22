package proxy.repository

import proxy.entity.AuthorRepo
import proxy.entity.InfoRepo

class GitHubRepositoryCacheProxy : GitHubRepository {

    private val allRepositoryByName = mutableMapOf<String, List<AuthorRepo>>()
    private val allRepositoryByAuthor = mutableMapOf<String, List<InfoRepo>>()

    override fun getReposByAuthors(author: String): List<InfoRepo> {

        val list = allRepositoryByAuthor[author].orEmpty()
        if (list.isNotEmpty()) {
            println("Get cache...")
        }
        return list
    }

    override fun getReposByName(nameRepo: String): List<AuthorRepo> {
        val list = allRepositoryByName[nameRepo].orEmpty()
        if (list.isNotEmpty()) {
            println("Get cache...")
        }
        return list
    }

    fun setCacheReposByAuthor(author: String, list: List<InfoRepo>) {
        allRepositoryByAuthor[author] = list
    }

    fun setCacheReposByName(nameRepo: String, list: List<AuthorRepo>) {
        allRepositoryByName[nameRepo] = list
    }

}