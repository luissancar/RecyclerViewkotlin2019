package com.example.recyclerviewkotlin2019

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

// https://www.youtube.com/watch?v=NQWVpm5vdA8

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView:RecyclerView=findViewById(R.id.recycler)
        recyclerView.layoutManager=LinearLayoutManager(this,RecyclerView.VERTICAL,false)
        val peliculas=ArrayList<Peliculas>()
        peliculas.add(Peliculas("Nosferatu",1922,R.drawable.nosfe))
        peliculas.add(Peliculas("Pink Flamingos",1973,R.drawable.pink))
        peliculas.add(Peliculas("The Rocky Horror Picture Show ",1975,R.drawable.rockyhorror))

        peliculas.add(Peliculas("Un perro andaluz",1929,R.drawable.unperro))
        peliculas.add(Peliculas("La escopeta nacional",1978,R.drawable.laescopeta))

        val adaptador=AdaptadorPeliculas(peliculas)
        recyclerView.adapter=adaptador

    }
}
