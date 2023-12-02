package com.example.workoutapp.database

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "history-table")
data class HistoryEntity(
    @PrimaryKey
    val date:String

){

}
