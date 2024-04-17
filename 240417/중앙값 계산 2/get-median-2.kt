import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    val numbers = mutableListOf<Int>()

    repeat(n) { index ->
        val number = sc.nextInt()

        numbers.add(number)

        if ((index + 1) % 2 != 0) {
            print("${numbers.sorted()[numbers.size / 2]} ")
        }
    }
}