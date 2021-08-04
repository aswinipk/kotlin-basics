//Print the odd numbers from 100 to 1 using ‘for’, ‘while’, and ‘do-while’ loops.

fun main() {
   //for loop
for (i in 99 downTo 1 step 2) {
   println(i)
}

//while Loop
   var j = 99
while (j >= 1) {
   println(j)
   j -= 2
}

//doWhile Loop
var k = 99
do {
   println(k)
   k -= 2
} while (k >= 1)
}
