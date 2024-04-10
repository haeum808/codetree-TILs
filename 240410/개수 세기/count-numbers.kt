import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val (n, m) = sc.nextLine().trim().split(" ").map { it.toInt() }
    val arr = sc.nextLine().trim().split(" ").map { it.toInt() }

    print(arr.count { it == m })
}