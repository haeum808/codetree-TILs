import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var (a, b) = sc.nextLine().trim().split(" ").map { it.toInt() }

    print("0.")
    repeat(20) {
        print("${a * 10 / b}")
        a = a * 10 % b
    }
}