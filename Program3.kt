//Print the even numbers from 100 to 1 using ‘for’, ‘while’, and ‘do-while’ loops.

fun main() {
    
    // write your code here
    //for
    for(i in 100 downTo 1 step 2){
        println(i)
    }
    
    //while
    var j = 100
    while(j >= 1){
        println(j)
        j-=2
    }
    
    //doWhile
    var k = 100
    do{
        println(k)
        k -= 2
    }while(j>=1)
}

