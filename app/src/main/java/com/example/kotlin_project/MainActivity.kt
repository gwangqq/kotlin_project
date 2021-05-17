package com.example.kotlin_project

// 1. function
fun main(){
    // 3. String template
//
//    val name = "Jake"
//    val lastName = "Park"
//    println("my name is ${name + lastName} I am 29")
//
//    println("this is 10\$")
//    checkNum(1)

//    forAndWhile()
//    nullCheck()
    ignoreNulls(null)
}
fun helloWorld():Unit{
    println("Hello world!!")
}

fun add(a:Int, b: Int) : Int{
    return a + b
}

// 2. val vs var

fun hi(){
    val a : Int = 100
    var b : Int = 5

    b = 10232

    val c = 1232
    var d = 110
}

fun maxNum(a: Int, b:Int) : Int{
    return if(a>b){
        a
    }else {
        b
    }
}

fun maxNum2(a:Int, b: Int) = if(a>b) a else b

fun checkNum(score: Int) {
    when(score){
        0 -> println("this is 0")
        1 -> println("this is 1")
        2,3 -> println("this is 2 or 3")
        else -> println("I don't know")
    }

    var b = when(score){
        1 -> 1
        2 -> 2
        else -> 100
    }
    println("b : ${b}")

    when(score){
        in 90..100 -> println("you are genius")
        in 10..80 -> println("not that bad")
        else -> print("okay")
    }
}

// Array vs List
// Array -> fixed memory

// List 1. List 2. MutableList

fun array(){
    val array = arrayOf(1,2,3)
    val list = listOf(1,2,3)

    val array1 = arrayOf("a", "b", "c")
    val array2 = arrayOf("a", "b", "c")

    array[0] = 100

    var result = list.get(0)
    var arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)
    arrayList.add(30)
}

// 6. for vs while
fun forAndWhile() {
    val students = arrayOf("joyce", "james", "jake", "john")

    for( name in students){
        println("${name}")
    }

    for((index, name) in students.withIndex()){
        println("${index +1} student::: $name")
    }

    var sum : Int = 0
    for (i in 1..10){// 1 until 10 -> from 1 to 9
        sum += i
    }
    println(sum)

    var index = 0
    while(index < 10){
        println("index :::: ${index}")
        index++
    }
}

// 7. Nullable / NonNull
fun nullCheck(){
    var name : String  = "jake"

    var nullName : String? = null

    var nameInUpperCase  = name.toUpperCase()

    var nullNameInUpperCase = nullName?.toUpperCase()


    // ?:

    val lastName : String? = " park"

    val fullName = name + (lastName?: " no last name")
    println(fullName)

    // !!
}

fun ignoreNulls(str: String?){
    val mNonNull : String? = null
    val upper = mNonNull?.toUpperCase()

    val email : String?= null
    email?.let {
        println("my email is ${email}")
    }
}