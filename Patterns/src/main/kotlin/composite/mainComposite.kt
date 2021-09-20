package composite

import composite.entities.TestComponent

/**
 *
 * для отображения списка тестов у нас есть группы тестов, которые включают другие группы тестов и несолько тестов.
 * нужно эту структуру взять и вывести ее в текстовом виде на экран
 * Группа название и id
 * Тесты название и idГруппы
 * */

fun main() {

    val allTests: TestComponent.TestGroup = TestComponent.TestGroup(name = "ALL-TEST", list = mutableListOf())
    allTests.list.addAll(createTest())

    val uxTest = TestComponent.TestGroup("UX-TEST", mutableListOf())
    uxTest.list.addAll(createTest())

    allTests.list.add(uxTest)

    allTests.print()

}

private fun createTest(): List<TestComponent.Test> {
    return listOf(
        TestComponent.Test("Test 1"),
        TestComponent.Test("Test 2"),
        TestComponent.Test("Test 3"),
    )
}

//private fun createTestGroup(): List<TestComponent> {
//
//    val list = mutableListOf<TestComponent>()
//
//    val uiTest: TestComponent = TestGroup(1, "UI-тесты") // есть 3 теста
//    val uxTest: TestComponent = TestGroup(2, "UX-тесты") // есть 3 теста + subUx + 3 теста
//    val smokeTest: TestComponent = TestGroup(3, "Smoke") // без тестов + subSmoke +  без тестов
//    val regressTest: TestComponent = TestGroup(4, "Регресс-тесты") // есть 3 теста
//
//    uiTest.addAll(createTest(uiTest.getId()))
//
//
//    val subUx: TestComponent = TestGroup(101, "SubUx")
//    subUx.addAll(createTest(subUx.getId()))
//    uxTest.add(subUx)
//    uxTest.addAll(createTest(uxTest.getId()))
//
//    smokeTest.add(TestGroup(102, "SubSmoke"))
//
//    regressTest.addAll(createTest(regressTest.getId()))
//
//    list.add(uiTest)
//    list.add(uxTest)
//    list.add(smokeTest)
//    list.add(regressTest)
//    return list
//}





