//Initialise a String as “Hello, Kotlin” and change its value to null. Now print the length of the String using safe call and non-null assertion operator.

fun main(){
    
    // write your code here
    var myString: String? = "Hello, Kotlin"
    myString = null
    println(myString?.length)
    println(myString!!.length)
 }
