package proxy.retrofit

import proxy.entity.RepoItem
import proxy.entity.EventsRepoItem
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubService {
    @GET("users/{user}/repos")
    fun reposByAuthors(@Path("user") user: String?): Call<List<RepoItem>>

    @GET("networks/octocat/{repos}/events")
    fun reposByName(@Path("repos") repos: String?): Call<List<EventsRepoItem>>
}