import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    var result = 0
    val n = sc.nextInt()
    val arr2D = Array(n) { CharArray(n) }

    for(i in 0 until n) {
        val input = sc.next()

        for (j in 0 until n) {
            arr2D[i][j] = input[j]
        }
    }

    val dx = intArrayOf(1, 0, -1, 0)
    val dy = intArrayOf(0, -1, 0, 1)

    val target = sc.nextInt()

    var dirNum = 3
    var x = 0
    var y = 0

    for(i in 1 until target) {
        val nx = x + dx[dirNum]
        val ny = y + dy[dirNum]

        if(!inRange(n, nx, ny)) {
            dirNum = (dirNum + 1) % 4
            continue
        }

        x += dx[dirNum]
        y += dy[dirNum]
    }

    dirNum = findDir(n, target)

    while(true) {
        result++

        if (arr2D[x][y] == '\\') {
            when(dirNum) {
                0 -> dirNum = (dirNum + 3) % 4
                1 -> dirNum = (dirNum + 1) % 4
                2 -> dirNum = (dirNum + 3) % 4
                else -> dirNum = (dirNum + 1) % 4
            }
        } else if (arr2D[x][y] == '/') {
            when(dirNum) {
                0 -> dirNum = (dirNum + 1) % 4
                1 -> dirNum = (dirNum + 3) % 4
                2 -> dirNum = (dirNum + 1) % 4
                else -> dirNum = (dirNum + 3) % 4
            }
        }

        val nx = x + dx[dirNum]
        val ny = y + dy[dirNum]

        if(!inRange(n, nx, ny)) {
            break
        }

        x += dx[dirNum]
        y += dy[dirNum]
    }
    
    print(result)
}

fun findDir(n: Int, target: Int): Int {
    return (target - 1) / n
}

fun inRange(n: Int, x: Int, y: Int): Boolean {
    return (x in 0 until n) && (y in 0 until n)
}