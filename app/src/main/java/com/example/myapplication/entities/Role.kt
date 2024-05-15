package com.example.myapplication.entities


import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "roles")
data class Role(
    @PrimaryKey val roleId: Int,
    val roleName: String
)