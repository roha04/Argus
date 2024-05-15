package com.example.myapplication.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "crime_reports")
data class CrimeReport(
    @PrimaryKey val reportId: Int,
    val userId: Int,
    val crimeCategory: String,
    val crimeDescription : String,
    val location: String,
    val dateReported: Long,
    val status: String
)