import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    print(calculate(2,4,n))
}

fun calculate(num1: Int, num2: Int,cnt: Int): Int {
    if (cnt == 1) {
        return num1
    }

    val num3 = num1 * num2 % 100

    return calculate(num2, num3, cnt - 1)
}