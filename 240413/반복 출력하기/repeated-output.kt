import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    printStrangeThings(n)
}

fun printStrangeThings(n: Int) {
    for (i in 1..n) {
        println("12345^&*()_")
    }
}