import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var a = sc.next()
    val b = sc.next()
    var cnt = 0

    while(cnt <= a.length - 1) {
        if (a == b) break

        a = a.last() + a.slice(0..a.length - 2)

        cnt++
    }

    if (cnt in 0..a.length - 1) {
        print(cnt)
    } else {
        print(-1)
    }
}