import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val arr2D = Array(n) { IntArray(n) }

    for (i in 0..n - 1) {
        arr2D[i][0] = 1
        arr2D[0][i] = 1
    }

    for (i in 1..n-1) {
        for (j in 1..n-1) {
            arr2D[i][j] = arr2D[i - 1][j] + arr2D[i - 1][j - 1] + arr2D[i][j - 1]
        }
    }

    for (i in 0..n-1) {
        for (j in 0..n-1) {
            print("${arr2D[i][j]} ")
        }
        println()
    }
}