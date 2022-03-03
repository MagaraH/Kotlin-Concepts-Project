package oop

interface FirstInterface {
    var age:Int
    fun rice():String
    fun greeting(){
        println("Good morning class")
    }
}

class FourthClass:FirstInterface{
    override var age: Int = 100
    override fun rice(): String = "I love rice"

}

fun main(args: Array<String>) {
    var myObj = FourthClass()
    println(myObj.rice())
    myObj.greeting()
}
