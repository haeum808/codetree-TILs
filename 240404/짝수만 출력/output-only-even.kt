import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var (a, b) = sc.nextLine().trim().split(" ").map { it.toInt() }

    while (a <= b) {
        if (a % 2 == 0) {
            print("$a ")
        }
        a++
    }
}