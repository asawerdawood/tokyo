package com.example.asawer.util

import com.example.asawer.data.City

class CsvParse {

    fun parse(line : String) : City {
        val tokens = line.split(",")
        return City(
            country = tokens[Constant.ColumnIndex.COUNTRY],
            total = tokens[Constant.ColumnIndex.TOTAL],
            bronze = tokens[Constant.ColumnIndex.BROZE],
             silver= tokens[Constant.ColumnIndex.SILVER],
            gold = tokens[Constant.ColumnIndex.GOLD],
            rank = tokens[Constant.ColumnIndex.RANK],
            )
    }
}