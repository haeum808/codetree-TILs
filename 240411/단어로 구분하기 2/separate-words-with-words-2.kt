import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var i = 0

    while (sc.hasNext()) {
        if (i++ % 2 == 0) {
            println(sc.next())
        } else {
            sc.next()
        }
    }
}