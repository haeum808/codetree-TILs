import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    var sum = 0
    repeat(n) {
        sum += sc.nextInt()
    }

    print("$sum".slice(1.."$sum".length - 1) + "$sum"[0])
}