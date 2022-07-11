package com.example.summerproject.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.summerproject.R
import com.example.summerproject.todo.PlanRealisation.dbPLan.PlanDatabase
import com.example.summerproject.todo.incomingRealisation.db.MyDataBase
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var controller: NavController




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        controller =
            (supportFragmentManager.findFragmentById(R.id.container) as NavHostFragment).navController

        // подключаем наш меню снизу
        val bottomView = findViewById<BottomNavigationView>(R.id.bottom_view)
        bottomView.setupWithNavController(controller)
    }


    companion object{
        private val database = MyDataBase()
        private val databasePlan = PlanDatabase()


        fun getDataBase(): MyDataBase {
            return database
        }

        fun getDataBasePlan(): PlanDatabase {
            return databasePlan
        }
    }



}