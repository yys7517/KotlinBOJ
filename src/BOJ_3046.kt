import java.util.*

fun main(args: Array<String>) = with( Scanner(System.`in`)) {
    val R1 = nextInt()
    val avg = nextInt()
    // avg = R1 + R2 / 2
    // 2 * avg = R1 + R2
    val R2 =  2 * avg - R1
    print(R2)
}