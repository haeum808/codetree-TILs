import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.next()

    if (palindrome(a)) print("Yes") else print("No")
}

fun palindrome(a: String): Boolean {
    for(i in 0 until a.length / 2) {
        if (a[i] != a[a.length -1 - i]) return false
    }

    return true
}