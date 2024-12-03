// HAS-A relationships:
class Engine {
    fun start() = println("Engine started.")
}

class Car(val engine: Engine) {
    fun drive() {
        engine.start()
        println("Car is driving.")
    }
}

fun main() {
    val engine = Engine()
    val car = Car(engine)
    car.drive()
}


//IS_A relationship:
open class Animal {
    fun eat() = println("This animal eats food.")
}

class Dog : Animal() {
    fun bark() = println("The dog barks.")
}

fun main() {
    val dog = Dog()
    dog.eat()  // Inherited from Animal
    dog.bark() // Specific to Dog
}


//Override superclass properties from subclasses
open class Animal {
    open val sound: String = "Generic Animal Sound"
}

class Dog : Animal() {
    override val sound: String = "Bark"
}

fun main() {
    val animal: Animal = Dog()
    println(animal.sound) // Output: Bark
}
