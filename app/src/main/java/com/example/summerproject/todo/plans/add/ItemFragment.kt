package com.example.summerproject.todo.plans.add

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.summerproject.R
import com.example.summerproject.databinding.AddItemPlanBinding


class ItemFragment : Fragment(R.layout.add_item_plan) {


    private var _binding: AddItemPlanBinding? = null
    private val binding get() = _binding!!


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = AddItemPlanBinding.bind(view)
        binding.btnAddPlan.setOnClickListener {
            findNavController().navigate(R.id.action_itemFragment_to_plansFragment)
        }
    }

}
