import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    var pivot = 2

    for (i in 1..n) {
        for (j in 1..n) {
            if (i == 1) {
                print("* ")
            } else {
                if (j % 2 == 0 && j >= pivot) {
                    print("* ")
                } else {
                    print("  ")
                }
            }

            
        }

        if (i % 2 == 0) pivot += 2
        println()
    }
}

// 6
// 11 12 13 14 15 16
// 21 22 23 24 25 26
// 31 32 33 34 35 36
// 41 42 43 44 45 46
// 51 52 53 54 55 56
// 61 62 63 64 65 66