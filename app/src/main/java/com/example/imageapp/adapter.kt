package com.example.imageapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide


class adapter(private val List: List<String>, context: Context, private val Item_clicked:item_clicked):RecyclerView.Adapter<adapter.viewholder>() {
    val context=context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.imager,parent,false)
        val Viewholder=viewholder(view)
         view.setOnClickListener{
             Item_clicked.onitemclicked(List[Viewholder.adapterPosition])
         }


        return Viewholder
    }

    override fun onBindViewHolder(holder: viewholder, position: Int) {
        holder.setimage(List[position],context)
    }

    override fun getItemCount(): Int {
       return List.size
    }
    class viewholder(view: View):RecyclerView.ViewHolder(view){
        val imageView:ImageView=view.findViewById(R.id.imageView)
        fun setimage(url: String,context: Context){
          Glide.with(context).load(url).into(imageView)
        }
    }
    interface item_clicked{
        fun onitemclicked(item:String)
    }

}