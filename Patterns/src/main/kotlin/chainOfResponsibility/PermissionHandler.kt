package chainOfResponsibility

class PermissionHandler(override var nextHandler: Handler?) : BaseHandler() {

    override fun valid(name: String): Boolean {
        return name.contains("yes")
    }

}

