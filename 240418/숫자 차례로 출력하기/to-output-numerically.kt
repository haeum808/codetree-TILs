import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    
    printSorted(n)
    println()
    printSortedDescending(n)
}

fun printSortedDescending(n: Int) {
    if (n == 0) {
        return
    }

    print("$n ")
    printSortedDescending(n - 1)
}

fun printSorted(n: Int) {
    if (n == 0) {
        return
    }

    printSorted(n - 1)
    print("$n ")
}