//Calculate and print the sum of the first 50 natural numbers using ‘for’, ‘while’, and ‘do-while’ loops.

fun main() {
    // write your code here
    
    //for loop
   var sumFor = 0
for (i in 1.. 50) {
   sumFor += i
}
println(sumFor)

//while loop
var j = 1
var sumWhile = 0
while (j <= 50) {
   sumWhile += j
   j++
}
println(sumWhile)

//doWhile Loop
var k = 1
var sumDoWhile = 0
do {
   sumDoWhile += k
   k++
} while (k <= 50)
println(sumDoWhile)
}
