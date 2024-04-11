import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    var sum = 0

    while(sc.hasNext()) {
        sum += sc.next().length
    }

    print(sum)
}