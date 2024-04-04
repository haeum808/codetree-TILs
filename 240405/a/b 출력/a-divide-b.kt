import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var (a, b) = sc.nextLine().trim().split(" ").map { it.toDouble() }

    print("%.20f".format(a / b))
}