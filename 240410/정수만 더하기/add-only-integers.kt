import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val input = sc.nextLine().filter { it.isDigit() }.map { it - '0' }.sum()

    print(input)
}