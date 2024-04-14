import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val a = sc.nextInt()
    val b = sc.next()
    val c = sc.nextInt()

    print(fourBasicOperation(a, b, c))
}

fun fourBasicOperation(num1: Int, operator: String, num2: Int): String {
    return when(operator) {
        "+" -> { "$num1 $operator $num2 = ${num1 + num2}" }
        "-" -> { "$num1 $operator $num2 = ${num1 - num2}" }
        "/" -> { "$num1 $operator $num2 = ${num1 / num2}" }
        else -> { "$num1 $operator $num2 = ${num1 * num2}" }
    }
}