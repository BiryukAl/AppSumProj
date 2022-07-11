//package com.example.summerproject.todo.data
//
//import android.app.Activity
//import androidx.room.Database
//import androidx.room.Room
//
//class DataBaseCreator {
//    fun createDBInstance(activity: Activity): ToDoDatabase {
//        return Room.databaseBuilder(activity, ToDoDatabase::class.java, "dao")
//            .allowMainThreadQueries()
//            .build()
//    }
//
//    fun initDB(activity: Activity): ToDoDatabase {
//        val db = createDBInstance(activity)
//        val taskDao = db.toDoDAO()
//        return db
//    }
//}