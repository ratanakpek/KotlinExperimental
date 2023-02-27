package ratanak.pek.kotlinebook.Section1

class ForIsAStatement {
    fun test() {
        // Can't do this:
//        val f = for (i in 1..10) {
//        }
        //  Compiler error message:
        // for is not an expression, and
        // only expressions are allowed here
    }
}