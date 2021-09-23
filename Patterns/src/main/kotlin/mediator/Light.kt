package mediator

class Light {

    fun on() {
        println("Light on")
    }

    fun off() {
        println("Light off")
    }

    fun setColor(color: String) {
        println("Свет установлен на $color")
    }

}