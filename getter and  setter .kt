class Person{
    var age : Int = 0
        set(value) {
            if (value > 0){
                field = value
            }
            else{
                println("Invalid input age")
            }
        }
        get(){
            return field
        }
}

fun main(){
    val mtu = Person()
    mtu.age = 20
    println("Your age is ${mtu.age}")
}