import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val atime = IntArray(1_000_001) { 1_000_001 }
    val btime = IntArray(1_000_001) { 1_000_001 }
    var aIndex = 1
    var bIndex = 1
    var result = 0

    var curA = 0
    var curB = 0

    val n = sc.nextInt()
    val m = sc.nextInt()

    repeat(n) {
        val t = sc.nextInt()
        val d = sc.next()

        if (d == "R") {
            for (i in curA + 1 until curA + 1 + t) {
                atime[aIndex++] = i
            }
            curA += t
        } else {
            for (i in curA - 1 downTo curA - t) {
                atime[aIndex++] = i
            }
            curA -= t
        }
    }

    while(aIndex != 1_000_001) {
        atime[aIndex++] = curA
    }


    repeat(m) {
        val t = sc.nextInt()
        val d = sc.next()

        if (d == "R") {
            for (i in curB + 1 until curB + 1 + t) {
                btime[bIndex++] = i
            }
            curB += t
        } else {
            for (i in curB - 1 downTo curB - t) {
                btime[bIndex++] = i
            }
            curB -= t
        }
    }

    while(bIndex != 1_000_001) {
        btime[bIndex++] = curB
    }

    for (i in 1..1_000_000) {
        if (atime[i - 1] != btime[i - 1] && atime[i] == btime[i]) {
            result++
        }

        if (atime[i] == 1_000_001 && btime[i] == 1_000_001) break
    }

    print(result)
}