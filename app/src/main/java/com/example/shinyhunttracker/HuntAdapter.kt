package com.example.shinyhunttracker

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.shinyhunttracker.databinding.ItemHuntBinding
import com.example.shinyhunttracker.models.Hunt

class HuntAdapter(
    private val hunts: List<Hunt>,
    private val onHuntClick: (Hunt) -> Unit
) : RecyclerView.Adapter<HuntAdapter.HuntViewHolder>() {

    inner class HuntViewHolder(
        private val binding: ItemHuntBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(hunt: Hunt) {
            binding.pokemonName.text = hunt.pokemonName
            binding.pokemonGameName.text = hunt.pokemonGameName
            binding.numOfEncounters.text = "Encounters: ${hunt.numOfEncounters}"

            binding.root.setOnClickListener {
                onHuntClick(hunt)
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): HuntViewHolder {
        val binding = ItemHuntBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return HuntViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: HuntViewHolder,
        position: Int
    ) {
        val hunt = hunts[position]
        holder.bind(hunt)
    }

}