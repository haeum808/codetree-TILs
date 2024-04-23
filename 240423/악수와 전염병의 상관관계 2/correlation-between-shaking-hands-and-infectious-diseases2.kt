import java.util.Scanner

data class Infection(
    val t: Int,
    val x: Int,
    val y: Int
): Comparable<Infection> {
    override fun compareTo(other: Infection): Int {
        return t - other.t
    }
}

fun main() {
    val sc = Scanner(System.`in`)

    // 총 개발자 수
    val n = sc.nextInt()
    // 감염되는 악수 횟수
    val k = sc.nextInt()
    // 처음 전염병에 걸린 개발자
    val p = sc.nextInt()
    // 갯수
    val T = sc.nextInt()

    val people = IntArray(n + 1)
    val persistence = IntArray(n + 1) { k }
    people[p] = 1

    val infections = mutableListOf<Infection>()

    repeat(T) {
        val t = sc.nextInt()
        val x = sc.nextInt()
        val y = sc.nextInt()

        infections.add(Infection(t, x, y))
    }

    val sortedInfections = infections.sorted()

    for (infection in sortedInfections) {
        if (people[infection.x] == 1 && persistence[infection.x] > 0 && people[infection.y] == 1 && persistence[infection.y] > 0) {
            persistence[infection.x] -= 1
            persistence[infection.y] -= 1
        } else if (people[infection.x] == 1 && persistence[infection.x] > 0) {
            people[infection.y] = 1
            persistence[infection.x] -= 1
        } else if (people[infection.y] == 1 && persistence[infection.y] > 0) {
            people[infection.x] = 1
            persistence[infection.y] -= 1
        }
    }

    for (i in 1..n) {
        print("${people[i]}")
    }
}