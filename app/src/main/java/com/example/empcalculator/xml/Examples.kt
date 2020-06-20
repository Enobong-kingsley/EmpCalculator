package com.example.empcalculator.xml



fun main (args : Array <String>){
    abstract class Employee {
        var salary: Int = 10000

        fun displaySal(sal: Int) {
            println("My Salary is $sal.")
        }

        abstract fun displayJob(description: String)
    }

}