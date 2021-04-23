package com.example.bottomnavigation.fragments

import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.bottomnavigation.R
import com.example.bottomnavigation.base.BaseAdapter
import com.example.bottomnavigation.databinding.FragmentProfileBinding
import com.example.bottomnavigation.model.ChipModel
import com.example.bottomnavigation.util.MockData
import com.google.android.material.chip.Chip
import java.util.*

class ProfileFragment : Fragment() {

    private var _binding: FragmentProfileBinding? = null
    private val binding get() = _binding!!
    private var adapter: BaseAdapter<ChipModel>? = null
    private var chips: ArrayList<ChipModel>? = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProfileBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        chips =MockData.getChips()
        setAdapter()
    }

    private fun setAdapter() {
        adapter =
            BaseAdapter(requireContext(), R.layout.row_chips, chips) { v, item, position ->
                val chips = v!!.findViewById(R.id.chips) as Chip
                val rnd = Random()

                val color = Color.rgb(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256))
                chips.chipBackgroundColor = ColorStateList.valueOf(color)

                chips.text = item.chips
            }
        binding.recyclerChip.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}