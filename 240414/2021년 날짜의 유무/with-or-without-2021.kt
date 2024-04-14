import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val month = sc.nextInt()
    val day = sc.nextInt()

    if(determin2021(month, day)) {
        print("Yes")
    } else {
        print("No")
    }
}

fun determin2021(month: Int, day: Int): Boolean {
    if (month !in 1..12) return false

    return when(month) {
        1 -> { day in 1..31 }
        2 -> { day in 1..28 }
        3 -> { day in 1..31 }
        4 -> { day in 1..30 }
        5 -> { day in 1..31 }
        6 -> { day in 1..30 }
        7 -> { day in 1..31 }
        8 -> { day in 1..31 }
        9 -> { day in 1..30 }
        10 -> { day in 1..31 }
        11 -> { day in 1..30 }
        else -> { day in 1..31 }
    }
}