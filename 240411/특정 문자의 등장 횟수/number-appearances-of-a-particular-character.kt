import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val str = sc.next()
    var cnt1 = 0
    var cnt2 = 0

    for (i in 0 .. str.length - 2) {
        if ("${str[i]}${str[i + 1]}" == "ee") cnt1++
        if ("${str[i]}${str[i + 1]}" == "eb") cnt2++
    }

    print("$cnt1 $cnt2")
}