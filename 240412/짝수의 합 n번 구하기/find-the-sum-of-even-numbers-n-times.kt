import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    repeat(n) {
        val start = sc.nextInt()
        val end = sc.nextInt()

        println((start..end).filter { it % 2 == 0 }.sum())
    }
}