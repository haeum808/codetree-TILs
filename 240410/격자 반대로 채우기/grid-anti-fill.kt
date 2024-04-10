import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val arr2D = Array(n) { IntArray(n) }
    var isUp = true
    var cnt = 1

    for (i in n - 1 downTo 0) {
        if (isUp) {
            for (j in n - 1 downTo 0) {
                arr2D[j][i] = cnt++
            }
        } else {
            for (j in 0 .. n - 1) {
                arr2D[j][i] = cnt++
            }
        }
        isUp = !isUp
    }

    for (i in 0 .. n - 1) {
        for (j in 0 .. n - 1) {
            print("${arr2D[i][j]} ")
        }
        println()
    }
}