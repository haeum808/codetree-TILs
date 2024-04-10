import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    sc.nextLine()
    val arr = sc.nextLine().trim().split(" ").map { it.toInt() * it.toInt() }

    print(arr.joinToString(" "))
}