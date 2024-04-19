import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val arr = Array(200_001) { "" }
    var curX = 0
    var curColor = "B"

    var w = 0
    var b = 0
    var g = 0

    repeat(n) {
        val x = sc.nextInt()
        val direction = sc.next()

        if (direction == "R") {
            ((curX + 100_000)..(curX + x + 100_000 - 1)).forEach {
                arr[it] += curColor
            }
            curX += x
        } else {
            ((curX - x + 100_000)..(curX + 100_000 - 1)).forEach {
                arr[it] += curColor
            }
            curX -= x
        }

        if (curColor == "W") curColor = "B"
        else curColor = "W"
    }

    arr.forEach { str ->
        if (str.length >= 4 && str.count { it == 'W' } >= 2 
        && str.count { it == 'B' } >= 2) {
            g++
        } else if (str.length >= 1) {
            when (str.last()) {
                'W' -> w++
                else -> b++
            }
        }
    }

    print("$w $b $g")
}