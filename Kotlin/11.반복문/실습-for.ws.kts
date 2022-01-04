for (i in 1..3){
    println("반복")
}

for (value in 0..5 step(2)){
    println("반복 1")
}

for(value in 5 downTo 0){
    println("반복 2")
}

val numbers = listOf<Int>(0,1,2,3)
//for (number in numbers){
//    println(number)
//}

for (i in 0..numbers.size){
    println(i)
}