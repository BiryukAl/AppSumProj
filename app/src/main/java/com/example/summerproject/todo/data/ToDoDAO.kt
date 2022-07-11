//package com.example.summerproject.todo.data
//
//import androidx.lifecycle.LiveData
//import androidx.room.*
//
//@Dao
//interface ToDoDAO {
//
//    @Insert(onConflict = OnConflictStrategy.REPLACE)
//    fun insertPlan(plan: Plan)
//
//    @Query("SELECT * FROM plan_table ORDER BY id DESC")
//    fun getAllPlans(): LiveData<List<Plan>>
//
//    @Delete()
//    fun deleteAll(plan: Plan)
//}