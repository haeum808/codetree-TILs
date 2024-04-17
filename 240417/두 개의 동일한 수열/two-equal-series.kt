import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val numbers1 = IntArray(n) { sc.nextInt() }.toSet()
    val numbers2 = IntArray(n) { sc.nextInt() }.toSet()

    if (numbers1 == numbers2) {
        print("Yes")
    } else {
        print("No")
    }
}