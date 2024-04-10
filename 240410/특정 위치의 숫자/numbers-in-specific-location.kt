import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val arr = sc.nextLine().trim().split(" ").map { it.toInt() }

    print("${arr[2] + arr[4] + arr[9]}")
}