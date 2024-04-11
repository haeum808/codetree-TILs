import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var str = sc.next()
    val target = sc.next()

    while(true) {
        val beforeLength = str.length

        str = str.replace(target, "")

        if (beforeLength == str.length) break
    }

    print(str)
}