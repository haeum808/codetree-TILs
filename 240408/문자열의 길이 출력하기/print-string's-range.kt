import java.util.Scanner 

fun main() {
    val sc = Scanner(System.`in`)
    var total = 0

    repeat(2) {
        total += sc.next().length
    }

    print(total)
}