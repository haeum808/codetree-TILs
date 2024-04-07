import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val (a, b) = sc.nextLine().trim().split(" ").map { it.toInt() }

    print((a..b).fold(1) { acc, value -> if (value % a == 0) acc * value else acc })
}