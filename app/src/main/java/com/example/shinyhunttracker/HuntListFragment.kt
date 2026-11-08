package com.example.shinyhunttracker

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.shinyhunttracker.databinding.FragmentHuntListBinding
import com.example.shinyhunttracker.models.Hunt

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

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}