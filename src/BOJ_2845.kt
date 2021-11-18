
import java.util.*

fun main(args: Array<String>) = with( Scanner(System.`in`)) {

    val L = nextInt()
    val P = nextInt()

    for ( i: Int in 1..5 ) {
        val miss = nextInt()
        val result = miss - (L*P)
        print ( "${result} " )
    }
}