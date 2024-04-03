import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val numbers = sc.nextLine().trim().split(" ").map { it.toInt() }.sorted()

    print(numbers[1])
}