import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val array = IntArray(n)

    for (i in 0..n - 1) {
        array[i] = sc.nextInt()
    }

    double(array)

    print(array.joinToString(" "))
}

fun double(array: IntArray) {
    for (i in array.indices) {
        if (array[i] % 2 == 0) array[i] = array[i] / 2
    }
}