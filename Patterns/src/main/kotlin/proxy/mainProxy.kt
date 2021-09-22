package proxy

import proxy.repository.GitHubRepositoryImpl

fun main() {

    val gitHubRepository = GitHubRepositoryImpl()
    while (true) {
        print("Author: ")
        val author = readLine().orEmpty()
        val listRepos = gitHubRepository.getReposByAuthors(author)
        println(listRepos)

        print("RepoName: ")
        val repoName = readLine().orEmpty()
        val listAuthors = gitHubRepository.getReposByName(repoName)
        println(listAuthors)

    }

}