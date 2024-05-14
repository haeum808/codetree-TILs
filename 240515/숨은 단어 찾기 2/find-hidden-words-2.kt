import java.util.Scanner

var n = 0
var m = 0

val dx = intArrayOf(1, -1, 0, 0, 1, 1, -1, -1)
val dy = intArrayOf(0, 0, 1, -1, 1, -1,1, -1)

fun main() {
    val sc = Scanner(System.`in`)

    n = sc.nextInt()
    m = sc.nextInt()

    val arr2D = Array(n) { sc.next().toList() }
    var result = 0

    for (i in 0 until n) {
        for (j in 0 until m) {
            if (arr2D[i][j] == 'L') {
                for (k in 0 until 8) {
                    val nx1 = i + dx[k]
                    val ny1 = j + dy[k]
                    val nx2 = i + dx[k] * 2
                    val ny2 = j + dy[k] * 2

                    if (inRange(nx1, ny1) && (inRange(nx2, ny2))) {
                        if (arr2D[nx1][ny1] == 'E' && arr2D[nx2][ny2] == 'E') {
                            result++
                        }
                    }
                }
            }
        }
    }

    print(result)
}

fun inRange(x: Int, y: Int): Boolean {
    return (x in 0 until n) && (y in 0 until m)
}