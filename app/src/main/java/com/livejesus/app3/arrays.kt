package com.livejesus.app3

fun main() {

    val diasDeLaSemana = arrayOf("Dommingo","Luenas","Martes", "Miercoles", "Jueves", "Viernes", "Sabado")
    println(diasDeLaSemana[1])
    println(diasDeLaSemana.size)

    diasDeLaSemana[0] = "Domingo" //Modificar la posición

    /*
    Bucles para array
     */
    for (position in diasDeLaSemana.indices ){
        println(diasDeLaSemana[position])
    }
    for ((position, value) in diasDeLaSemana.withIndex()){
        println("Hoy en la posición $position es el dia $value")
    }

}