package com.example.bottomnavigation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.bottomnavigation.R
import com.example.bottomnavigation.base.BaseAdapter
import com.example.bottomnavigation.databinding.FragmentMatchBinding
import com.example.bottomnavigation.model.MessageModel
import com.example.bottomnavigation.util.MockData
import com.example.bottomnavigation.util.Util
import de.hdodenhof.circleimageview.CircleImageView

class MatchFragment : Fragment() {

    private var _binding: FragmentMatchBinding? = null
    private val binding get() = _binding!!
    private var adapter: BaseAdapter<MessageModel>? = null
    private var shuffle: ArrayList<MessageModel>? = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMatchBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        shuffle = MockData.shuffle()
        setAdapter()
    }
    private fun setAdapter() {
        adapter =
            BaseAdapter(requireContext(), R.layout.row_item_talk, shuffle) { v, item, position ->
                val userImage = v!!.findViewById(R.id.userImage) as CircleImageView
                val userName = v.findViewById(R.id.userName) as TextView
                val userMessage = v.findViewById(R.id.userMessage) as TextView

                Util.loadImageCircle(userImage,item.userImage, Util.getProgressDrawable(userImage.context))

                userName.text = item.userName
                userMessage.text = item.userMessage

                userImage.setOnClickListener {
                    findNavController().navigate(R.id.action_matchFragment_to_shuffleDetailFragment)
                }

            }
        binding.recyclerStory.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}