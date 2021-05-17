package com.example.kotlin_project



// constructor
open class Human(val name:String ="anonymous"){

    init{
        println("The new human has been born!!!")
    }


    // sub constructor
    constructor(name: String, age: Int):this(name){
        println("my name is ${name}, ${age}years old")
    }

    fun eatingCake(){
        println("This is so yummy!!!!")
    }

    open fun singASong(){
        println("lalalalalal~~~~")
    }
}

class Korea : Human(){

    override fun singASong(){
        super.singASong()
        println("랄라랄라")
        println("my name is ${name}")
    }
}


fun main(){
//    val human = Human("John")
//    val stranger = Human()
//    human.eatingCake()

//    val another = Human("Kuri", 18)

//    println("this human's name is ${stranger.name}")

    val korea = Korea()
    korea.singASong()
}
