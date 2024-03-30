import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val c = sc.next()
    val a = sc.nextDouble()
    val b = sc.nextDouble()

    println("$c")
    println("%.2f".format(a))
    println("%.2f".format(b))
}