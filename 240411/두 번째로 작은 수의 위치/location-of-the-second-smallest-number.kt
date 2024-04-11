import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    sc.nextLine()
    val numbers = sc.nextLine().trim().split(" ").map { it.toInt() }.sorted()
    
    if (numbers.indexOf(numbers[1]) == numbers.lastIndexOf(numbers[1])) {
        print(numbers.indexOf(numbers[1]) + 1)
    } else {
        print(-1)
    }
}