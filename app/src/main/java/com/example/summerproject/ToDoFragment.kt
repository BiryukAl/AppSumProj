package com.example.summerproject

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.summerproject.databinding.FragmentToDoBinding

class ToDoFragment:Fragment (R.layout.fragment_to_do) {
    private var _binding: FragmentToDoBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentToDoBinding.bind(view)

        with(binding){
            btnIncoming.setOnClickListener {
                findNavController().navigate(
                    R.id.action_toDoFragment_to_incomingFragment,
                    Bundle().apply {
                    })
            }

            btnToday.setOnClickListener {
                findNavController().navigate(
                    R.id.action_toDoFragment_to_todayFragment,
                    Bundle().apply {
                    })

            }

            btnPlans.setOnClickListener {
                findNavController().navigate(
                R.id.action_toDoFragment_to_plansFragment,
                Bundle().apply {
                })

            }
        }
    }
}