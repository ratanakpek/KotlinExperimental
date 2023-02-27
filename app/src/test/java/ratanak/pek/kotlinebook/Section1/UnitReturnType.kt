package ratanak.pek.kotlinebook.Section1

import org.junit.Test

class UnitReturnType {
    fun unitFun() = Unit

    @Test
    fun test() {
        println(unitFun())
        val u1: Unit = println(42)
        println(u1)
        val u2 = println(0) // Type inference
        println(u2)
    }
}