package com.example.ortakeaway.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.ortakeaway.R
import com.example.ortakeaway.objects.comida

class adaptadorComida(
private var comidaList: MutableList<comida>,
val context : Context,
val onItemClick : (Int) -> Unit
) :
RecyclerView.Adapter<adaptadorComida.comidaHolder>() {
    class comidaHolder(v : View) : RecyclerView.ViewHolder(v)
    {
        private var v : View
        init {
            this.v = v
        }
        fun setearNombre (Nombre:String)
        {
            val tvNombre : TextView = v.findViewById(R.id.textViewNombreComida)
            tvNombre.text = Nombre
        }
        fun setearPrecio (Precio:String)
        {
            val tvPrecio : TextView = v.findViewById(R.id.textViewPrecioComida)
            tvPrecio.text = Precio
        }
        fun getImageView () : ImageView
        {
            return v.findViewById(R.id.imageViewComida)
        }
        fun getCardLayout () : CardView
        {
            return v.findViewById(R.id.card_package_comida)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): comidaHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_comida,parent,false)
        return comidaHolder(view)
    }

    override fun getItemCount(): Int {
        return comidaList.size
    }

    override fun onBindViewHolder(holder: comidaHolder, position: Int) {
        holder.setearNombre(comidaList[position].nombre)
        holder.setearPrecio(comidaList[position].precio.toString())
        holder.getCardLayout().setOnClickListener()
        {
            onItemClick(position)
        }
        Glide
            .with(context)
            .load(comidaList[position].foto)
            .centerInside()
            .into(holder.getImageView());

    }
    fun setData (newData : ArrayList<comida>)
    {
        this.comidaList = newData
        this.notifyDataSetChanged()
    }
}

