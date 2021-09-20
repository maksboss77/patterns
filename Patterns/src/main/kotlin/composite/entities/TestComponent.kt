package composite.entities

sealed class TestComponent(open val name: String) {

    open fun print() {
        println(name)
    }

    data class Test(
        override val name: String
    ) : TestComponent(name)

    class TestGroup(
        override val name: String,
        val list: MutableList<TestComponent>
    ) : TestComponent(name) {
        override fun print() {
            println("GROUP :: $name")
            list.forEach{
                print("-")
                it.print()
            }
        }
    }

}

