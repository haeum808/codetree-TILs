import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val arr2D = Array(2001) { IntArray(2001) }

    val (ax1, ay1, ax2, ay2) = sc.nextLine().trim().split(" ").map { it.toInt() }
    val (bx1, by1, bx2, by2) = sc.nextLine().trim().split(" ").map { it.toInt() }
    var minX = Int.MAX_VALUE
    var maxX = Int.MIN_VALUE
    var minY = Int.MAX_VALUE
    var maxY = Int.MIN_VALUE

    for (i in ax1 + 1000 until ax2 + 1000) {
        for (j in ay1 + 1000 until ay2 + 1000) {
            arr2D[i][j] = 1
        }
    }

    for (i in bx1 + 1000 until bx2 + 1000) {
        for (j in by1 + 1000 until by2 + 1000) {
            arr2D[i][j] = 2
        }
    }

    for (i in 0 .. 2000) {
        for (j in 0 .. 2000) {
            if (arr2D[i][j] == 1) {
                if (i < minX) {
                    minX = i
                }
                if (i > maxX) {
                    maxX = i
                }
                if (j < minY) {
                    minY = j
                }
                if (j > maxY) {
                    maxY = j
                }
            }
        }
    }

    val result = (maxX + 1 - minX) * (maxY + 1 - minY)

    print(result)
}