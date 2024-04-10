import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextLine()
    val numbers = sc.nextLine().trim().split(" ").map { it.toInt() }.sortedDescending()

    print("${numbers[0]} ${numbers[1]}")
}