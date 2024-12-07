// function description
fun main(){
    happybirthday()
    val bday = birthdayGreeting()
    println(bday)
    details("juma", 21, "22,ikuti")
}

fun happybirthday(){
    println("Happy Birthday John")
    println("you are now 21 years old")
}


//return values from function

fun birthdayGreeting(): String {
    val nameGreeting = "Happy Birthday, Godfrey!"
    val ageGreeting = "You are now 21 years old!"
    return "$nameGreeting\n$ageGreeting"
}

//parameter declaration

fun details(name: String, age: Int,address: String){
    println("hello, my name is $name im $age years old and my address is $address") 
}

//function signature
fun details(name: String, age: Int,address: String)

// single epression function
fun square(x: Int) = x * x
println(square(4)) // Output: 16
