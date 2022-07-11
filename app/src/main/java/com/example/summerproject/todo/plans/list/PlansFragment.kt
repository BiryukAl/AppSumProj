package com.example.summerproject.todo.plans.list
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.summerproject.R
import com.example.summerproject.databinding.FragmentToDoPlansBinding
import com.google.android.material.snackbar.Snackbar

class PlansFragment : Fragment(R.layout.fragment_to_do_plans) {

    private var _binding: FragmentToDoPlansBinding? = null
    private val binding get() = _binding!!

    private var adapter: PlanAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentToDoPlansBinding.bind(view)

        binding.btnPlan.setOnClickListener {
            findNavController().navigate(
                R.id.action_plansFragment_to_itemFragment
            )
        }

        // свойство синтак-го сахара котлина, передавая последним аргументом, лямбда
        // функцию ее можно вытащить за пределы скобок
        adapter = PlanAdapter(PlanRepository.plans) {
            Snackbar.make(binding.root, "Plans id ${it.id}", Snackbar.LENGTH_LONG).show()
        }
        binding.rvPlans.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}