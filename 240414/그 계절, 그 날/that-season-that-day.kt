import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    val year = sc.nextInt()
    val month = sc.nextInt()
    val day = sc.nextInt()

    print(weather(year, month, day))
}

fun weather(year: Int, month: Int, day: Int): String {
    if (month == 2 && 
        (year % 4 == 0 && year % 100 != 0) 
        || (year % 400 == 0)) {
            if (day in 1..29) { return "Winter" }
            else { return "-1" }
    } else if (month == 2) {
            if (day in 1..28) { return "Winter" }
            else { return "-1" }
    }

    return when(month) {
        1 -> { if (day in 1..31) "Winter" else "-1" }
        3 -> { if (day in 1..31) "Spring" else "-1" }
        4 -> { if (day in 1..30) "Spring" else "-1" }
        5 -> { if (day in 1..31) "Spring" else "-1" }
        6 -> { if (day in 1..30) "Summer" else "-1" }
        7 -> { if (day in 1..31) "Summer" else "-1" }
        8 -> { if (day in 1..31) "Summer" else "-1" }
        9 -> { if (day in 1..30) "Fall" else "-1" }
        10 -> { if (day in 1..31) "Fall" else "-1" }
        11 -> { if (day in 1..30) "Fall" else "-1" }
        else -> { if (day in 1..31) "Winter" else "-1" }
    }
}