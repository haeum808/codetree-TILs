import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    var dirNum = 0

    var x = 0
    var y = 0

    val dx = intArrayOf(0, 1, 0, -1)
    val dy = intArrayOf(1, 0, -1, 0)

    val commands = sc.next()

    for (i in 0 until commands.length) {
        when (commands[i]) {
            'L' -> { dirNum = (dirNum - 1 + 4) % 4 }
            'R' -> { dirNum = (dirNum + 1) % 4 }
            else -> { 
                x += dx[dirNum] 
                y += dy[dirNum]
            }
        }
    }

    print("$x $y")
}