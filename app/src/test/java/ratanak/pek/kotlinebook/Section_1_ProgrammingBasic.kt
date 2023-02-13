package ratanak.pek.kotlinebook

import org.junit.Test


class Section_1_ProgrammingBasic {

    @Test
    fun `Function Test`() {

    }

    //block body
    fun sayHello() {
        println("Hallo!")
    }

    // expression body
    fun multiplyByThree(x: Int): Int = x * 3

    @Test
    fun `triple-quoted test`() {
        val lines: String = """Triple quotes let
            you have many lines
in your string"""
        println(lines)
    }
}