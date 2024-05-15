package com.example.myapplication.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.myapplication.entities.Role

@Dao
interface RoleDao {
    @Query("SELECT * FROM roles WHERE roleId = :roleId")
    fun getRoleById(roleId: Int): Role?

    @Insert
    fun insertRole(role: Role)

    @Delete
    fun deleteRole(role: Role)

    @Query("SELECT * FROM roles")
    fun getAllRoles(): List<Role>

    @Update
    fun updateRole(role: Role)
}
