package structred

import java.util.Scanner


fun main(args: Array<String>) {
    InfoCheck("eMobilis", "eMobilis123")

}
fun InfoCheck(userName:String, passWord:String){
    if (userName == "eMobilis" && passWord == "eMobilis123"){
        val sc = Scanner(System.`in`)
        println("Enter Weight :")
        val userWeight = sc.nextDouble()
        println("Enter Height :")
        val userHeight = sc.nextDouble()

    var bmi = userWeight/(userHeight*userHeight)
    if (bmi <18.4){
        println("Underweight")
    }else if (bmi <24.9){
        println("Normalweight")
    }else if (bmi<29.9){
        println("Overweight")
        }else {
        println("Obese")
    }
}else{
    println("Wrong username or password")
}
}
