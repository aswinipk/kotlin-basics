// Create an immutable list, a mutable list, and an arraylist of the elements: “Lionel Messi”, “Wayne Rooney”, “Luka Modric”, “Eden Hazard”, “Sergio Aguero”. Print all the above three lists.

fun main() {
    
    // write your code here
    //Immutable List
val myImmutableList = listOf("Lionel Messi", "Wayne Rooney", "Luka Modric", "Eden Hazard", "Sergio Aguero")
println(myImmutableList)

    //Utable List
val myMutableList = mutableListOf("Lionel Messi", "Wayne Rooney", "Luka Modric", "Eden Hazard", "Sergio Aguero")
println(myMutableList)
    
    //Array List
val myArrayList = arrayListOf("Lionel Messi", "Wayne Rooney", "Luka Modric", "Eden Hazard", "Sergio Aguero")
println(myArrayList)
}
