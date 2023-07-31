package com.livejesus.app3.sintaxis

fun main(){
 /**

 variables numericas
  */

    println("hola")
    //int
    val age:Int = 30

    //long
    val example:Long = 30

    //flotnate
    val flotante:Float = 30.0f

    //Double
    val doble:Double = 12.9395213


    /**
    variables alfanumericas
     */

    //char
    val chrExample:Char='e'

    val chrExample1:Char='@'

    val chrExample2:Char='1'

    val cadenas:String="Nehemias Reyes Citalan"

    /**
     * Variables booleanas
     */

    val verdadero:Boolean=true

    //print(cadenas)

   /**
    * La diferencia entre una contante y una variable en kotlin en la siguiente
    *
    * Una constante no puede cambiar durante toda su vida despues de ser asignada
    * y una variable si. diferencia de sintaxis es val paa constante y var para variable
    */

   val nombre:String="Nehemis"
   var nombreVariable:String="Nehemias"

   /**
    * Funciones en kotlin
    */
   var nombrePropio:String="Nehemias"
   imprimirNombre(nombrePropio)
    println(imprimirNombre1(nombrePropio))


}



fun imprimirNombre(nombre:String){
   println("Este es el nombre $nombre")
}

fun imprimirNombre1(nombre:String):String{
    //println("Este es el nombre $nombre")
    return "Este es el nombre con el return $nombre"

}