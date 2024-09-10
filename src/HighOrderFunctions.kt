class Cookie(
    val name: String,
    val softBaked: Boolean,
    val hasFilling: Boolean,
    val price: Double
)

//List

val cookies = listOf(
    Cookie(
        name = "Chocolate Chip",
        softBaked = false,
        hasFilling = false,
        price = 1.69
    ),
    Cookie(
        name = "Banana Walnut",
        softBaked = true,
        hasFilling = false,
        price = 1.49
    ),
    Cookie(
        name = "Vanilla Creme",
        softBaked = false,
        hasFilling = true,
        price = 1.59
    ),
    Cookie(
        name = "Chocolate Peanut Butter",
        softBaked = false,
        hasFilling = true,
        price = 1.49
    ),
    Cookie(
        name = "Snickerdoodle",
        softBaked = true,
        hasFilling = false,
        price = 1.39
    ),
    Cookie(
        name = "Blueberry Tart",
        softBaked = true,
        hasFilling = true,
        price = 1.79
    ),
    Cookie(
        name = "Sugar and Sprinkles",
        softBaked = false,
        hasFilling = false,
        price = 1.39
    )
)


fun main() {

    //forEach allowing looping all elements in a list

//    val newMenu = cookies.forEach(){
//
//        println("${it.name}.")
//    }

    //filter enables get a subset of elements

//    val myFilter = cookies.filter {
//           !it.softBaked
//    }

//    myFilter.forEach {
//        println("${it.name} - Kes ${it.price}")
//    }
//
    //Map makes an exact copy of elements in list
    val fullMenu = cookies.map{
        println("${it.name}")

    }



    }




