package proxy.repository

import proxy.entity.AuthorRepo
import proxy.entity.InfoRepo

interface GitHubRepository {

    fun getReposByAuthors(author: String): List<InfoRepo>

    fun getReposByName(nameRepo: String): List<AuthorRepo>

}