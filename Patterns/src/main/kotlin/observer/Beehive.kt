package observer

data class Beehive(
    val frequencySound: Int,
    val weight: Int,
) {
    companion object {
        val DEFAULT = Beehive(0, 10)
    }
}
