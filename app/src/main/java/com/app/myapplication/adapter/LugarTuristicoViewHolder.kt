package com.app.myapplication.adapter

import android.content.Intent
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.app.myapplication.LugaresTuristico
import com.app.myapplication.MainActivity
import com.app.myapplication.R
import com.app.myapplication.databinding.ItemLugarturisticoBinding
import com.bumptech.glide.Glide

class LugarTuristicoViewHolder(view: View): RecyclerView.ViewHolder(view){

    val  binding = ItemLugarturisticoBinding.bind(view)
    val lugarTuristico = view.findViewById<TextView>(R.id.tvLugarName)
    val valoracion = view.findViewById<TextView>(R.id.tvValoration)
    val photo = view.findViewById<ImageView>(R.id.ivLugar)

    fun render(lugarModel : LugaresTuristico){
        lugarTuristico.text = lugarModel.nombre
        valoracion.text = lugarModel.id
        Glide.with(binding.ivLugar.context).load(lugarModel.foto).into(binding.ivLugar)
        binding.ivLugar.setOnClickListener{
            val context = it.context
            val intent = Intent(context,MainActivity::class.java)
            context.startActivity(intent)

        }
    }
}