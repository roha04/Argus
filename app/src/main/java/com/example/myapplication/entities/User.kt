package com.example.myapplication.entities


import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "users")
data class User(
    @PrimaryKey val userId: Int,
    val username: String,
    val password: String,
    val email: String,
    val roleId: Int,
    val profileId: Int,
    val isAdmin: Boolean


)