import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    var cur = n
    var cnt = 0
    
    while(true) {
        if (cur % 5 == 0) cnt++

        print("$cur ")

        if (cnt == 2) break

        cur += n
    }
}