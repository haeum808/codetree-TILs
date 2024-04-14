import java.util.Scanner

var str1 = ""
var str2 = ""

fun main() {
    val sc = Scanner(System.`in`)

    str1 = sc.next()
    str2 = sc.next()

    print(find())
}

fun find(): Int {
    return str1.indexOf(str2)
}