import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    repeat(n) {
        repeat(n) {
            print("*")
        }
        println()
    }
}