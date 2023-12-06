package com.comunidadedevspace.taskbeats.data.remote

import com.comunidadedevspace.taskbeats.BuildConfig
import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitModule {

    fun createNewsService(): NewsService {

        val retrofit = Retrofit
            .Builder()
            .baseUrl("https://api.thenewsapi.com/v1/news/")
            .addConverterFactory(GsonConverterFactory.create(Gson()))


      return retrofit
            .build()
            .create(NewsService::class.java)
    }

}