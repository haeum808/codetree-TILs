import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var aTime = IntArray(1001)
    var aTimeIndex = 1
    var aCur = 0
    var bTime = IntArray(1001)
    var bTimeIndex = 1
    var bCur = 0
    var result = -1

    val n = sc.nextInt()
    val m = sc.nextInt()

    repeat(n) {
        val direction = sc.next()
        val distance = sc.nextInt()

        if (direction == "R") {
            for (i in aCur + 1 until aCur + 1 + distance) {
                aTime[aTimeIndex++] = i
            }
            aCur = aCur + distance
        } else {
            for (i in aCur - 1 downTo aCur - distance) {
                aTime[aTimeIndex++] = i
            }
            aCur = aCur - distance
        }
    }

    repeat(m) {
        val direction = sc.next()
        val distance = sc.nextInt()

        if (direction == "R") {
            for (i in bCur + 1 until bCur + 1 + distance) {
                bTime[bTimeIndex++] = i
            }
            bCur = bCur + distance
        } else {
            for (i in bCur - 1 downTo bCur - distance) {
                bTime[bTimeIndex++] = i
            }
            bCur = bCur - distance
        }
    }

    for (i in 1..1000) {
        if (aTime[i] == bTime[i]) {
            result = i
            break
        }
    }
    println(result)
}