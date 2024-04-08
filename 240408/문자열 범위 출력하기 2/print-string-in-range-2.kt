import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val input = sc.nextLine().reversed()
    val count = sc.next().toInt()

    if (input.length < count) {
        print(input)
    } else {
        print(input.slice(0..count - 1))
    }
}