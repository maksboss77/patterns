package proxy.entity

data class EventsRepoItem(
    val actor: Actor,
    val created_at: String,
    val id: String,
    val payload: Payload,
    val `public`: Boolean,
    val repo: Repo,
    val type: String
)