import java.util.*

fun main(args: Array<String>) = with( Scanner(System.`in`)) {
    var sum : Int = 0
    for ( i : Int in 1..5 ) {
        sum += nextInt()
    }
    print(sum)
}