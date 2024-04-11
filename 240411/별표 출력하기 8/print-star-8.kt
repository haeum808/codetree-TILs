import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    repeat(n) {
        if (it % 2 == 0) {
            println("*")
        } else {
            repeat(it + 1) {
                print("* ")
            }
            println()
        }
    }
}