import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var dirNum = 3
    val dx = intArrayOf(0, 1, 0, -1)
    val dy = intArrayOf(1, 0, -1, 0)

    val n = sc.nextInt()
    val t = sc.nextInt()
    val commands = sc.next()

    var x = n / 2
    var y = n / 2

    val arr2D = Array(n) { IntArray(n) { sc.nextInt() } }
    var result = arr2D[x][y]

    for (command in commands) {
        when (command) {
            'L' -> {
                dirNum = (dirNum + 3) % 4
            }
            'R' -> {
                dirNum = (dirNum + 1) % 4
            }
            else -> {
                val nx = x + dx[dirNum]
                val ny = y + dy[dirNum]

                if (inRange(n, nx, ny)) {
                    result += arr2D[nx][ny]
                    x = nx
                    y = ny
                }
            }
        }
    }

    print(result)
}

fun inRange(n: Int, x: Int, y: Int): Boolean {
    return (x in 0 until n) && (y in 0 until n)
}