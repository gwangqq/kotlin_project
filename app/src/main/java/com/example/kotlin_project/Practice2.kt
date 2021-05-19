package com.example.kotlin_project

// 1. lamda
// 람다식은 우리가 마치 value 처럼 다룰 수 있는 익명함수
// 1) 메소드의 파라미터로 넘겨줄 수 있다.
// 2) return 값으로 사용할 수 있다.

// 람다의 기본정의
// val lamdaName : Type = { argumentList -> codeBody }

val squre : (Int) -> (Int) ={number -> number * number}
val nameAge = {name: String, age: Int ->
    "my name is ${name}, I'm ${age} old"
}

fun main(){
    println(squre(12))
    println(nameAge("jake", 29))

    val a = "jake said "
    val b = "mike said "

    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())

    println(extendString("Peter", 29))
    println(calculateGrate(120))


    val lamda = {number: Double ->
        number == 4.231
    }

    println(invokeLamda(lamda))
    println(invokeLamda({it>3.231}))
    println(invokeLamda { it>3.2443 })

}

// 확장함수

var pizzaIsGreat : String.() -> String = {
    this + "Pizza is great"
}

fun extendString(name: String, age : Int) : String{
    val introduceMyself : String.(Int) -> String = {"I am ${this} and ${it} years old"}
    return name.introduceMyself(age)
}

// 람다의 return
val calculateGrate : (Int) -> String = {
    when(it){
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfect"
        else -> "error"
    }
}

// 람다를 표현하는 방법

fun invokeLamda(lamda: (Double) -> Boolean) : Boolean{
    return lamda(5.6234)
}