package com.example.summerproject.todo.plans.list

import com.example.summerproject.todo.plans.list.Plan

// object - класс который хранится в единственном экземпляре
// это хардкод за место этого подключим базу данных
// TODO: переделать этот класс в базу данных
object PlanRepository {
    val plans = arrayListOf<Plan>(
        Plan(0, "помыть посуду", "09.07.2022"),
        Plan(1, "wtf", "10.07.2022"),
        Plan(2, "pop pop pop", "09.08.2022"),
        Plan(3, "have breakfast", "12.07.2022"),
        Plan(4, "nothing", "13.07.2022"),
        Plan(5, "покататься на велосипеде", "09.09.2022"),
        Plan(6, "something", "09.07.2022"),

        )

}