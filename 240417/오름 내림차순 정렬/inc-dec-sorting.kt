import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val numbers = IntArray(n) { sc.nextInt() }

    println(numbers.sorted().joinToString(" "))
    println(numbers.sortedDescending().joinToString(" "))
}