fun main() {
    val dua = student()
    dua.showDetails("juma", 12)
}

class student {
    fun showDetails(name: String, age: Int) {
        println("Name: $name")
        println("Age: $age")
    }
}

//ineritance:
fun main() {
    val dua = Student()
    dua.showDetails("juma", 12)
    println(dua) // Prints object info if `toString` is overridden
}

class Student {
    private var name: String = ""
    private var age: Int = 0

    fun showDetails(name: String, age: Int) {
        this.name = name // Assign to the class property
        this.age = age
        println("Name: $name")
        println("Age: $age")
    }

    override fun toString(): String {
        return "Student(name='$name', age=$age)"
    }
}
