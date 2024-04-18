import java.util.Scanner

class Product(
    val name: String = "codetree",
    val code: Int = 50
) {
    override fun toString(): String {
        return "product $code is $name"
    }
}

fun main() {
    val sc = Scanner(System.`in`)

    val name = sc.next()
    val code = sc.nextInt()

    val product1 = Product()
    val product2 = Product(name, code)

    println(product1)
    println(product2)
}