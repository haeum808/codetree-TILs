import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    if (n >= 3000) {
        println("book")
    } else if (n >= 1000) {
        println("mask")
    } else if (n >= 500) {
        println("pen")
    } else {
        println("no")
    }
}