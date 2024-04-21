import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val arr2D = Array(201) { IntArray(201) }
    var cnt = 0

    repeat(n) { index ->
        val x1 = sc.nextInt()
        val y1 = sc.nextInt()
        val x2 = sc.nextInt()
        val y2 = sc.nextInt()

        if (index % 2 == 0) {
            // 1
            for (i in x1 + 100 until x2 + 100) {
                for (j in y1 + 100 until y2 + 100) {
                    arr2D[i][j] = 1
                }
            }
        } else { 
            // 2
            for (i in x1 + 100 until x2 + 100) {
                for (j in y1 + 100 until y2 + 100) {
                    arr2D[i][j] = 2
                }
            }
        }
    }

    for (i in 0..200) {
        for (j in 0..200) {
            if (arr2D[i][j] == 2) {
                cnt++
            }
        }
    }

    print(cnt)
}