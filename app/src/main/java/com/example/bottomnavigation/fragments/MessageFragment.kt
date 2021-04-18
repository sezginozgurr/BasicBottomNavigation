package com.example.bottomnavigation.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.bottomnavigation.R
import com.example.bottomnavigation.base.BaseAdapter
import com.example.bottomnavigation.databinding.FragmentMessageBinding
import com.example.bottomnavigation.model.FollowModel
import com.example.bottomnavigation.model.MessageModel
import com.example.bottomnavigation.util.MockData
import com.example.bottomnavigation.util.Util
import de.hdodenhof.circleimageview.CircleImageView

class MessageFragment : Fragment() {

    private var _binding: FragmentMessageBinding? = null
    private val binding get() = _binding!!
    private var adapter: BaseAdapter<MessageModel>? = null
    private var messageList: ArrayList<MessageModel>? = arrayListOf()
    private var adapterFollowing: BaseAdapter<FollowModel>? = null
    private var followingList: ArrayList<FollowModel>? = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMessageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        messageList = MockData.getMessageData()
        followingList = MockData.followingList()
        setAdapter()
        setAdapterFollowing()
    }

    private fun setAdapterFollowing() {
        adapterFollowing =
            BaseAdapter(requireContext(), R.layout.row_item_follow, followingList) { v, item, position ->
                val followImage = v!!.findViewById(R.id.followingImage) as CircleImageView
                val userName = v.findViewById(R.id.followerName) as TextView

                Util.loadImageCircle(followImage,item.followingImage,Util.getProgressDrawable(followImage.context))

                userName.text = item.userName

            }
        binding.recyclerFollowing.adapter = adapterFollowing
    }

    private fun setAdapter() {
            adapter =
                BaseAdapter(requireContext(), R.layout.row_item_talk, messageList) { v, item, position ->
                    val userImage = v!!.findViewById(R.id.userImage) as CircleImageView
                    val userName = v.findViewById(R.id.userName) as TextView
                    val userMessage = v.findViewById(R.id.userMessage) as TextView

               Util.loadImageCircle(userImage,item.userImage,Util.getProgressDrawable(userImage.context))

                    userName.text = item.userName
                    userMessage.text = item.userMessage

                }
            binding.recyclerMessage.adapter = adapter
        }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}