import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    print(factorial(n))
}

fun factorial(n: Int): Int {
    if (n == 1) return 1

    return n * factorial(n - 1)
}