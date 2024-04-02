import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextInt()
    val b = sc.nextInt()

    if (a % 2 == 0) println("even")
    else println("odd")

    if (b % 2 == 0) println("even")
    else println("odd")
}