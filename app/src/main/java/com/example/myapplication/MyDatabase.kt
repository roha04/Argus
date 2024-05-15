package com.example.myapplication



import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.myapplication.dao.CrimeReportDao
import com.example.myapplication.dao.RoleDao
import com.example.myapplication.dao.UserDao
import com.example.myapplication.entities.CrimeReport
import com.example.myapplication.entities.Role
import com.example.myapplication.entities.User


@Database(entities = [User::class, Role::class, CrimeReport::class], version = 1, exportSchema = false)
abstract class MyDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
    abstract fun roleDao(): RoleDao
    abstract fun crimeReportDao(): CrimeReportDao
}