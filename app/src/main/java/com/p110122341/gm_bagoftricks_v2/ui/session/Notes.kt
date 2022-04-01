package com.p110122341.gm_bagoftricks_v2.ui.session

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "notesTable")

class Note(@ColumnInfo(name="Title") val noteTitle : String,@ColumnInfo(name = "description")val noteDescription :String,@ColumnInfo(name= "timestamp")val timeStamp :String){
    @PrimaryKey(autoGenerate = true) var id = 0
}