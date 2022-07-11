package com.example.summerproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
//import com.example.summerproject.todo.data.DataBaseCreator
//import com.example.summerproject.todo.data.ToDoDatabase
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

//    lateinit var todoBase: ToDoDatabase

    private lateinit var controller: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        controller =
            (supportFragmentManager.findFragmentById(R.id.container) as NavHostFragment).navController

//        todoBase = DataBaseCreator().initDB(this)

        // подключаем наш меню снизу
        val bottomView = findViewById<BottomNavigationView>(R.id.bottom_view)
        bottomView.setupWithNavController(controller)
    }
}