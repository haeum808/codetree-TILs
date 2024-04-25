import java.util.Scanner

fun main() {
    val sc =  Scanner(System.`in`)

    val n = sc.nextInt()
    val m = sc.nextInt()

    val arr2D = Array(n) { IntArray(n) }

    val dx = intArrayOf(1, -1, 0, 0)
    val dy = intArrayOf(0, 0, 1, -1)

    repeat(m) {
        val r = sc.nextInt() - 1
        val c = sc.nextInt() - 1

        arr2D[r][c] = 1

        var cnt = 0

        for (i in  0 until 4) {
            val nx = r + dx[i]
            val ny = c + dy[i]

            if (inRange(n, nx, ny) && arr2D[nx][ny] == 1) {
                cnt++
            }
        }

        if (cnt == 3) {
            println(1)
        } else {
            println(0)
        }
    }
}

fun inRange(n: Int, x: Int, y: Int): Boolean {
    return (x in 0 until n) && (y in 0 until n)
}