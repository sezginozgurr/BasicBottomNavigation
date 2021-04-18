package com.example.bottomnavigation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bottomnavigation.R
import com.example.bottomnavigation.databinding.FragmentMatchBinding
import com.example.bottomnavigation.databinding.FragmentShuffleDetailBinding

class ShuffleDetailFragment : Fragment() {

    private var _binding: FragmentShuffleDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentShuffleDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

}