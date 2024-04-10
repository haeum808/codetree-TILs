import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val m = sc.nextInt()
    val arr2D = Array(n) { IntArray(m) }
    var cnt = 1
    var i = 0
    var j = 0
    var curI = 1
    var curJ = 1

    while(cnt <= n * m) {
        arr2D[i][j] = cnt++

        i++
        j--

        if (!(i in (0..n - 1)) || !(j in (0..m - 1))) {
            if (curJ <= m - 1) {
                i = 0
                j = curJ++
            } else {
                i = curI++
                j = curJ - 1 
            }
        }
    }
    
    for (i in 0..n - 1) {
        for (j in 0..m - 1) {
            print("${arr2D[i][j]} ")
        }
        println()
    }
}