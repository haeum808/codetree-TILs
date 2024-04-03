import java.util.Scanner
import kotlin.math.max

fun main() {
    val sc = Scanner(System.`in`)

    val numbers = sc.nextLine().split(" ").map { it.toInt() }
    
    print(numbers.max())
}