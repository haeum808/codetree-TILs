import java.util.Scanner
import kotlin.math.max

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val m = sc.nextInt()

    lca(n, m)
}

fun lca(n: Int, m: Int) {
    var cnt = max(n, m)

    while(true) {
        if (cnt % n == 0 && cnt % m == 0) {
            print(cnt)
            break
        }
        cnt++
    }
}