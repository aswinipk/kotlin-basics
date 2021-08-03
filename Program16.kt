//Create a class Car with brandName, color, and engineNumber as properties along with accelerate() and applyBrakes() as functions. In the main function create multiple objects of this class Car.

// Create class Car here
class Car(brandName: String, color: String , engineNumber: Int){

fun accelerate(){
    println("Acclerated")
}

fun applyBrakes(){
    println("Brake is applied")
}
}
fun main(){
    
    // Create objects here
    val obj1 = Car("honda","red",2)
    obj1.accelerate()
    obj1.applyBrakes()
    val obj2 = Car("nissan","white",5)
    val obj3 = Car("tata","black",3)
    obj3.accelerate()
    obj3.applyBrakes()
    
}