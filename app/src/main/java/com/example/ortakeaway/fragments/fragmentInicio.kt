package com.example.ortakeaway.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ortakeaway.R
import com.example.ortakeaway.adapters.adaptadorComida
import com.example.ortakeaway.objects.comida

class fragmentInicio : Fragment() {
    lateinit var v: View
    lateinit var recComida: RecyclerView
    var comidas: MutableList<comida> = mutableListOf()
    private lateinit var gridLayoutManager: GridLayoutManager
    private lateinit var adaptadorComida : adaptadorComida

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        recComida = v.findViewById(R.id.recyclerViewComidas)
        v = inflater.inflate(R.layout.fragment_inicio, container, false)
        return v
    }

    override fun onStart() {
        super.onStart()
        recComida.setHasFixedSize(true)
        gridLayoutManager = GridLayoutManager(context, 2)
        recComida.layoutManager = gridLayoutManager
        adaptadorComida = adaptadorComida(comidas, requireContext()) {x -> onItemClick (x)}
    }

    fun onItemClick (position : Int){
        var Nombre : String = comidas[position].nombre
        var Precio : Double = comidas[position].precio
        var Foto : String = comidas[position].foto
        var Uid : String = comidas[position].uid

    }

}