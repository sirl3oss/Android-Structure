package com.tisco.testwithdi.data.db

import androidx.room.TypeConverter
import com.tisco.testwithdi.data.model.Source

class Converters {
    @TypeConverter
    fun fromSource(source: Source):String{
           return source.name
    }
    @TypeConverter
    fun toSource(name:String): Source {
        return Source(name,name)
    }
}
