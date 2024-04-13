import java.util.Scanner
import kotlin.math.min

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val m = sc.nextInt()

    gcd(n, m)    
}

fun gcd(n: Int, m: Int) {
    val min = min(n, m)

    for(i in n downTo 1) {
        if (n % i == 0 && m % i == 0) {
            print(i)
            break
        }
    }
}