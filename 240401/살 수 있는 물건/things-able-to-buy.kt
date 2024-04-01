import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val money = sc.nextInt()

    if (money >= 3000) println("book")
    else if (money >= 1000) println("mask")
    else println("no")
}