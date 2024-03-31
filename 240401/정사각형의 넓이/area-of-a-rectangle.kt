import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    println(n * n)
    if (n < 5) {
        println("tiny")
    }
}