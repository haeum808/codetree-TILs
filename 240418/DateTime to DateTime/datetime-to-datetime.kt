import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()

    val result1 = (11 * 24 * 60) + (11 * 60) + 11
    val result2 = (a * 24 * 60) + (b * 60) + c

    if (result2 - result1 < 0) {
        print(-1)
    } else {
        print(result2 - result1)
    }
}