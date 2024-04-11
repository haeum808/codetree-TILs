import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var a = sc.next()
    val commands = sc.next()

    for (command in commands) {
        if (command == 'L') {
            a = a.slice(1..a.length - 1) + a.first()
        } else {
            a = a.last() + a.slice(0..a.length - 2)
        }
    }

    print(a)
}