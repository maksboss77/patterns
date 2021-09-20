package composite.entities

class TestRail(private val testComponent: TestComponent) {

    fun printTests() {
        testComponent.print()
    }

}