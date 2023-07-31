package com.livejesus.app3.sintaxis

fun main(){
    println(getMonth(12))
    println(getMonthS(12))
    println(getMonthSS(12))
    getTrimestre(13)
    getSemestre(5)
    resultado(true)
}

fun getMonth(month:Int):String{
    when(month){
        1 -> return "enero"
        2 -> return "febrero"
        3 -> return "marzo"
        4 -> return "abril"
        5 -> return "mayo"
        6 -> return "junio"
        7 -> return "julio"
        8 -> return "agosto"
        9 -> {return "septiembre"} //si quisiera meter mas se puede hacer entre llaves
        10 -> return "octubre"
        11-> return "noviembre"
        12 -> return "diciembre"
        else -> return "el numero de me no existe"

    }
}


fun getMonthS(month:Int)=
    when(month){
        1 ->  "enero"
        2 ->  "febrero"
        3 ->  "marzo"
        4 ->  "abril"
        5 ->  "mayo"
        6 ->  "junio"
        7 ->  "julio"
        8 ->  "agosto"
        9 -> { "septiembre"} //si quisiera meter mas se puede hacer entre llaves
        10 ->  "octubre"
        11->  "noviembre"
        12 ->  "diciembre"
        else -> "el numero de me no existe"


}


fun getMonthSS(month:Int):String{
    var result:String = when(month) {
        1 -> "enero"
        2 -> "febrero"
        3 -> "marzo"
        4 -> "abril"
        5 -> "mayo"
        6 -> "junio"
        7 -> "julio"
        8 -> "agosto"
        9 -> {
            "septiembre"
        } //si quisiera meter mas se puede hacer entre llaves
        10 -> "octubre"
        11 -> "noviembre"
        12 -> "diciembre"
        else -> "el numero de me no existe"
    }
return result
    }

fun getTrimestre(month: Int){
    when(month){

        1,2,3 -> println("Primer Trimestre")
        4,5,6 -> println("Segundo trimestre")
        7,8,9 -> println("Tercer trimestre")
        10,11,12 -> println("Cuarto trimestre")
        else -> println("Trimestre invalido")

    }
}

fun getSemestre(month: Int){
    when(month){
        in 1..6 -> println("Primer semestre")
        in 7..12 -> println("Segundo semestre")
        //else -> print("Semestre invalido")
        !in 1..12 -> print("Semestre invalido")
    }
}

fun resultado(value: Any){

    when(value){
        is Int -> print(value + value)
        is String -> println("Este es un String, el valor es $value")
        is Boolean -> if(value){print("Holas :)")}
        else -> println("Valor no aceptado")

    }
}
