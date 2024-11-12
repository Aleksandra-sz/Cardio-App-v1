package com.example.cardioapp

import android.content.SharedPreferences
import org.json.JSONArray

class CacheTools (private val sharedPreferences: SharedPreferences) {
    fun addOneToArray(key: String, id: Int) {
        val array = getIntArray(key)
        saveIntArray(key, array.plus(id))
    }

    fun saveIntArray(key: String, intArray: IntArray) {
        val jsonArray = JSONArray()
        for (value in intArray) {
            jsonArray.put(value)
        }
        sharedPreferences.edit().putString(key, jsonArray.toString()).apply()
    }

    fun getIntArray(key: String): IntArray {
        val jsonString = sharedPreferences.getString(key, null)
        return if (jsonString != null) {
            val jsonArray = JSONArray(jsonString)
            val intArray = IntArray(jsonArray.length())
            for (i in 0 until jsonArray.length()) {
                intArray[i] = jsonArray.getInt(i)
            }
            intArray
        } else {
            intArrayOf()
        }
    }

    fun generateNewId(key: String): Int {
        val array = getIntArray(key)
        if (array.isEmpty()){
            return 1
        }
        return array.last()+1
    }
}
