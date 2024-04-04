import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val (a, b) = sc.nextLine().trim().split(" ").map { it.toInt() }

    if (a <= 0) {
        print(0)
    } else {
        repeat(b) {
            print(a)
        }
    }
}