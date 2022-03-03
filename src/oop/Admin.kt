package oop

class Admin(override var email:String, override var password:String):Verification(email, password) {

    var status = "Admin"
    fun approvePayments(){
        println("Yeah, I can approve payments")
    }
}

fun main(args: Array<String>) {
    var userOne = Admin("king@gmail.com", "king@123")
    userOne.register()
    println(userOne.status)
}