package com.example.summerproject.todo.db

import android.util.Log
import com.example.summerproject.todo.logic.Task
import java.util.*
import kotlin.collections.ArrayList

class MyDataBase() {
    var taskDB: ArrayList<Task>

    var count :Int = 1

    init {
        count  = 1
        taskDB = ArrayList()
    }

//xcb
    fun addTask(body: String){
        taskDB.add(Task(count, body, false))
        count++
    }

    fun getTasks(): List<Task> {
     return taskDB
    }


}