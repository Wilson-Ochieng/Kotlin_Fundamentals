//Calling functions
fun main() {
//val greeting = birthDayGreeting()
birthDayGreeting(name="James")
//  println(greeting)

    var temperature = 10
    var isHot = when (temperature) {

        50 -> "Hot"
        25 -> "Cold"

        else -> "Unknown"

    }
    println(isHot)

}

//Second function

fun birthDayGreeting(name:String,age: Int=10){
    println("My name is ${name},${age}")

}



