//nullable and non nullablevariables
fun main() {
    var favoriteActor: String? = "Tom Cruise"
    println(favoriteActor)
    
    favoriteActor = null
    println(favoriteActor)
    }

fun man() {
    var favoriteActor: String? = "Sandra Oh"
    println(favoriteActor?.length)
    }

//how to handle nullable variables:

//(i) safe operator:
// Returns length or null if nullableString is null
val length: Int? = nullableString?.length 


//(ii) Elvis operator:
// Returns length or 0 if nullableString is null
val length: Int = nullableString?.length ?: 0 

{
    var favoriteActor: String? = "Sandra Oh"
    val lengthOfName = favoriteActor?.length ?: 0
    println("The number of characters in your favorite actor's name is $lengthOfName.")
}

//(iii)Not-Null Assertion (!!):
// Throws exception if nullableString is null
val length: Int = nullableString!!.length 

//(iv)Use the if/else conditionals:
fun main() {
    var favoriteActor: String? = "Sandra Oh"


//filtering in a list
val numbers: List<Int?> = listOf(1, 2, null, 4)
val nonNullNumbers = numbers.filterNotNull()
println(nonNullNumbers)

    
    if (favoriteActor != null) {
    println("The number of characters in your favorite actor's name is ${favoriteActor.length}.")
    }
    }
