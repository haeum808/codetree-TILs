import java.util.Scanner

var arr = IntArray(1)

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val m = sc.nextInt()
    arr = IntArray(n) { sc.nextInt() }

    repeat(m) {
        val a = sc.nextInt()
        val b = sc.nextInt()

        println(sum(a, b))
    }
}

fun sum(a: Int, b: Int): Int {
    return (a..b).map { arr[it - 1] }.sum()
}