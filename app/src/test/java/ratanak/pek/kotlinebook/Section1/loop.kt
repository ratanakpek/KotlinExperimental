package ratanak.pek.kotlinebook.Section1

import org.junit.Test

class loop {

    @Test
    fun loop_string() {
        for (ch in "Jnskhm") {
            print(ch)
           // print(ch + 1)
        }
    }

    @Test
    fun loop_char() {
        for (c in 'A'..'Z') {
            print(c)
        }
    }

    @Test
    fun loop() {
        val range1 = 1..10 // [1]
        val range2 = 1 until 10 // [2]
        println(range1)
        println(range2)
    }

    @Test
    fun progression() {
        showRange(1..5)
        showRange(0 until 5)
        showRange(5 downTo 1) // [1]
        showRange(0..9 step 2) // [2]
        showRange(0 until 10 step 3) // [3]
        showRange(9 downTo 2 step 3)
    }

    fun showRange(r: IntProgression) {
        for (i in r) {
            print("$i ")
        }
        print(" // $r")
        println()
    }

}