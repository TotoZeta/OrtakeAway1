package com.example.ortakeaway.objects

class comida (nombre : String, precio : Double, uid : String, foto : String, vegetariano : Boolean, favs : Boolean, vegano : Boolean, sinTacc : Boolean)
{
    var nombre : String
    var precio : Double
    var uid : String
    var foto : String
    var vegetariano : Boolean
    var vegano : Boolean
    var sinTacc : Boolean
    var favs : Boolean

    init {
        this.nombre = nombre
        this.precio = precio
        this.uid = uid
        this.foto = foto
        this.vegetariano = vegetariano
        this.vegano = vegano
        this.sinTacc = sinTacc
        this.favs = favs
    }
}