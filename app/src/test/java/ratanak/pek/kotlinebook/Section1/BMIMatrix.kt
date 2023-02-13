package ratanak.pek.kotlinebook.Section1

import org.junit.Test

class BMIMatrix {
    @Test
    fun myMain() {
        val weight = 72.57 // 160 lbs
        val height = 1.727 // 68 inches
        val status = bmiMetric(weight, height)
        println(status)
    }
}

fun bmiMetric(
    weight: Double,
    height: Double
): String {
    val bmi = weight / (height * height) // [1]
    return if (bmi < 18.5) "Underweight"
    else if (bmi < 25) "Normal weight"
    else "Overweight"
}


