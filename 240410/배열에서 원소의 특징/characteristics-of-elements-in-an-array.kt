import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val arr = sc.nextLine().trim().split(" ").map { it.toInt() }

    for (i in 0..9) {
        if (arr[i] % 3 == 0) {
            print(arr[i - 1])
            break
        }
    }
}