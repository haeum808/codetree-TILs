import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val arr2D = Array(201) { IntArray(201) }
    var cnt = 0

    repeat(n) {
        val x1 = sc.nextInt()
        val y1 = sc.nextInt()
        val x2 = sc.nextInt()
        val y2 = sc.nextInt()

        for (i in x1 + 100..x2 + 100 - 1) {
            for (j in y1 + 100..y2 + 100 - 1) {
                arr2D[i][j] = 1
            }
        }
    }

    for (i in 0..200) {
        for (j in 0..200) {
            if(arr2D[i][j] == 1) cnt++
        }
    }

    print(cnt)
}