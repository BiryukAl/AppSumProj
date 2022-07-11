package com.example.summerproject.todo

import androidx.recyclerview.widget.RecyclerView
import com.example.summerproject.databinding.ItemTaskBinding
import com.example.summerproject.todo.logic.Task

class TaskHolder(
    private val binding: ItemTaskBinding,
    private val onItemClick: (Task) -> Unit,
) : RecyclerView.ViewHolder(binding.root) {

    fun onBind(task: Task){
        with(binding){
            textTask.text = task.body
            checkBoxComplete.isChecked  = task.complete

            root.setOnClickListener {
                onItemClick(task)

            }
        }
    }


}