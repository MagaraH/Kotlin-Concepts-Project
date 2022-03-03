package oop

open class Verification(open var email:String, open var password:String) {
    fun login(){
        println("Yeah, I can login")
    }
    fun register(){
        println("Yeah, I can register")
    }
}