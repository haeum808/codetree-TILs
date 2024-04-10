import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val (a, b) = sc.nextLine().trim().split(" ").map { it.toInt() }
    val n1 = sc.nextLine()
    val n2 = sc.nextLine()

    if (n1.contains(n2)) print("Yes") else print("No")
}