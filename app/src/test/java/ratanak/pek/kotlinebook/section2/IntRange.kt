package ratanak.pek.kotlinebook.section2

import org.junit.Test

class IntRange {

    @Test
    fun init_test() {
        val r1 = IntRange(0, 10)
        val r2 = IntRange(5, 7)
        println(r1.sum())
        println(r2)
    }

}