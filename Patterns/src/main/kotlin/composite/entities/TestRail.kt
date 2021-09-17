package composite.entities

import composite.TestComponent

class TestRail(private val testComponent: TestComponent) {

    fun printTests() {
        testComponent.print()
    }

}