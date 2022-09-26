package com.example.mvvmimplementation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmimplementation.R

class MainActivity : AppCompatActivity()  , View.OnClickListener{
    override fun onClick(view: View) {
        when(view.id){
            R.id.btnGetMovie -> {
                tvMovieName.visibility = View.VISIBLE
                movieViewModel.getMovie()
            }
        }
    }

    private lateinit var tvMovieName : TextView
    private lateinit var btnGetMovie : Button
    private lateinit var movieViewModel: MovieViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()

        movieViewModel.mutableLiveData.observe(this
        ) { movieModel -> tvMovieName.text = movieModel.movieName }

        btnGetMovie.setOnClickListener(this)
    }

    private fun init(){
        tvMovieName = findViewById(R.id.tvMovieName)
        btnGetMovie = findViewById(R.id.btnGetMovie)

        movieViewModel = ViewModelProvider(this)[MovieViewModel::class.java]
    }
}