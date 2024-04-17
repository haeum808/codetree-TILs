import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    val numbers = mutableListOf<Int>()

    repeat(n) {
        val number = sc.nextInt()

        numbers.add(number)
        numbers.sort()

        if (number % 2 != 0) {
            print("${numbers[numbers.size / 2]} ")
        }
    }
}