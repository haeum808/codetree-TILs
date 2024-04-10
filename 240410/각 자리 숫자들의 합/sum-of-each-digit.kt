import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val input = sc.next()

    print(input.map { it - '0' }.sum())
}