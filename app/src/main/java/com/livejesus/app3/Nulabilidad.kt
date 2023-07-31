package com.livejesus.app3

fun main(){

    //para que una variable pueda ser null debe llevar un parentesis de cierre en la parte final del tipo de dato
    //esto debido a que kotlin tiene seguridad en contra de los null
    var name:String? = null

    if (name == null){
        println("name es igual a $name")
    }

    //para asegurarle a kotlin de que el valor no sera null se deben de poner dos signos de exclamsión de cierre despues de la variable
    //Esto es muy peligoroso debido a que puede romper la aplicacion.
    //Si no contiene los signos kotlin protege la caida y n ejecuta el bloque o la linea
    /*if (name!! == "Nehemi"){
        println("name es igual a $name[0]")
    }**/

    //Una mejor forma es, ssi el valor que recibe no es null has tal cosa y esto se logra con un signo de interrogacion de cierre
    print(name?.get(3))

    print(name?.get(3) ?: "Es nulo")


}