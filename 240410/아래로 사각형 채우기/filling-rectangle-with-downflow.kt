import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var cnt = 1
    val n = sc.nextInt()
    val arr2D = Array(n) { IntArray(n) }

    for (i in 0..n - 1) {
        for (j in 0..n - 1) {
            arr2D[j][i] = cnt++
        }
    }

    for (i in 0..n - 1) {
        for (j in 0..n - 1) {
            print("${arr2D[i][j]} ")
        }
        println()
    }
}