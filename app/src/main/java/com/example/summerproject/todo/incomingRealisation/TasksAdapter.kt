package com.example.summerproject.todo.incomingRealisation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.summerproject.databinding.ItemTaskBinding
import com.example.summerproject.todo.incomingRealisation.TaskHolder
import com.example.summerproject.todo.incomingRealisation.logic.Task

class TasksAdapter(
    private var list: List<Task>,
    private val onItemClick: (Task) -> Unit,
) : RecyclerView.Adapter<TaskHolder>() {


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): TaskHolder = TaskHolder(
        ItemTaskBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        ),
        onItemClick
    )

    override fun onBindViewHolder(
        holder: TaskHolder,
        position: Int,
    ) {
        holder.onBind(list[position])
    }


    override fun getItemCount(): Int = list.size
}