package com.example.summerproject.todo.incomingRealisation.db

import com.example.summerproject.todo.incomingRealisation.logic.Task
import kotlin.collections.ArrayList

class MyDataBase() {
    var taskDB: ArrayList<Task>

    var count :Int = 1

    init {
        count  = 1
        taskDB = ArrayList()
    }


    fun addTask(body: String){
        taskDB.add(Task(count, body, false))
        count++
    }

    fun getTasks(): List<Task> {
     return taskDB
    }


}