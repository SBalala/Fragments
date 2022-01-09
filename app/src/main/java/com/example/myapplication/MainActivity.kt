package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val controller = findNavController(R.id.fragmentController)
        val navigation = findViewById<BottomNavigationView>(R.id.navigationMenu)

        val fragmentSet = setOf<Int>(R.id.send, R.id.inbox, R.id.ezio, R.id.babyYoda)

        setupActionBarWithNavController(controller, AppBarConfiguration(fragmentSet))
        navigation.setupWithNavController(controller)

    }
}