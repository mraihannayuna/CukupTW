package com.example.cukuptw.data.network

import com.example.cukuptw.data.model.NewsResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    // OKEZONE

    @GET("/okezone/terbaru/")
    fun getOkezoneTerbaruNews(
        @Query("q") q: String = "Terbaru",
        @Query("language") language: String = "id",
        @Query("pageSize") pageSize: Int = 10,
        @Query("sortBy") sortBy: String = "Terbaru"
    ): Call<NewsResponse>

    @GET("/okezone/techno/")
    fun getOkezoneTechnoNews(
        @Query("q") q: String = "Techno",
        @Query("language") language: String = "id",
        @Query("pageSize") pageSize: Int = 10,
        @Query("sortBy") sortBy: String = "Techno"
    ): Call<NewsResponse>

    @GET("/okezone/lifestyle/")
    fun getOkezoneLifestyleNews(
        @Query("q") q: String = "Lifestyle",
        @Query("language") language: String = "id",
        @Query("pageSize") pageSize: Int = 10,
        @Query("sortBy") sortBy: String = "Lifestyle"
    ): Call<NewsResponse>

    // REPUBLIKA

    @GET("/republika/terbaru/")
    fun getRepublikaTerbaruNews(
        @Query("q") q: String = "Terbaru",
        @Query("language") language: String = "id",
        @Query("pageSize") pageSize: Int = 10,
        @Query("sortBy") sortBy: String = "Terbaru"
    ): Call<NewsResponse>

    @GET("/republika/news/")
    fun getRepublikaNewsNews(
        @Query("q") q: String = "News",
        @Query("language") language: String = "id",
        @Query("pageSize") pageSize: Int = 10,
        @Query("sortBy") sortBy: String = "News"
    ): Call<NewsResponse>

    @GET("/republika/internasional/")
    fun getRepublikaInternasionalNews(
        @Query("q") q: String = "Internasional",
        @Query("language") language: String = "id",
        @Query("pageSize") pageSize: Int = 10,
        @Query("sortBy") sortBy: String = "Internasional"
    ): Call<NewsResponse>

    // SINDONEWS

    @GET("/sindonews/terbaru/")
    fun getSindonewsTerbaruNews(
        @Query("q") q: String = "Terbaru",
        @Query("language") language: String = "id",
        @Query("pageSize") pageSize: Int = 10,
        @Query("sortBy") sortBy: String = "Terbaru"
    ): Call<NewsResponse>

    @GET("/sindonews/international/")
    fun getSindonewsInternationalNews(
        @Query("q") q: String = "International",
        @Query("language") language: String = "id",
        @Query("pageSize") pageSize: Int = 10,
        @Query("sortBy") sortBy: String = "International"
    ): Call<NewsResponse>

    @GET("/sindonews/tekno/")
    fun getSindonewsTeknoNews(
        @Query("q") q: String = "Tekno",
        @Query("language") language: String = "id",
        @Query("pageSize") pageSize: Int = 10,
        @Query("sortBy") sortBy: String = "Tekno"
    ): Call<NewsResponse>

}