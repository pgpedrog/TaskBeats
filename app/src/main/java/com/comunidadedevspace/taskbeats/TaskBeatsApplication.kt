package com.comunidadedevspace.taskbeats

import android.app.Application
import androidx.room.Room
import com.comunidadedevspace.taskbeats.data.local.AppDatabase

class TaskBeatsApplication : Application() {

    private lateinit var database : AppDatabase


    override fun onCreate() {
        super.onCreate()

        database = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "taskbeats-database"
        ).build()
    }

    fun getAppDataBase(): AppDatabase {
        return database
    }
}