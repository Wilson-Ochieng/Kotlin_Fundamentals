fun main(){
    val MyVehicle = Vehicle()

    MyVehicle.repairVehicle()
    MyVehicle.paintVehicle()

}

class Vehicle  {
    //method 1
    fun repairVehicle(){
        println("This vehicle is repaired")
    }
    //method 2
    fun paintVehicle(){
        println("This vehicle is painted")
    }


}