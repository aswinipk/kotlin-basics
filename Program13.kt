//Create a class ‘Laptop’ with properties as RAM, brand and hard disk size. Also, create a function ‘performComputations’ in it.

// create your Laptop class here
class Laptop {
    var ram: Int = 4
    var brand: String = "Asus"
    var hdd: Int = 512
    
    fun performComputations(){
       println("welcome") 
    }
}

fun main(){

    // Create object of class here    
    var laptop = Laptop()
    println(laptop.ram)
    println(laptop.brand)
    println(laptop.hdd)
    laptop.performComputations()
   
}


