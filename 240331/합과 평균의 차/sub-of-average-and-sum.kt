import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()

    val sum = a + b + c
    val average = (a + b + c) / 3

    println(sum)
    println(average)
    println(sum - average)
}