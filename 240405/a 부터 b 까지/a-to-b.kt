import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var (a, b) = sc.nextLine().trim().split(" ").map { it.toInt() }

    for (i in a..b) {
        if (a > b) break

        print("$a ")

        if (i % 2 != 0) {
            a *= 2
        } else {
            a += 3
        }
    }
}