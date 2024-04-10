import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val (n, m) = sc.nextLine().trim().split(" ").map { it.toInt() }

    val arr2D = Array(n) { IntArray(m) }
    var cnt = 1

    for (i in 0..n-1) {
        for(j in 0..m-1) {
            arr2D[i][j] = cnt++
            print("${arr2D[i][j]} ")
        }
        println()
    }
}