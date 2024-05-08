import java.util.Scanner

var arr2D = Array(1) { CharArray(1) }
var r = 0
var c = 0

fun main() {
    val sc = Scanner(System.`in`)

    // 세로변
    r = sc.nextInt()
    // 가로변
    c = sc.nextInt()

    arr2D = Array(r) { CharArray(c) { sc.next()[0] } }

    if (arr2D[0][0] == 'W' && arr2D[r - 1][c - 1] == 'B') {
        print(count('W'))
    } else if (arr2D[0][0] == 'B' && arr2D[r - 1][c - 1] == 'W') {
        print(count('B'))
    } else {
        print(0)
    }
}

fun count(secondTarget: Char): Int {
    var result = 0

    val firstTarget = if (secondTarget == 'B') {
        'W'
    } else {
        'B'
    }

    for (i in 1 until r - 1) {
        var count = 0

        for (j in 1 until c - 1) {
            if (arr2D[i][j] == firstTarget) count++ else continue

            for (k in 1 until r - 1) {
                
                for (l in 1 until c - 1) {
                    if (i < k && j < l && arr2D[k][l] == secondTarget) {
                        
                        if (count == 1) {
                            result++
                        }
                    }
                }
            }
        }
    }

    return result
}