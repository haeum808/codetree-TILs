import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val (a, b) = sc.nextLine().trim().split(" ").map { it.toInt() }

    var sum = 0

    (a..b).forEach { if (it % 6 == 0 && it % 8 != 0) sum += it }

    print(sum)
}