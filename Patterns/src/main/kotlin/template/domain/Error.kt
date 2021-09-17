package template.domain

data class Error(
    val code: Int,
    val message: String,
    val initializer: String
)