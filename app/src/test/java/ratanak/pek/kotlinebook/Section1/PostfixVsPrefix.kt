package ratanak.pek.kotlinebook.Section1

import org.junit.Test

class PostfixVsPrefix {

    @Test
    fun test() {
        var i = 10
        println(i++)//10
        println(i)//11

        var j = 20
        println(++j)//21
        println(j)//21

    }

    @Test
    fun test2() {
        var i = 1
       // println(i++ + ++i)

        var first = i++
        val second = ++i
        println(first + second)
    }
}