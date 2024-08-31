fun main(){

    val temperature = 10

    val isHot = when(temperature ) {
        //Cold,Warm,Hot,Unknown
        20 -> "Cold"
        45 -> "Hot"
        else -> "Unknown"




    }

    println(isHot)
}