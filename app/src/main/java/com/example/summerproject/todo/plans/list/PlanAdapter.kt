package com.example.summerproject.todo.plans.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.summerproject.R
import com.example.summerproject.databinding.ItemPlanTodoBinding

class PlanAdapter(
    private val list: List<Plan>,
    private val onItemClick: (Plan) -> Unit,
): RecyclerView.Adapter<PlanHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlanHolder = PlanHolder(
        binding = ItemPlanTodoBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        ), onItemClick
    )

    override fun onBindViewHolder(holder: PlanHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size
}