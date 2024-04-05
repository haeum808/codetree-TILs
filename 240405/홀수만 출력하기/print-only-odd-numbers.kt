import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    repeat(n) {
        val number = sc.nextInt()

        if (number % 2 != 0 && number % 3 == 0) {
            println(number)
        }
    }
}