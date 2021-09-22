package proxy.entity

data class Commit(
    val author: Author,
    val distinct: Boolean,
    val message: String,
    val sha: String,
    val url: String
)