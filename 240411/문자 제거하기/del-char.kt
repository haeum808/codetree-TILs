import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    var str = sc.next()

    while(str.length > 1) {
        val num = sc.nextInt()

        if (num >= str.length) {
            str = str.slice(0..str.length - 2)
        } else if (num == 1) {
            str = str.slice(1..str.length - 1)
        } else {
            str = str.slice(0..num - 1) + str.slice(num + 1..str.length - 1)
        }

        println(str)
    }
}