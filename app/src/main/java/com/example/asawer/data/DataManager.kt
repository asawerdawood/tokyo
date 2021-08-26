package com.example.asawer.data

object DataManager {
    val _cityList: MutableList<City> = mutableListOf<City>()
    private var _index = 0
    fun getCityList() : MutableList<City> = _cityList


    fun addPost(city: City){
        _cityList.add(city)
    }

    fun getCurrentPost(): City = _cityList[_index]

}