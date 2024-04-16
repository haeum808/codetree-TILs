import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    print(sum(n, 0))
}

fun sum(n: Int, cnt: Int): Int {
    if (n == 1) {
        return cnt
    }

    if (n % 2 == 0) {
        return sum(n / 2, cnt + 1)
    } else {
        return sum(n * 3 + 1, cnt + 1)
    }
}