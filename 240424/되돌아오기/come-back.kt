import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var cnt = 0
    val n = sc.nextInt()
    var x = 0
    var y = 0

    val dx = intArrayOf(1, 0, -1, 0)
    val dy = intArrayOf(0, -1, 0, 1)

    repeat(n) {
        val direction = sc.next()[0]
        val distance = sc.nextInt()
        val dirNum = getDir(direction)

        repeat(distance) {
            cnt++

            x += dx[dirNum]
            y += dy[dirNum]

            if (x == 0 && y == 0) {
                print(cnt)
                return
            }
        }
    }

    print(-1)
}

fun getDir(direction: Char): Int {
    return when(direction) {
        'E' -> { 0 }
        'S' -> { 1 }
        'W' -> { 2 }
        else -> { 3 }
    }
}