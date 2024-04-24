import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val m = sc.nextInt()

    val arr2D = Array(n) { IntArray(m) }

    var dirNum = 0

    var x = 0
    var y = 0

    val dx = intArrayOf(0, 1, 0, -1)
    val dy = intArrayOf(1, 0, -1, 0)

    arr2D[0][0] = 1

    for (i in 2 .. n * m) {
        val nx = x + dx[dirNum]
        val ny = y + dy[dirNum]

        if(!inRange(n, m, nx, ny) || arr2D[nx][ny] != 0) {
            dirNum = (dirNum + 1) % 4
        }

        x = x + dx[dirNum]
        y = y + dy[dirNum]
        arr2D[x][y] = i
    }


    for (i in 0 until n) {
        for (j in 0 until m) {
            print("${arr2D[i][j]} ")
        }
        println()
    }
}

fun inRange(n: Int, m: Int, x: Int, y: Int): Boolean {
    return (x in 0 until n) && (y in 0 until m)
}