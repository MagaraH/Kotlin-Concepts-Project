package structred

fun main(args: Array<String>) {
    average("king",100.0, 200, 300.0)
    average(20, 50, 68)
    average(25.0, 45, 40.0)

}
fun average(x:Double, y:Int, z:Double){
    var average = (x + y + z)/3.0
    println("Your average is $average")
}
fun average(name:String, x:Double, y:Int, z:Double){
    var average = (x + y + z)/3.0
    println("Hey $name Your average is $average")
}
fun average(x:Int, y:Int, z:Int){
    var average = (x + y + z)/3.0
    println("Your average is $average")
}


//create a function to check if the users username is "eMobilis " and the password is "eMobilis123"
//hence calculate the users bmi with credentials provided by the user
//
//display the result as;
            //1. underweight
            //2. normal weight
            //3. over weight
            //obese
//use a scanner to receive data from the user