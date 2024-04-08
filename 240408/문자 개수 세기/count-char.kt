import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val input = sc.nextLine()
    val alphabet = sc.next()[0]

    print(input.count { it == alphabet })
}