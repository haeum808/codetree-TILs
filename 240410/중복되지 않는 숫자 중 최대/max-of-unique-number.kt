import java.util.Scanner
import kotlin.math.max

fun main() {
    val sc = Scanner(System.`in`)
    
    val n = sc.nextLine().trim().toInt()
    var numbers = IntArray(1001)
    var max = -1

    repeat(n) {
        numbers[sc.nextInt()]++
    }

    numbers.forEachIndexed { index, value ->
        if (value == 1) {
            max = max(max, index)
        }
    }

    print(max) 
}