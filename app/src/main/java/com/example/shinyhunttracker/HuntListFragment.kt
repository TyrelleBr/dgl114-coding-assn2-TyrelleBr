package com.example.shinyhunttracker

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.shinyhunttracker.databinding.FragmentHuntListBinding
import com.example.shinyhunttracker.models.Hunt
import android.content.Intent

class HuntListFragment : Fragment() {

    private var _binding: FragmentHuntListBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHuntListBinding.inflate(
            inflater,
            container,
            false
        )

        binding.huntRecyclerView.layoutManager = LinearLayoutManager(requireContext())

        binding.huntRecyclerView.adapter = HuntAdapter(hunts) { hunt ->

            val intent = Intent(requireContext(), EncounterCounterActivity::class.java)

            intent.putExtra("pokemonName", hunt.pokemonName)
            intent.putExtra("pokemonGameName", hunt.pokemonGameName)
            intent.putExtra("numOfEncounters", hunt.numOfEncounters)

            startActivity(intent)

        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    private val hunts = listOf(
        Hunt("Cubone", "Pokemon Fire Red", 0),
        Hunt("Rayquaza", "Pokemon Emerald", 100),
        Hunt("Shinx", "Pokemon Platinum", 4000)
    )

}