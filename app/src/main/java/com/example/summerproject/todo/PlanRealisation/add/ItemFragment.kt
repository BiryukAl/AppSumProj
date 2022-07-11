package com.example.summerproject.todo.PlanRealisation.add

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.summerproject.R
import com.example.summerproject.databinding.AddPlanBinding
import com.example.summerproject.ui.MainActivity

class ItemFragment : Fragment(R.layout.add_plan) {


    private var _binding: AddPlanBinding? = null
    private val binding get() = _binding!!


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = AddPlanBinding.bind(view)
        binding.btnAddPlan.setOnClickListener {

            val task: String = binding.etPlanName.text.toString()
            val date: String = binding.etPlanDate.text.toString()
            MainActivity.getDataBasePlan().addPlan(task, date)

            findNavController().navigate(R.id.action_itemFragment_to_plansFragment)
        }
    }

    companion object {

        private const val id = "id"

        fun createBundle(int: Int): Bundle {
            val bundle = Bundle()
            bundle.putInt(id, int)

            return bundle

        }
    }

}
