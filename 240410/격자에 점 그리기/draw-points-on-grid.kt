import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val m = sc.nextInt()

    val arr2D = Array(n) { IntArray(n) }
    var cnt = 1

    repeat(m) {
        val a = sc.nextInt()
        val b = sc.nextInt()

        arr2D[a - 1][b - 1] = cnt++
    }

    for (i in 0..n - 1) {
        for (j in 0..n - 1) {
            print("${arr2D[i][j]} ")
        }
        println()
    }
}