import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextLine().trim().toInt()
    var numbers = sc.nextLine().trim().split(" ").map { it.toInt() }

    var max = numbers.max()
    var index = numbers.indexOf(max)

    print("${index + 1} ")

    while(index != 0) {
        numbers = numbers.slice(0..index - 1)

        max = numbers.max()
        index = numbers.indexOf(max)

        print("${index + 1} ")
    }
}