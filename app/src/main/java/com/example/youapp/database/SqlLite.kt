package com.example.youapp.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.os.Build
import android.os.Parcel
import android.os.Parcelable
import androidx.annotation.RequiresApi

@RequiresApi(Build.VERSION_CODES.P)
class SqlLite(context: Context?, name: String?, version: Int, openParams: SQLiteDatabase.OpenParams) :
    SQLiteOpenHelper(context, name, version, openParams) {


    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(
            "CREATE TABLE WORDS" +
                    "(_id INTEGER PRIMARY KEY AUTOINCREMENT," +
                    "word TEXT," +
                    "language TEXT," +
                    "translate TEXT)"
        )
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }
}