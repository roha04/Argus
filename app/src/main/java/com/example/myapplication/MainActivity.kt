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
import com.example.myapplication.entities.User
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)

            val db = Room.databaseBuilder(
                applicationContext,
                MyDatabase::class.java, "MyDatabase"
            ).allowMainThreadQueries().fallbackToDestructiveMigration().build()

            val userDao: UserDao = db.userDao()

            val newUser = User(1,"USer1","12345678","user@example.com",1,1,false);
            userDao.insertUser(newUser)

            setContent {
                // Your Compose UI code here
            }
        }

}
