import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val arr2D = Array(2001) { IntArray(2001) }
    val (ax1, ay1, ax2, ay2) = sc.nextLine().trim().split(" ").map { it.toInt() }
    val (bx1, by1, bx2, by2) = sc.nextLine().trim().split(" ").map { it.toInt() }
    val (mx1, my1, mx2, my2) = sc.nextLine().trim().split(" ").map { it.toInt() }
    var cnt = 0

    for (i in ax1 + 1000..ax2 + 1000 - 1) {
        for (j in ay1 + 1000..ay2 + 1000 - 1) {
            arr2D[i][j] = 1
        }
    }
    for (i in bx1 + 1000..bx2 + 1000 - 1) {
        for (j in by1 + 1000..by2 + 1000 - 1) {
            arr2D[i][j] = 1
        }
    }
    for (i in mx1 + 1000..mx2 + 1000 - 1) {
        for (j in my1 + 1000..my2 + 1000 - 1) {
            arr2D[i][j] = 2
        }
    }

    for (i in 0..2000) {
        for (j in 0..2000) {
            if (arr2D[i][j] == 1) {
                cnt++
            }
        }
    }

    print(cnt)
}