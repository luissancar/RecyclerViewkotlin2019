package com.example.recyclerviewkotlin2019

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class AdaptadorPeliculas(var lista: ArrayList<Peliculas>): RecyclerView.Adapter<AdaptadorPeliculas.MiViewHolder>(){


    class MiViewHolder(view: View):RecyclerView.ViewHolder(view){
        fun enlazaItems(datos:Peliculas){
            val titulo:TextView=itemView.findViewById(R.id.titulo)
            val imagen:ImageView=itemView.findViewById(R.id.imagen)

            titulo.text=datos.titulo

            Glide.with(itemView.context).load(datos.imagen).into(imagen)

            itemView.setOnClickListener {
                Toast.makeText(itemView.context,"Pelicula ${datos.titulo}",Toast.LENGTH_LONG).show()
            }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MiViewHolder {
       val v=LayoutInflater.from(parent.context).inflate(R.layout.contenido_item,parent,false)
       return MiViewHolder(v)
    }

    override fun getItemCount(): Int {
      return lista.size
    }
////////////MiViewHolder.ViewHolder
    override fun onBindViewHolder(holder: MiViewHolder, position: Int) {
        holder.enlazaItems(lista[position])
    }
}