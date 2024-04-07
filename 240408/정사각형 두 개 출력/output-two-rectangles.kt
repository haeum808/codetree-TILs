import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    repeat(2) {
        repeat(n) {
            repeat(n) {
                print("*")
            }
            println()
        }
        println()
    }
}