fun main() {
    var day = "Monday"
    var dayOfWeek = when(day) {
        "Monday" -> "Monday"
        else -> "Weekend"
    }
    println(dayOfWeek)
}