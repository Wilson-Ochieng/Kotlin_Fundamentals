
enum class Difficulty {
    Easy,Medium,Hard, AnyOption
}

interface ProgressPrintable {
val progressText:String
fun printProgressBar()

}

class   Quiz {
    val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.Medium)
    val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.Easy)
    val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.Hard)
//Test variable



    companion object StudentProgress{

        val test: String= "Test"
        var  total:Int = 10
        var answered:Int = 3
    }





}
//Extension property
val Quiz.StudentProgress.progressText: String
    get()= "${answered} of ${total}"


//Extension function
fun Quiz.StudentProgress.printProgressBar() {

    repeat(Quiz.total - Quiz.answered){ println("▓") }
    println()
    println(Quiz.progressText)

}



data class Question <T> (

  val questionText: String,
  val answer:T,
  val difficulty:Difficulty

)

//Singleton Object


fun main() {

println(Quiz.printProgressBar())

}