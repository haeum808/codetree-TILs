import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val m = sc.nextInt()

    val arr2D = Array(n) { CharArray(m) }

    var dirNum = 0

    val dx = intArrayOf(0, 1, 0, -1)
    val dy = intArrayOf(1, 0, -1, 0)

    var x = 0
    var y = 0

    arr2D[x][y] = 'A'

    var curAlphabet = 'A'

    for (i in 1 until n * m) {
        val nx = x + dx[dirNum]
        val ny = y + dy[dirNum]

        if (!inRange(n, m, nx, ny) || arr2D[nx][ny] in 'A'..'Z') {
            dirNum = (dirNum + 1) % 4
        }

        x += dx[dirNum]
        y += dy[dirNum]

        curAlphabet = (65 + (i % 26)).toChar()
        arr2D[x][y] = curAlphabet
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