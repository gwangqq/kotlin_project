package com.example.kotlin_project

data class Ticket(val companyName: String, val name : String, var data: String, val seatNumber: Int)
class TicketNormal(val companyName: String, val name : String, var data: String, val seatNumber: Int)
// toString(), hashCode(), equals(), copy()

fun main(){
    val ticketA = Ticket("koreanAir", "Jake", "2021-05-13", 24)
    val ticketB = TicketNormal("koreanAir", "Jake", "2021-05-13", 24)

    println(ticketA)
    println(ticketB)
}