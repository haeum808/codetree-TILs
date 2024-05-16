import java.util.Scanner
import kotlin.math.max

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val numbers = IntArray(n) { sc.nextInt() }
    var result = -1

    for (i in 0 until n) {
        for (j in i + 1 until n) {
            for (k in j + 1 until n) {
                var isCarry = false

                val a = "${numbers[i]}".reversed()
                val b = "${numbers[j]}".reversed()
                val c = "${numbers[k]}".reversed()

                for (m in 0 until 5) {
                    var sum = 0

                    if (a.length > m) {
                        sum += "${a[m]}".toInt()
                    }
                    if (b.length > m) {
                        sum += "${b[m]}".toInt()
                    }
                    if (c.length > m) {
                        sum += "${c[m]}".toInt()
                    }


                    if (sum >= 10) {
                        isCarry = true
                        break
                    }

                    sum = 0
                }

                if (!isCarry) {
                    result = max(result, a.reversed().toInt() + b.reversed().toInt() + c.reversed().toInt())
                }
            }
        }
    }

    print(result)
}