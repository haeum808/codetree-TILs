fun main() {
    val s = readln().toLong()
    var left = 1L
    var right = 2000000000L
    var max = 0L

    while (left <= right) {
        val mid = (left + right) / 2L

        if (mid * (mid + 1) / 2 <= s) {
            left = mid + 1
            max = maxOf(mid, max)
        } else {
            right = mid - 1
        }
    }

    print(max)
}