import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextInt()
    val b = sc.nextInt()

    if (a >= b) println(1) else println(0)
    if (a > b) println(1) else println(0)
    if (b >= a) println(1) else println(0)
    if (b > a) println(1) else println(0)
    if (a == b) println(1) else println(0)
    if (a != b) println(1) else println(0)
}