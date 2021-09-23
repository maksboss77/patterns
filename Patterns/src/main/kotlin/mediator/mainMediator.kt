package mediator

fun main() {

    val music = Music()
    val light = Light()

    val mediator = MediatorImpl(light, music)

    val home = Home(mediator)

    home.lightOn()
    home.musicOn()

    home.lightOff()
    home.musicOff()

    println("\nPARTY!")
    home.partyModeOn()
    println("\nOh..Coops")
    home.partyModeOff()





}