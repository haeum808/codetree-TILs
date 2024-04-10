import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val m = sc.nextInt()
    val arr2D = Array(n) { IntArray(m) }

    for (i in 0..n-1) {
        for (j in 0..m-1) {
            arr2D[i][j] = sc.nextInt()
        }
    }

    for (i in 0..n-1) {
        for (j in 0..m-1) {
            val num = sc.nextInt()

            if (arr2D[i][j] == num) {
                arr2D[i][j] = 0
            } else {
                arr2D[i][j] = 1
            }
            print("${arr2D[i][j]} ")
        }
        println()
    } 
}