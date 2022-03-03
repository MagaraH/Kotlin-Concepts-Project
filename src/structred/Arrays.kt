package structred

fun main(args: Array<String>) {
    var names = arrayOf("King", "Tom", "Hesborn", "Sharon")
    println(names[2])
    for (name in names){
        println(name)
    }
    if ("Hesborn" in names){
        println("Hesborn is here")
    }
}