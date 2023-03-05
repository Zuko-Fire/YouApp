package com.example.youapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.youapp.databinding.ActivityMainBinding
import com.example.youapp.databinding.ItemWordBinding
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: WordsAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val navigationView = findViewById<NavigationView>(R.id.navigationView)


        val navController = Navigation.findNavController(this,R.id.navHostFragment)
        NavigationUI.setupWithNavController(navigationView, navController )


    }

}