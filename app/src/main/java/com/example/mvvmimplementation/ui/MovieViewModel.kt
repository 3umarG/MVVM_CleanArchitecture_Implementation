package com.example.mvvmimplementation.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mvvmimplementation.pojo.MovieModel

class MovieViewModel : ViewModel() {
    val mutableLiveData = MutableLiveData<MovieModel>()

    private fun getDataFromDataBase(): MovieModel = MovieModel("Star Wars",22,"Action Movie")

   fun getMovie(){
       mutableLiveData.postValue(getDataFromDataBase())
   }
}