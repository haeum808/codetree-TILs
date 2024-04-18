import java.util.Scanner

data class Num(
    val value: Int,
    val id: Int
)

fun main() {
    val sc = Scanner(System.`in`)

    val n = sc.nextInt()
    val numbers = List(n) { Num(sc.nextInt(), it + 1) }
    val sortedNumbers = numbers.sortedWith(
        compareBy(
            { it.value },
            { it.id }
        )
    )
    
    numbers.forEach {
        print("${sortedNumbers.indexOf(it) + 1} ")
    }
}