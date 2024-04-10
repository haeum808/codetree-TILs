import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val arr = IntArray(11)
    var (a, b) = sc.nextLine().trim().split(" ").map { it.toInt() }

    while (a >= 1) {
        arr[a % b]++
        a /= b
    }

    print(arr.map { it * it }.sum())
}