import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.next()

    if (countTwo(a)) print("Yes") else print("No")
}

fun countTwo(a: String): Boolean {
    return a.groupBy { it }.values.any { it.size >= 2 }
}