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

}