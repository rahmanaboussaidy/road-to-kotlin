/*  comparison operators are:
is equal:== 
Less than: <
Greater than: >
Less than or equal to: <=
Greater than or equal to: >=
 Not equal to: !=
 */
fun main() {
    mtu()
    another()
    println(1 == 1)
    println(1 < 8)
    println(1 > 8)
    println(1 <= 8)
    println(1 >= 8)
    println(1 != 8)
    }


//if/else statements:
fun mtu() {
    val trafficLight = "Blue"

    if (trafficLight == "Red") {
        println("You can Stop")
    } 
    else if (trafficLight == "Yellow") {
        println("You can get Ready")
    } 
    else if (trafficLight == "Green") {
        println("You can Go")
    }
    else{
        println("Incorrect input")
    }
}

//when statement:
fun another() {
    val trafficLightColor = "Black"

    when (trafficLightColor) {
        "Red" -> println("Stop")
         "Yellow" -> println("Slow")
         "Green" -> println("Go")
        else -> println("Invalid traffic-light color")
        }

        
}


// using ,  in and is in when statements:
fun numerals() {
    val x: Any = 42.8

    when (x) {
        2, 3, 5, 7 -> println("x is a prime number between 1 and 10.")
         in 1..10 -> println("x is a number between 1 and 10, but not a prime number.")
        is Int -> println("x is an integer number, but not between 1 and 10.")
         else -> println("x isn't a prime number between 1 and 10.")
         }
}


//Use if/else and when as expressions
fun parse{
    val trafficLightColor = "Black"
    
    val message =
    if (trafficLightColor == "Red") "Stop"
    else if (trafficLightColor == "Yellow") "Slow"
    else if (trafficLightColor == "Green") "Go"
    else "Invalid traffic-light color"
    }


    fun main() {
        val trafficLightColor = "Amber"
    
        val message = when(trafficLightColor) {
            "Red" -> "Stop"
            "Yellow", "Amber" -> "Slow"
            "Green" -> "Go"
            else -> "Invalid traffic-light color"
        }
        println(message)
    }