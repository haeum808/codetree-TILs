import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val strs = Array(n) { "" }

    repeat(n) {
        strs[it] = sc.next()
    }

    val target = sc.next()

    var sum = 0
    var cnt = 0

    for (str in strs) {
        if (str.startsWith(target)) {
            sum += str.length
            cnt++
        }
    }

    print("$cnt ${"%.2f".format(sum / cnt.toDouble())}")
}