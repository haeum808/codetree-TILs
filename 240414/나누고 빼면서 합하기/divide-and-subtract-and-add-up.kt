import java.util.Scanner

var n = 0
var m = 0

fun main() {
    val sc = Scanner(System.`in`)

    n = sc.nextInt()
    m = sc.nextInt()
    val a = Array(n) { sc.nextInt() }

    change(a)

    print(n)
}

fun change(a: Array<Int>) {
    while(m > 1) {
        n += a[m - 1]

        if (m % 2 != 0) {
            m -= 1
        } else {
            m /= 2
        }
    }
}