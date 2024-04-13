import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    if (isMagicNumbers(n)) {
        print("Yes")
    } else {
        print("No")
    }
}

fun isMagicNumbers(i: Int): Boolean {
    if (i % 2 == 0 && (i / 10 + i % 10) % 5 == 0) {
        return true
    } else {
        return false
    }
}