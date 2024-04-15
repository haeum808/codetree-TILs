import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    print(calculate(n, 0))
}

fun calculate(n: Int, cnt: Int): Int {
    if (n == 1) {
        return cnt
    }

    if (n % 2 == 0) {
        return calculate(n / 2, cnt + 1)
    } else {
        return calculate(n / 3, cnt + 1)
    }
}