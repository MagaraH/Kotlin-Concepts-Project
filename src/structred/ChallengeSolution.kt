package structred

import java.util.*

fun main(args: Array<String>) {
    var chukua = Scanner(System.`in`)
    println("Enter Username")
    var username = chukua.next()
    println("Enter Password")
    var password = chukua.next()
    println("Enter weight")
    var weight = chukua.nextDouble()
    println("Enter Height")
    var height = chukua.nextDouble()
    userCheck(username, password, weight, height)
}

fun userCheck(username:String, password:String, weight: Double, height: Double){
    if(username.equals("eMobilis") && password.equals("eMobilis@123")){
        //calculate the bmi
        bmi(weight, height)
    }else{
        println("Wrong username or password")
    }
}

fun bmi(weight:Double, height:Double){
    var bmi = weight/Math.pow(height,2.0)
    if (bmi < 18){
        println("Underweight")
    }else if (bmi < 24.9){
        println("Normal Weight")
    }else if (bmi < 29.9){
        println("Over Weight")
    }else{
        println("Obese")
    }

}