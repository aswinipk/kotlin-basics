//Given a list = [1, null, 2, 4, null, 6, 8, 10, null]. Insert the number 12 to the number at index 7 and then print out the complete list without any exceptions or null values in the output.

fun main(){
    
   // write your code here
   var mylist = mutableListOf(1,null,2,4,null,6,8,10,null)
   mylist.add(7, 12)
   println(mylist.filterNotNull())
}
