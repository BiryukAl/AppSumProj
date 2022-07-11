package com.example.summerproject.todo

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.summerproject.R
import com.example.summerproject.databinding.FragmentToDoIncomingBinding
import com.example.summerproject.todo.db.MyDataBase
import com.example.summerproject.ui.MainActivity

class IncomingFragment: Fragment (R.layout.fragment_to_do_incoming) {

    private lateinit var binding: FragmentToDoIncomingBinding

    private var adapter :TasksAdapter?  = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding = FragmentToDoIncomingBinding.bind(view)

        adapter = TasksAdapter(MainActivity.getDataBase().getTasks()) {
          it.complete = !it.complete
        }

        binding.rvIncomingTask.adapter = adapter









        with(binding){
            floatingActionButtonAddTask.setOnClickListener(){
                findNavController().navigate(
                    R.id.action_incomingFragment_to_addTaskFragment,

                    AddTaskFragment.createBundle(it.id))


            }
        }

    }

}