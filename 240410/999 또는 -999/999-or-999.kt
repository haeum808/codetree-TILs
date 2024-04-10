import java.util.Scanner
import kotlin.math.max
import kotlin.math.min

fun main() {
    val sc = Scanner(System.`in`)
    
    var min = sc.nextInt()
    var max = sc.nextInt()

    while(true) {
        val num = sc.nextInt()

        if (num == 999 || num == -999) break

        min = min(min, num)
        max = max(max, num)
    }

    print("$max $min")
}