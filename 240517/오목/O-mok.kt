import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val omokBoard = Array(19) { IntArray(19) { sc.nextInt() } }
    val dx = intArrayOf(0, 1, -1, -1, 1, 1, 0, 0)
    val dy = intArrayOf(1, -1, 1, -1, 1, -1, 0, -1)

    for (i in 0 until 19) {
        for (j in 0 until 19) {
            if (omokBoard[i][j] == 1) {

                for (k in 0 until 4) {
                    val nx1 = i + dx[k]
                    val ny1 = j + dy[k]
                    val nx2 = i + dx[k] * 2
                    val ny2 = j + dy[k] * 2
                    val nx3 = i + dx[8 - k - 1]
                    val ny3 = j + dy[8 - k - 1]
                    val nx4 = i + dx[8 - k - 1] * 2
                    val ny4 = j + dy[8 - k - 1] * 2

                    if (inRange(nx1, ny1) &&
                        inRange(nx2, ny2) &&
                        inRange(nx3, ny3) &&
                        inRange(nx4, ny4)
                    ) {

                        if (omokBoard[nx1][ny1] == 1 &&
                            omokBoard[nx2][ny2] == 1 &&
                            omokBoard[nx3][ny3] == 1 &&
                            omokBoard[nx4][ny4] == 1
                        ) {
                            println(1)
                            print("${i + 1} ${j + 1}")
                            return
                        }
                    }
                }

            } else if (omokBoard[i][j] == 2) {

                for (k in 0 until 4) {
                    val nx1 = i + dx[k]
                    val ny1 = j + dy[k]
                    val nx2 = i + dx[k] * 2
                    val ny2 = j + dy[k] * 2
                    val nx3 = i + dx[8 - k - 1]
                    val ny3 = j + dy[8 - k - 1]
                    val nx4 = i + dx[8 - k - 1] * 2
                    val ny4 = j + dy[8 - k - 1] * 2

                    if (inRange(nx1, ny1) &&
                        inRange(nx2, ny2) &&
                        inRange(nx3, ny3) &&
                        inRange(nx4, ny4)
                    ) {

                        if (omokBoard[nx1][ny1] == 2 &&
                            omokBoard[nx2][ny2] == 2 &&
                            omokBoard[nx3][ny3] == 2 &&
                            omokBoard[nx4][ny4] == 2
                        ) {
                            println(2)
                            print("${i + 1} ${j + 1}")
                            return
                        }
                    }
                }

            }


        }
    }

    print(0)
}

fun inRange(x: Int, y: Int): Boolean {
    return x in 0 until 19 && y in 0 until 19
}