// types of constructor are:
// primary Constructor and secondary constructor
class Car(val brand: String, val model: String) {
    var year: Int = 0

    // Secondary constructor
    constructor(brand: String, model: String, year: Int) : this(brand, model) {
        this.year = year
        println("Car created: $brand $model ($year)")
    }
}

fun main() {
    val car1 = Car("Toyota", "Corolla")            // Primary constructor
    val car2 = Car("Honda", "Civic", 2020)         // Secondary constructor
}