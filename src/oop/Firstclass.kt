package oop

abstract class Firstclass(open var name:String, open var age:Int) {
    abstract fun motto()
    abstract fun mission()
}

 class SecondClass(override var name:String, override var age:Int):Firstclass(name, age){
    override fun motto() {
      println("Education is the key to success")
    }

    override fun mission() {
      println("To educate the world")
    }
}
class ThirdClass(override var name: String, override var age: Int):Firstclass(name, age){
    override fun motto() {
       println("Success is as a result of hardwork")
    }

    override fun mission() {
        println("To nature the world through education")
    }
}

fun main(args: Array<String>) {
    var xyz = ThirdClass("King", 100)
    xyz.motto()
   println( xyz.age)
    xyz.mission()
}

//from Auth class, on register and login methods respectively, validate any users email and password. if the user
//has an email and password of your liking,proceed to calculate the bmi of the same user from a child class
//called bmicalc
//ensure all credentials are provided by the user through the scanner