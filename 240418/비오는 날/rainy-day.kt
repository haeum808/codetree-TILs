import java.util.Scanner

class FutureWeather(
    val date: String,
    val dayOfWeek: String,
    val weather: String
): Comparable<FutureWeather> {
    override fun compareTo(other: FutureWeather): Int {
        val thisDate = date.split("-").map { it.toInt() }
        val otherDate = other.date.split("-").map { it.toInt() }

        return if (thisDate[0] == otherDate[0]) {
            if (thisDate[1] == otherDate[1]) {
                thisDate[2] - otherDate[2]
            } else {
                thisDate[1] - otherDate[1]
            }
        } else {
            return thisDate[0] - otherDate[0]
        }
    }
}

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()

    val futureWeathers = List(n) {
        FutureWeather(sc.next(), sc.next(), sc.next())
    }

    futureWeathers.filter { it.weather == "Rain" }.minBy { it }.let {
        print("${it?.date} ${it?.dayOfWeek} ${it?.weather}")
    }
}