package structred

fun main(args: Array<String>) {
        //IF EXPRESSIONS
    var marks = 10
    var result = if (marks < 40){
        "E"
    }else if (marks < 50){
        "D"
    }else if (marks < 60){
        "C"
    }else if (marks < 70){
        "B"
    }else{
        "A"
    }
    println(result)

    //WHEN EXPRESSIONS
    var bettingNumber = 0
    var betResult = when(bettingNumber){
        1->{
            "Sorry!! You lost!!"
        }
        2->{
            "Sorry!! You lost!!"
        }
        3->{
            "Congratulations!! You won!!"
        }else->{
            "Enter a number from 1 - 3"
        }
    }
    println(betResult)
}