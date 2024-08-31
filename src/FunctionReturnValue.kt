fun main(){

    println(birthdayGreeting(name="James",age=30))

}


fun birthdayGreeting(name:String,age:Int):String{
    val nameOfGreeting ="You are $name"
    val ageOfGreeting = "You are $age years old"

    return "$nameOfGreeting\n$ageOfGreeting\n"

}