import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val arr2D = Array(5) { IntArray(5) }

    for (i in 0..4) {
        arr2D[i][0] = 1
        arr2D[0][i] = 1 
    }

    for (i in 1..4) {
        for (j in 1..4) {
            arr2D[i][j] = arr2D[i - 1][j] + arr2D[i][j - 1]
        }
    }

    for (i in 0..4) {
        for (j in 0..4) {
            print("${arr2D[i][j]} ")
        }
        println()
    }
}