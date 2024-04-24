import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    var result = 0
    val arr2D = Array(n) { IntArray(n) { sc.nextInt() } }

    val dx = intArrayOf(1, 0, -1, 0)
    val dy = intArrayOf(0, 1, 0, -1)

    for (i in 0 until n) {
        for (j in 0 until n) {
            var cnt = 0

            for (k in 0 until 4) {
                val nx = i + dx[k]
                val ny = j + dy[k]

                if (inRange(n ,nx, ny) && arr2D[nx][ny] == 1) {
                    cnt++
                }
            }

            if (cnt >= 3) result++
        }
    }

    print(result)
}

fun inRange(n: Int, x: Int, y: Int): Boolean {
    return (x in 0 until n) && (y in 0 until n)
}