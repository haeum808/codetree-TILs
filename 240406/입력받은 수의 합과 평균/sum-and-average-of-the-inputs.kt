import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    var sum = 0

    repeat(n) {
        sum += sc.nextInt()
    }

    print("$sum ")
    print("%.1f".format(sum / n.toDouble()))
}