import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    sc.nextLine()
    val numbers = sc.nextLine().trim().split(" ").map { it.toInt() }
    val set = numbers.toSortedSet()
    var secondMin = 0
    
    if (set.size == 1) {
        print(-1)
        return
    } else {
        secondMin = set.take(2)[1]
    }
    
    if (numbers.indexOf(secondMin) == numbers.lastIndexOf(secondMin)) {
        print(numbers.indexOf(secondMin) + 1)
    } else {
        print(-1)
    }
}