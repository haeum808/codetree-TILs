import java.util.Scanner

var arr2D = Array(1) { CharArray(1) }
var r = 0
var c = 0

fun main() {
    val sc = Scanner(System.`in`)

    // 세로
    r = sc.nextInt()
    // 가로
    c = sc.nextInt()

    arr2D = Array(c) { CharArray(r) { sc.next()[0] } }

    print(count(arr2D[0][0]))
}

fun count(firstTarget: Char): Int {
    var result = 0

    val secondTarget = if (firstTarget == 'B') {
        'W'
    } else {
        'B'
    }

    for (i in 1 until c - 1) {
        for (j in 1 until r - 1) {
            for (k in 1 until c - 1) {
                var count = 0
                for (l in 1 until r - 1) {
                    if (
                        arr2D[i][j] == secondTarget &&
                        i < k && j < l && 
                        arr2D[k][l] == firstTarget
                        ) {
                        count++
                    }
                }
                result += count
            }
        }
    }

    return result
}