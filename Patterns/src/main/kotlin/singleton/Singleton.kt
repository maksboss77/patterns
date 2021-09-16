package singleton

object Singleton {

    private var uniqueInstance: Singleton? = null
    private var indexConnected = 0
    private var globalIndexConnected = 0

    @Synchronized //чтобы избежать параллельного доступа
    fun getInstance(): Singleton {

        indexConnected++

        if (uniqueInstance == null || indexConnected.invalidConnected()) {
            uniqueInstance = Singleton
            globalIndexConnected++
            indexConnected = 1
        }

        return uniqueInstance!!
    }

    private fun Int.invalidConnected() : Boolean {
        return this > 10
    }

    fun getIndexConnected(): Int = indexConnected

    fun getGlobalIndexConnected(): Int = globalIndexConnected

}