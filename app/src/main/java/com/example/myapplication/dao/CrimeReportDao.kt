package com.example.myapplication.dao


import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.myapplication.entities.CrimeReport

@Dao
interface CrimeReportDao {
    @Query("SELECT * FROM crime_reports WHERE reportId = :reportId")
    fun getCrimeReportById(reportId: Int): CrimeReport?

    @Insert
    fun insertCrimeReport(crimeReport: CrimeReport)

    @Delete
    fun deleteCrimeReport(crimeReport: CrimeReport)

    @Query("SELECT * FROM crime_reports")
    fun getAllCrimeReports(): List<CrimeReport>

    @Update
    fun updateCrimeReport(crimeReport: CrimeReport)
}
