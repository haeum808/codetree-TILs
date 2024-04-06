import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    var sum = 0

    (1..n-1).forEach { if (n % it == 0) sum += it }

    if (sum == n) {
        print("P")
    } else {
        print("N")
    }
}