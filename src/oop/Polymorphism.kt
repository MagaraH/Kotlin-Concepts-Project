package oop

open class classOne{
    fun ugali(){
        println("I love ugali")
    }
    fun githeri(){
        println("i love githeri")
    }
}
open class classTwo:classOne(){

}
class classThree:classTwo(){

}

fun main(args: Array<String>) {
    var myObj = classThree()
    myObj.githeri()
}
//allows a class to inherit from a grandparent class through a parent class