import java.util.Scanner

fun main() { 
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    val arr2D = Array(n) { IntArray(n) }
    var dirNum = 2

    var x = n - 1
    var y = n - 1

    arr2D[x][y] = n * n

    val dx = intArrayOf(0, 1, 0, -1)
    val dy = intArrayOf(1, 0, -1, 0)

    for (i in n * n - 1 downTo 1) {
        val nx = x + dx[dirNum]
        val ny = y + dy[dirNum]

        if (!inRange(n, nx, ny) || arr2D[nx][ny] != 0) {
            dirNum = (dirNum + 1) % 4
        }

        x += dx[dirNum]
        y += dy[dirNum]

        arr2D[x][y] = i
    }

    for (i in 0 until n) {
        for (j in 0 until n) {
            print("${arr2D[i][j]} ")
        }
        println()
    }
}

fun inRange(n: Int, x: Int, y: Int): Boolean {
    return (x in 0 until n) && (y in 0 until n)
}