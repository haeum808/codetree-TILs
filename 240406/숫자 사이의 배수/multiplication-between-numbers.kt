import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val (a, b) = sc.nextLine().trim().split(" ").map { it.toInt() }
    var count = 0
    var sum = 0

    for (i in a..b) {
        if (i % 5 == 0 || i % 7 == 0) {
            count++
            sum += i
        }
    }

    print("$sum ")
    print("%.1f".format(sum / count.toDouble()))
}