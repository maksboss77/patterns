package mediator

class Music {

    fun on() {
        println("Music on")
    }

    fun off() {
        println("Music off")
    }

    fun setVolume(volume: Int) {
        if (volume in 1..100) {
            println("Volume music: $volume")
        }
    }

}