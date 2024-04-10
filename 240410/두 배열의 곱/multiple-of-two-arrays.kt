import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val arr2D = Array(3) { IntArray(3) }
    
    for(i in 0..2) {
        for (j in 0..2) {
            arr2D[i][j] = sc.nextInt()
        }
    }

    for(i in 0..2) {
        for (j in 0..2) {
            arr2D[i][j] *= sc.nextInt()
            print("${arr2D[i][j]} ")
        }
        println()
    }
}