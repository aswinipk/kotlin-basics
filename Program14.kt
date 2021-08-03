//create two different objects

class Laptop {
   var ram: Int = 4
   var brand: String = "Dell"
   var hdd: Int = 512

   fun performComputations(){
       println("I perform computations")
   }
}

fun main(){
    
    // Create objects here
   var laptop1 = Laptop()
   laptop1.brand = "Asus"
   laptop1.ram = 4
   laptop1.hdd = 256
   println(laptop1.brand)
   println(laptop1.ram)
   println(laptop1.hdd)
   println(laptop1.performComputations())
   var laptop2 = Laptop()
   laptop2.brand = "HP"
   laptop2.ram = 8
   laptop2.hdd = 512
   println(laptop2.brand)
   println(laptop2.ram)
   println(laptop2.hdd)
   println(laptop2.performComputations())
}