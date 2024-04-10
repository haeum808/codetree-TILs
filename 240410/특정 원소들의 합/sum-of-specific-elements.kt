import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val arr = Array(4) { sc.nextLine().trim().split(" ").map { it.toInt() } }
    var sum = 0

    for (i in 0..3) {
        for (j in 0..3) {
            if (i >= j) sum += arr[i][j]
        }
    }
    
    print(sum)
}