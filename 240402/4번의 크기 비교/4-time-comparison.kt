import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    val d = sc.nextInt()
    val e = sc.nextInt()

    if (a > b) println(1) else println(0)
    if (a > c) println(1) else println(0)
    if (a > d) println(1) else println(0)
    if (a > e) println(1) else println(0)
}