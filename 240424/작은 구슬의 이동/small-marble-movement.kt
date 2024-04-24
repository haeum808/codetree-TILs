import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val dx = intArrayOf(1, 0, 0, -1)
    val dy = intArrayOf(0, 1, -1, 0)

    val n = sc.nextInt()
    var t = sc.nextInt()
    
    var r = sc.nextInt()
    var c = sc.nextInt()
    val d = sc.next()[0]

    var dirNum = getDir(d)

    while(t != 0) {
        val ry = r + dy[dirNum]
        val cx = c + dx[dirNum]

        if (inRange(n, ry, cx)) {
            r = ry
            c = cx
        } else {
            dirNum = 3 - dirNum
        }

        t--
    }

    print("$r $c")
}

fun inRange(n: Int, x: Int, y: Int): Boolean {
    return (x in 1..n) && (y in 1..n)
}

fun getDir(direction: Char): Int {
    return when (direction) {
        'R' -> { 0 }
        'D' -> { 1 }
        'U' -> { 2 }
        else -> { 3 }
    }
}