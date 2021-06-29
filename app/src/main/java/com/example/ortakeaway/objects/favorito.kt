package com.example.ortakeaway.objects

class favorito (uid : String, uid_comida : String, comida : comida, uid_usuario : String)
{
    var uid : String
    var uid_comida : String
    var comida : comida
    var uid_usuario : String

    init {
        this.uid = uid
        this.uid_comida = uid_comida
        this.comida = comida
        this.uid_usuario = uid_usuario
    }
}