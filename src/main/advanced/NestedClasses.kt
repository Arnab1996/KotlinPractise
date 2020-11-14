package main.advanced

class DirectoryExplorer(val user: String) {
    inner class PermissionCheck() {
        fun validatePermission() {
            if (user != "Hadi") {

            }
        }
    }

    fun listFolder(folder: String, user: String) {
        val permissionCheck = PermissionCheck()
        permissionCheck.validatePermission()
    }
}

fun main(args: Array<String>) {
    val dc = DirectoryExplorer("Hadi")
    // val pc = DirectoryExplorer.PermissionCheck()
}