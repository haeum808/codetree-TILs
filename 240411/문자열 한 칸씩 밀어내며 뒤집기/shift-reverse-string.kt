import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var str = sc.next()
    val q = sc.nextInt()

    repeat(q) {
        val command = sc.nextInt()

        if (command == 1) {
            str = str.slice(1..str.length - 1) + str.first()
        } else if (command == 2) {
            str = str.last() + str.slice(0..str.length - 2)
        } else {
            str = str.reversed()
        }

        println(str)
    }
}