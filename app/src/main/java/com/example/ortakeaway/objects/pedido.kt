package com.example.ortakeaway.objects

class pedido (uid : String, usuario : String, uid_comida : String, comidas : List<pedidoUnidad>)
{
    var uid : String
    var usuario : String
    var uid_comida : String
    var comidas : List<pedidoUnidad>

    init {
        this.uid = uid
        this.usuario = usuario
        this.uid_comida = uid_comida
        this.comidas = comidas
    }

    
}