package com.example.summerproject.todo.db

import com.example.summerproject.todo.logic.Task

class MyDataBase() {
    var taskDB : ArrayList<Task>

    var count :Int = 1

    init {
        count  = 1
        taskDB  = ArrayList()
    }


    fun addTask(body: String,){

        taskDB.add(Task(count, body, false))
        count++
    }

    fun getTasks(): ArrayList<Task>{
     return taskDB
    }







}