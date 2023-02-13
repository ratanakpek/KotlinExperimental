package ratanak.pek.kotlinebook.Section1

import org.junit.Test


class Section_1_ProgrammingBasic {

    @Test
    fun `prevent integer overflow`() {
        val i = Int.MAX_VALUE

        println(0L + i + i)
        println(1_000_000L * 1_000_000)

        //integer overflow error
        println(0 + i + i) // -2
        println(1_000_000 * 1_000_000) //-727379968
    }

    @Test
    fun `Number Types`() {
        println(Int.MIN_VALUE)
        println(Int.MAX_VALUE)

        println(Double.MIN_VALUE)
        println(Double.MAX_VALUE)

        println(Long.MIN_VALUE)
        println(Long.MAX_VALUE)

        val i: Int = Int.MAX_VALUE
        println(i + i)

        ////////////////////////
        val numerator: Int = 19
        val denominator: Int = 10
        println(numerator % denominator)

        val million = 1_000_000 // Infers Int
        println(million)

        val millionDouble = 1_000_000.0
        println(millionDouble)
    }

    ////////////////////////////////////////////
    @Test
    fun `String template Test`() {
        `String template`()

        val s = "value"
        println("s = \"$s\".") //same   -> s = "value".
        println("""s = "$s".""") //same     -> s = "value".

    }

    fun `String template`() {
        //println("$x + 4 = ${x + 4}")
        println("2 x 2 = ${2 * 2}")
    }

    ////////////////////////////////////////////////////
    //block body
    fun sayHello() {
        println("Hallo!")
    }

    // expression body
    fun multiplyByThree(x: Int): Int = x * 3

    ////////////////////////////////////////////////////////
    @Test
    fun `triple-quoted test`() {
        val lines: String = """Triple quotes let
            you have many lines
in your string"""
        println(lines)
    }
}