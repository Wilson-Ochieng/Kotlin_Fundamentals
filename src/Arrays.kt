fun main() {

//    val rockPlanet = arrayOf("Mercury","Venus","Earth","Mars")
//
//    val gasPlanets= arrayOf("Jupiter","Saturn","Uranus","Neptune")

//    val solarSystem = rockPlanet + gasPlanets

    val solarSystem = mutableListOf("Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune")

//    println(solarSystem.indexOf("Earth"))

//    for ( element in solarSystem){
//
//        println(element)
//    }


    solarSystem.remove("Mars")
    solarSystem[3] = "Test"
//    solarSystem.remove("Neptune")
//    solarSystem.remove("Earth")

    //Console log Updated array
  solarSystem.forEach(::print)

//    for ( element in solarSystem){
//
//        println(element)
//    }
//
//
}