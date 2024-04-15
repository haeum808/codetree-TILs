import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    printNumbers(n)
}

fun printNumbers(n: Int) {
    if (n == 0) return

    print("$n ")
    printNumbers(n - 1)
    print("$n ")
}