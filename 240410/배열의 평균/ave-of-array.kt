import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val arr = Array(2) { IntArray(4) }

    for (i in 0..1) {
        for (j in 0..3) {
            arr[i][j] = sc.nextInt()
        }
    }

    print("%.1f ".format(arr[0].sum() / 4.toDouble()))
    print("%.1f\n".format(arr[1].sum() / 4.toDouble()))

    print("%.1f".format((arr[0][0] + arr[1][0]) / 2.toDouble()))
    print(" %.1f".format((arr[0][1] + arr[1][1]) / 2.toDouble()))
    print(" %.1f".format((arr[0][2] + arr[1][2]) / 2.toDouble()))
    print(" %.1f\n".format((arr[0][3] + arr[1][3]) / 2.toDouble()))

    print("%.1f".format((arr[0].sum() + arr[1].sum()) / 8.toDouble()))
}