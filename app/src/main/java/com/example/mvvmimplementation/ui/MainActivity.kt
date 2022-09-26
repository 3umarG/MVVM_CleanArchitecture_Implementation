package com.example.mvvmimplementation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmimplementation.R
import com.example.mvvmimplementation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var movieViewModel: MovieViewModel
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        movieViewModel = ViewModelProvider(this)[MovieViewModel::class.java]

        binding.movieViewModel = this.movieViewModel
        binding.lifecycleOwner = this
    }

}