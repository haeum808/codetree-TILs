fun main() {
    val s = readln().toLong()
    var left = 1L
    var right = s
    var max = 0L

    while (left <= right) {
        val mid = (left + right) / 2

        if (mid * (mid + 1) / 2 <= s) {
            left += 1
            max = maxOf(mid, max)
        } else {
            right -= 1
        }
    }

    print(max)
}