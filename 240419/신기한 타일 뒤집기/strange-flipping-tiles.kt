import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var whiteCount = 0
    var blackCount = 0

    val n = sc.nextInt()
    val tiles = CharArray(200_001)
    var curX = 0

    repeat(n) {
        val x = sc.nextInt()
        val direction = sc.next()

        if (direction == "R") {
            ((curX + 100_000)..(curX + (x - 1) + 100_000)).forEach {
                tiles[it] = 'B'
            }
            curX += (x - 1)
        } else {
            ((curX + (-x + 1) + 100_000)..(curX + 100_000)).forEach {
                tiles[it] = 'W'
            }
            curX += (-x + 1)
        }
    }

    tiles.forEach {
        if (it == 'B') {
            blackCount++
        } else if (it == 'W') {
            whiteCount++
        }
    }

    print("$whiteCount $blackCount")
}