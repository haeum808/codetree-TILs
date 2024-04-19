import java.util.Scanner
import kotlin.math.max

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val arr = IntArray(201)

    repeat(n) {
        val x1 = sc.nextInt()
        val x2 = sc.nextInt()

        ((x1 + 100)..(x2 + 100 - 1)).forEach { 
            arr[it]++
         }
    }

    print(arr.max())
}