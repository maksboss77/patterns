package interpreter

import interpreter.enums.Action
import interpreter.enums.Object
import interpreter.enums.Subject

class InterpreterContext {

    var subjectName: String = ""
    var actionName: String = ""
    var objectName: String = ""

    fun searchMovie(): String {
        return when {
            checkMovie(Subject.THEY, Action.KILLED, Object.KENNY) -> SOUTH_PARK
            checkMovie(Subject.SHE, Action.LOVED, Object.IVAN) -> RUSSIAN_MOVIE
            checkMovie(Subject.HE, Action.WRITE, Object.CODE) -> IT
            else -> UNKNOWN
        }
    }

    private fun checkMovie(subjectEnum: Subject, actionEnum: Action, objectEnum: Object): Boolean {
        val subjectIsBool = subjectName.contains(subjectEnum.subjectName)
        val actionIsBool = actionName.contains(actionEnum.action)
        val objectIsBool = objectName.contains(objectEnum.objectName)
        return subjectIsBool && actionIsBool && objectIsBool
    }

    companion object {
        const val SOUTH_PARK = "Южный парк"
        const val RUSSIAN_MOVIE = "Русские фильмы"
        const val IT = "IT-структура"
        const val UNKNOWN = "Неизвестный"
    }

}