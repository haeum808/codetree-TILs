import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val average = sc.nextLine().trim().split(" ").map { it.toDouble() }.sum() / 8

    print("%.1f".format(average))
}