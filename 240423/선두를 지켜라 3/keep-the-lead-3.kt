import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var result = 0

    val n = sc.nextInt()
    val m = sc.nextInt()

    val aTime = IntArray(1_000_001)
    val bTime = IntArray(1_000_001)

    var aIndex = 1
    var bIndex = 1

    var curA = 0
    var curB = 0

    repeat(n) {
        val v = sc.nextInt()
        val t = sc.nextInt()

        repeat(t) {
            aTime[aIndex++] = curA + v
            curA += v
        }
    }

    repeat(m) {
        val v = sc.nextInt()
        val t = sc.nextInt()
        
        repeat(t) {
            bTime[bIndex++] = curB + v
            curB += v
        }
    }

    var winner = if (aTime[1] == bTime[1]) {
        "AB"
    } else if (aTime[1] > bTime[1]) {
        "A"
    } else {
        "B"
    }

    for (i in 1..1_000_000) {
        if (winner == "A") {
            if (aTime[i] == bTime[i]) {
                winner = "AB"
                result++
            } else if (bTime[i] > aTime[i]) {
                winner = "B"
                result++
            }
        } else if (winner == "B") {
            if (aTime[i] == bTime[i]) {
                winner = "AB"
                result++
            } else if (aTime[i] > bTime[i]) {
                winner = "A"
                result++
            }
        } else if (winner == "AB") {
            if (aTime[i] > bTime[i]) {
                winner = "A"
                result++
            } else if (bTime[i] > aTime[i]) {
                winner = "B"
                result++
            }
        }
    }

    print(result)
}