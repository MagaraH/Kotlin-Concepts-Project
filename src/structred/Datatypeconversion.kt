package structred

fun main(args: Array<String>) {
    var a: String;
    var b: String;
    var c: Int;
    var d: Double;

    a = "100"
    b = "200"
    var total: Double;

    println(a + b)

    c = a .toInt()
    d = b .toDouble()
    println(c + d)
    total = c + d
    println(total)
    println("%.2f".format(total))

    println(c .toString() + d .toString())


}