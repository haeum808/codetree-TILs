import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var a = sc.next()
    val b = sc.next()
    var cnt = 0

    while(cnt <= a.length - 1) {
        if (a == b) break

        a = a.slice(1..a.length - 1) + a[0]

        cnt++
    }

    if (cnt > a.length) {
        print(-1)
    } else {
        print(cnt)
    }
}