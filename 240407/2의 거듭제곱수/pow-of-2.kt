import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var x = sc.nextInt()
    var cnt = 0

    while(x != 1) {
        x /= 2
        cnt++
    }
    
    print(cnt)
}