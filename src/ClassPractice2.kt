

fun main(){
    //Class Instance
    val SmartTv = SmartDevice()
    SmartTv.turnOn()
    SmartTv.turnOff()
    println("This is my ${SmartTv.name}")



}

class SmartDevice constructor(){

    var name = "Android TV"
    val category = "Entertainment"

    //method:1
    fun turnOn (){

        println("Turn on the lights")

    }

    fun turnOff(){

        println("Turn off the lights")
    }

}
