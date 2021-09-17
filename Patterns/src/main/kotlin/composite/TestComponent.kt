package composite

abstract class TestComponent {

    open fun add(testComponent: TestComponent) { throw UnsupportedOperationException() }
    open fun addAll(testComponentList: List<TestComponent>) { throw UnsupportedOperationException() }
    open fun remove(testComponent: TestComponent) { throw UnsupportedOperationException() }

//    open fun getParent(id: Int): TestComponent = throw UnsupportedOperationException() //не нужно?

    open fun getChild(id: Int): TestComponent = throw UnsupportedOperationException()
    open fun getId(): Int = throw UnsupportedOperationException()
    open fun getParentId(): Int = throw UnsupportedOperationException()

    abstract fun getName(): String
    abstract fun print()

}