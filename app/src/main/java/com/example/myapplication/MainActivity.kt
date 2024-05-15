package com.example.myapplication

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.room.Room
import com.example.myapplication.dao.CrimeReportDao
import com.example.myapplication.dao.RoleDao
import com.example.myapplication.dao.UserDao
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val db = Room.databaseBuilder(
            applicationContext,
            MyDatabase::class.java, "database-name"
        ).build()

        val userDao: UserDao = db.userDao()
        val roleDao: RoleDao = db.roleDao()
        val crimeReportDao: CrimeReportDao = db.crimeReportDao()

        setContent {
            MyApplicationTheme {
                // Your Compose UI code here
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    Text(text = "Hello World!")
                }
            }
        }
    }
}
