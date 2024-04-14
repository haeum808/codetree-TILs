import java.util.Scanner

class Integer(var value: Int)

fun main() {
    val sc = Scanner(System.`in`)

    val a = Integer(sc.nextInt())
    val b = Integer(sc.nextInt())

    change(a, b)

    print("${a.value} ${b.value}")
}

fun change(a: Integer, b: Integer) {
    if (a.value > b.value) {
        a.value *= 2
        b.value += 10
    } else {
        a.value += 10
        b.value *= 2
    }
}