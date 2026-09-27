package com.petalplanner

data class Task(
    val id: Long,
    val title: String,
    val time: Long,
    val done: Boolean = false
)
