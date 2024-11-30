/*Collection
Lists - Ordered collections of items
Sets - Unique unordered collections of items
Maps - Sets of key-value pairs where keys are unique and map to only one value
*/

//mutable and immutable lists:
fun main(){
    //immutable lists:
    val shapes = listOf("triangle", "Rectangle","Square")
    println(shapes)

    //first and last item accessing:
    println("The first item in this list is " + shapes.first())
    println("The last item in this list is " + shapes.last())

    // mutable lists:
    val mutableShapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    val shapesLocked: List<String> = mutableShapes
    println(mutableShapes)

    //counting numbers of item in list
    println("this variable has ${mutableShapes.count()}")

    //checking if an item is in a list
    println("Rectangle" in mutableShapes )

    //adding and removing items in a list:
    mutableShapes.add("pentagon")
    println(mutableShapes)
    mutableShapes.remove("circle")
    println(mutableShapes)
}


//set - items of unordered pair that can't be duplicated and only store unique items. also  you can't access an item at a particular index
fun main(){
    val shapes = setOf("triangle", "Rectangle","Square")
    println(shapes)
    println("The first item in this list is " + shapes.last())

    val mutableShapes: MutableSet<String> = mutableSetOf("triangle", "square", "circle")
    println(mutableShapes)
    println("this variable has ${mutableShapes.count()}")
    println("Rectangle" in mutableShapes )
    mutableShapes.add("pentagon")
    println(mutableShapes)
    mutableShapes.remove("circle")
    println(mutableShapes)
}

fun main() {
//sampleStart
// Read-only map
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(readOnlyJuiceMenu)
// {apple=100, kiwi=190, orange=100}
// Mutable map with explicit type declaration
    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println(juiceMenu)
// {apple=100, kiwi=190, orange=100}
//sampleEnd
}
