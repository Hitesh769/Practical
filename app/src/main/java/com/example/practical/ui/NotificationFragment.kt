package com.example.practical.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.practical.R
import com.example.practical.adapter.GenericListAdapter
import com.example.practical.databinding.FragmentNotificationBinding
import com.example.practical.databinding.FragmentSecondBinding
import com.example.practical.model.NotificationRespose

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class NotificationFragment : Fragment() {

    private var _binding: FragmentNotificationBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentNotificationBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var list=ArrayList<NotificationRespose>()
        list.add(NotificationRespose("Get 30% off","Use code clean 30 & get 30% off on your car service"))
        list.add(NotificationRespose("Congratulation","Congratulation.. your car has successfully serviced"))
        list.add(NotificationRespose("Rate us now","Your feedback are very important for us. Tab here to rate us now"))
        setSubmitAdaperListing(list)
      /*  binding.buttonSecond.setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }*/
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
    private fun setSubmitAdaperListing(list: List<NotificationRespose>?) {
        binding.rvNotification.layoutManager =
            LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        binding.rvNotification.adapter = GenericListAdapter<NotificationRespose>(
            list as ArrayList<NotificationRespose>, R.layout.row_notification,
            object : GenericListAdapter.OnListItemClickListener<NotificationRespose> {
                override fun onListItemClicked(selItem: NotificationRespose, extra: Any?, position: Int) {

                }

            })

    }
}