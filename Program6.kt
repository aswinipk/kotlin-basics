//In the mutable version of the list in the previous question add the string: “Harry Kane”. From the modified list remove the string: “Wayne Rooney”. Now in this list add the string: “Neymar Jr.” at index 1. Now print the modified mutable list.

fun main() {
    
    // write your code here
    val myMutableList = mutableListOf("Lionel Messi", "Wayne Rooney", "Luka Modric", "Eden Hazard", "Sergio Aguero")
    println(myMutableList)
    
    myMutableList.add("Harry Kane")
     println(myMutableList)
     
    myMutableList.removeAt(1)
        println(myMutableList)
        
    myMutableList.add(1, "Neymar Jr.")
        println(myMutableList)
    
}