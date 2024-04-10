import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val m = sc.nextInt()
    val arr2D = Array(n) { IntArray(m) }
    var cnt = 0

    for (i in 0..m - 1) {
        if (i % 2 == 0) {
            for (j in 0..n - 1) {
                arr2D[j][i] = cnt++
            }
        } else {
            for (j in n - 1 downTo 0) {
                arr2D[j][i] = cnt++
            }
        }
    }

    for (i in 0..n-1){
        for (j in 0..m-1) {
            print("${arr2D[i][j]} ")
        }
        println()
    }
}