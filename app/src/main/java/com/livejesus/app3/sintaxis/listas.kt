package com.livejesus.app3.sintaxis

fun main() {

    //inmutableList()
    mutableList()

}


fun mutableList(){
    val listaMutable:MutableList<String> = mutableListOf("Domingo","Lunes","Martes", "Miercoles", "Jueves", "Viernes", "Sabado")
    listaMutable.add("Día del taco")
    listaMutable.add(0,"Día de la empanada")
    listaMutable.remove(listaMutable[0])
    listaMutable.remove("Lunes")
    for (dias in listaMutable){
        println("es $dias")
    }
}

fun inmutableList(){
    val readOnly:List<String> = listOf("Domingo","Lunes","Martes", "Miercoles", "Jueves", "Viernes", "Sabado")
/*
    println(readOnly.size)
    println(readOnly)
    println(readOnly[0])
    println(readOnly.last())
    println(readOnly.first())
**/
    //println(readOnly.filter { it.equals("Domingo") }) //devuelve el indice con el valor si lo encuentra
    //println(readOnly.filter { !it.contains("Domingo") })
    println(readOnly.forEach{ println(it) })
    println(readOnly.forEach{ dias -> println(dias) }) //renombra it
}

