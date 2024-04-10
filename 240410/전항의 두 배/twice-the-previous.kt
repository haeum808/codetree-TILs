import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    var (a1, a2) = sc.nextLine().trim().split(" ").map { it.toInt() }

    val arr = IntArray(10)
    arr[0] = a1
    arr[1] = a2

    for (i in 2..9) {
        arr[i] = arr[i - 1] + 2 * arr[i - 2]
    }

    print(arr.joinToString(" "))
}