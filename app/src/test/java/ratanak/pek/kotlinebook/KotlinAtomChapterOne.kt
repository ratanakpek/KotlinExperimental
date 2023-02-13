package ratanak.pek.kotlinebook

import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class KotlinAtomChapterOne {
    @Test
    fun `triple-quoted test`() {
        val lines: String = """Triple quotes let
            you have many lines
in your string"""
        println(lines)
    }
}