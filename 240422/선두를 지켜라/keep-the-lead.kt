import java.util.Scanner
import kotlin.math.max

fun main() {
    val sc = Scanner(System.`in`)


    val aDistances = IntArray(1_000_001)
    val bDistances = IntArray(1_000_001)
    var aIndex = 1
    var bIndex = 1
    var curA = 0
    var curB = 0

    val n = sc.nextInt()
    val m = sc.nextInt()

    repeat(n) {
        val v = sc.nextInt()
        val t = sc.nextInt()

        for (i in aIndex until aIndex + t) {
            aDistances[aIndex++] = curA + v
            curA += v
        }
    }

    repeat(m) {
        val v = sc.nextInt()
        val t = sc.nextInt()

        for (i in bIndex until bIndex + t) {
            bDistances[bIndex++] = curB + v
            curB += v
        }
    }

    var head = if (aDistances[0] > bDistances[0]) {
        "A"
    }  else {
        "B"
    }
    var cnt = 0

    for (i in 1..1_000_000) {
        if (aDistances[i] == 0 && bDistances[i] == 0) break

        if (head == "A" && bDistances[i] > aDistances[i]) {
            cnt++
            head = "B"
        } else if (head == "B" && aDistances[i] > bDistances[i]) {
            cnt++
            head = "A"
        }
    }

    print(cnt)
}