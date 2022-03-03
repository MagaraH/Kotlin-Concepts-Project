package oop

class Superuser(override var email:String, override var password:String):Verification(email, password) {

    var status = "Superuser"
    fun manageAdmins(){
        println("Yeah, I can manage admins")
    }
}

fun main(args: Array<String>) {
    var userOne = Superuser("king@gmail.com", "king@123")
    userOne.register()
    println(userOne.status)
}
