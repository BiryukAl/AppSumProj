package com.example.summerproject.todo.incomingRealisation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.summerproject.R
import com.example.summerproject.databinding.FragmentAddTaskBinding
import com.example.summerproject.ui.MainActivity

class AddTaskFragment: Fragment(R.layout.fragment_add_task) {

    private lateinit var binding: FragmentAddTaskBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentAddTaskBinding.bind(view)

        with(binding){
            floatingActionButtonDone.setOnClickListener(){

                val body: String = editTextBodyTask.text.toString()
                MainActivity.getDataBase().addTask(body)


                findNavController().navigate(
                    R.id.action_addTaskFragment_to_incomingFragment)
            }
        }


    }


    companion object{

        private const val ID_TASK = "ID_TASK"

        fun createBundle(int: Int): Bundle {
            val bundle = Bundle()
            bundle.putInt(ID_TASK, int)

            return bundle

        }
    }


}