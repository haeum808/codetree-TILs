import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    print(fibo(n))
}

fun fibo(n: Int): Int {
    if (n == 0) return 0
    if (n == 1) return 1

    return fibo(n - 1) + fibo(n - 2)
}