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
import com.example.practical.databinding.FragmentPrivacyPolicyBinding
import com.example.practical.databinding.FragmentSecondBinding
import com.example.practical.model.NotificationRespose

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class PrivacyPolicyFragment : Fragment() {

    private var _binding: FragmentPrivacyPolicyBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentPrivacyPolicyBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}