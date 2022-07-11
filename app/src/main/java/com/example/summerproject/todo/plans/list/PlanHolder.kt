package com.example.summerproject.todo.plans.list

import androidx.recyclerview.widget.RecyclerView
import com.example.summerproject.databinding.ItemPlanTodoBinding
import com.example.summerproject.todo.plans.list.Plan

class PlanHolder(
    // передаем View
    private val binding: ItemPlanTodoBinding,
    private  val onItemClick: (Plan) -> Unit,
): RecyclerView.ViewHolder(binding.root) {

fun onBind(plan: Plan){
        with(binding){
            tvPlanTask.text = plan.task
            tvPlanData.text = plan.task_at
            root.setOnClickListener{
                // неявный вызов функции
                onItemClick.invoke(plan)
            }
        }
    }
}