package chainOfResponsibility

fun main() {

    val limitHandler = LimitHandler(null)
    val permissionHandler = PermissionHandler(limitHandler)

    permissionHandler.check("test yes")
    permissionHandler.check("test yes no limit")
    permissionHandler.check("test no permission")

}