import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val str = sc.next()
    val target = sc.next()
    var cnt = 0

    for (i in 0 .. str.length - 2) {
        if ("${str[i]}${str[i + 1]}" == target) cnt++
    }

    print(cnt)
}