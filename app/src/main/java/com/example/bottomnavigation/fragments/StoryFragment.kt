package com.example.bottomnavigation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.bottomnavigation.R
import com.example.bottomnavigation.base.BaseAdapter
import com.example.bottomnavigation.databinding.FragmentStoryBinding
import com.example.bottomnavigation.model.StoryModel
import com.example.bottomnavigation.util.MockData


class StoryFragment : Fragment() {

    private var _binding: FragmentStoryBinding? = null
    private val binding get() = _binding!!
    private var adapter: BaseAdapter<StoryModel>? = null
    private var storyList: ArrayList<StoryModel>? = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentStoryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        storyList = MockData.getStoryData()
        setAdapter()
    }

    private fun setAdapter() {
        adapter =
            BaseAdapter(requireContext(), R.layout.row_item_story, storyList) { v, item, position ->
                val storyImage = v!!.findViewById(R.id.story) as ImageView
                val userName = v.findViewById(R.id.userName) as TextView

                Glide.with(requireContext())
                    .load(item.storyImage)
                    .into(storyImage)

                userName.text = item.userName
            }
        binding.recyclerStory.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}