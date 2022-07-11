package com.example.summerproject.todo.PlanRealisation.dbPLan

import com.example.summerproject.todo.plans.list.Plan

class PlanDatabase {
    var taskDB: ArrayList<Plan>

    var count :Int = 1

    init {
        count  = 1
        taskDB = ArrayList()
    }


    fun addPlan(task: String, date: String){
        taskDB.add(Plan(count, task, date))
        count++
    }

    fun getPlan(): ArrayList<Plan> {
        return taskDB
    }


}
