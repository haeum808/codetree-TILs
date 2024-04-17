import java.util.Scanner

var array = IntArray(1)

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    array = IntArray(n) { sc.nextInt() }

    print(lca(n - 1))
}

fun lca(n: Int): Int {
    if (n == 0) {
        return array[n]
    }

    return (array[n] * lca(n - 1)) / gcd(array[n], lca(n - 1))
}

fun gcd(a: Int, b: Int): Int {
    if (a % b == 0) {
        return b
    }
    return gcd(b, a % b)
}