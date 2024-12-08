fun main() {
    //variables definitions and accessing variables
    val pesa: Double = 100000.12
    val jina: String = "Rahmani"
    val mwaka: Int = 2010
    println("Anaitwa $jina anamiliki kiasi cha Tsh$pesa kuanzia mwaka $mwaka")

    //type inference
    val kiasi = 30939000
    println(kiasi)

    //basic variables operation
    val jumla = kiasi + pesa
    println(jumla) //you can perform any basic operations on it

    //Val vs Var
    //val- immutable variables(cannot modify)
    val searchValue = ""
    searchValue = "Kofia"
    println("Search results for: $searchValue")
    //var- mutable variables(can modify)
    Var searchValue = ""
    searchValue = "Kofia"
    println("Search results for: $searchValue")


    //concatenate variables
    val nextMeeting = "Next meeting: "
    val date = "January 1"
    val reminder = nextMeeting + date
    println(reminder)

    //splitting a variables
    val (firstName, lastName) = "John Doe".split(" ")
    println("First Name: $firstName, Last Name: $lastName")

    //Escape sequences
    println("Say \"mambo\"")
    }
