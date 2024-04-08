import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val input = sc.nextLine()

    print(input.filterIndexed { index, value -> index % 2 != 0 }.reversed())
}