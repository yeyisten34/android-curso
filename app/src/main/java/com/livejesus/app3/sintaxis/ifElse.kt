package com.livejesus.app3.sintaxis

fun main(){

    ifBasico()

}

fun ifBasico(){

    val nombre = "Jose"

    if (nombre.lowercase() == "jose"){
        println("El nombre es $nombre")
    }else{

        println("el nombre es distinto de jose y es $nombre")

    }

}