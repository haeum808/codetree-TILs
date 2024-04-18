import java.util.Scanner

class Player(val id: String = "codetree", val level: Int = 10) {
    override fun toString(): String = "user $id lv $level"
}

fun main() {
    val sc = Scanner(System.`in`)

    val id = sc.next()
    val level = sc.nextInt()

    val player1 = Player()
    val player2 = Player(id, level)

    println(player1)
    println(player2)
}