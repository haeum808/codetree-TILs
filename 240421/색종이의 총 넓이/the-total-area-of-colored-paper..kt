import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val arr2D = Array(201) { BooleanArray(201) }
    var cnt = 0

    repeat(n) {
        val x = sc.nextInt()
        val y = sc.nextInt()

        for (i in x + 100 until x + 100 + 8) {
            for (j in y + 100 until y + 100 + 8) {
                arr2D[i][j] = true
            }
        }
    }

    for (i in 0..200) {
        for (j in 0..200) {
            if (arr2D[i][j]) cnt++
        }
    }

    print(cnt)
}