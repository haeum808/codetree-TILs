import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val commands = sc.next()
    var dirNum = 3
    var result = 0
    var x = 0
    var y = 0
    val dx = intArrayOf(1, 0, -1, 0)
    val dy = intArrayOf(0, -1, 0, 1)

    for (command in commands) {
        result++

        when(command) {
            'F' -> { 
                x += dx[dirNum]
                y += dy[dirNum]

                if (x == 0 && y == 0) {
                    print(result)
                    return
                }
            }
            'L' -> { dirNum = (dirNum + 3) % 4 }
            'R' -> { dirNum = (dirNum + 1) % 4 }
        }
    }

    print(-1)
}