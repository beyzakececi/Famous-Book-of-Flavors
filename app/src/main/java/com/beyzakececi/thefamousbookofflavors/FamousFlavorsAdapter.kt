package com.beyzakececi.thefamousbookofflavors

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.beyzakececi.thefamousbookofflavors.databinding.RecyclerRowBinding

class FamousFlavorsAdapter(val famousFlavorsList : ArrayList<FamousFlavors>) : RecyclerView.Adapter<FamousFlavorsAdapter.FamousFlavorsHolder>(){
    class FamousFlavorsHolder(val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FamousFlavorsHolder {
        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return FamousFlavorsHolder(binding)
    }


    override fun onBindViewHolder(holder: FamousFlavorsHolder, position: Int) {
        holder.binding.recyclerViewText.text = famousFlavorsList.get(position).cityname
        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,DetailsActivity::class.java)
            intent.putExtra("famousFlavor",famousFlavorsList.get(position))
            holder.itemView.context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return famousFlavorsList.size
    }


}