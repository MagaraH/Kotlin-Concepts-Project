package oop

import java.util.Scanner

class Authetication{
    var email:String
    var password:String

    constructor(email: String, password: String) {
        this.email = email
        this.password = password
    }
    fun register(){
        if (password.length < 4){
            println("The password must have four or more characters")
        }else{
            println("Register with email $email and password $password")
        }
    }
    fun login(){
        if (email.equals("king@gmail.com") && password.equals("king123")){
            //proceed to calculate BMI from a differient class
            var chukua = Scanner(System.`in`)
            println("Enter weight")
            var weight = chukua.nextDouble()
            println("Enter height")
            var height = chukua.nextDouble()
            var bmicalc = Bmicalc(weight, height)
            bmicalc.bmi()
        }else{
            println("wrong email or password")
        }
    }


}

class Bmicalc{
    var weight:Double
    var height:Double

    constructor(weight: Double, height: Double) {
        this.weight = weight
        this.height = height
    }
    fun bmi(){
        var bmi = weight/Math.pow(height,2.0)
        if (bmi < 18){
            println("underweight")
        }else if (bmi < 24.5){
            println("normal weight")
        }else if (bmi < 29.5){
            println("overweight")
        }else{
            println("obese")
        }
    }
}

fun main(args: Array<String>) {
    var chukua = Scanner(System.`in`)
    println("Enter email")
    var email = chukua.next()
    println("Enter Password")
    var password = chukua.next()
    var userOne = Authetication(email, password)
    userOne.login()

}

