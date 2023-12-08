package com.example.cukuptw.data.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.cukuptw.data.model.NewsResponse
import com.example.cukuptw.data.network.ApiClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class NewsRepository {

    // OKEZONE

    private val _okezoneTerbaruNews = MutableLiveData<NewsResponse>()
    val okezoneTerbaruNews: LiveData<NewsResponse> = _okezoneTerbaruNews

    private val _okezoneTechnoNews = MutableLiveData<NewsResponse>()
    val okezoneTechnoNews: LiveData<NewsResponse> = _okezoneTechnoNews

    private val _okezoneLifestyleNews = MutableLiveData<NewsResponse>()
    val okezoneLifestyleNews: LiveData<NewsResponse> = _okezoneLifestyleNews

    //REPUBLIKA

    private val _republikaTerbaruNews = MutableLiveData<NewsResponse>()
    val republikaTerbaruNews: LiveData<NewsResponse> = _republikaTerbaruNews

    private val _republikaNewsNews = MutableLiveData<NewsResponse>()
    val republikaNewsNews: LiveData<NewsResponse> = _republikaNewsNews

    private val _republikaInternasionalNews = MutableLiveData<NewsResponse>()
    val republikaInternasionalNews: LiveData<NewsResponse> = _republikaInternasionalNews

    //SINDONEWS

    private val _sindonewsTerbaruNews = MutableLiveData<NewsResponse>()
    val sindonewsTerbaruNews: LiveData<NewsResponse> = _sindonewsTerbaruNews

    private val _sindonewsInternationalNews = MutableLiveData<NewsResponse>()
    val sindonewsInternationalNews: LiveData<NewsResponse> = _sindonewsInternationalNews

    private val _sindonewsTeknoNews = MutableLiveData<NewsResponse>()
    val sindonewsTeknoNews: LiveData<NewsResponse> = _sindonewsTeknoNews

    //LOADING
    private val _isLoading = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean> = _isLoading


    // ------------------------------------ Terbaru smua campur 3 -------------------------------

    fun getOkezoneTerbaruNews() {
        ApiClient.getAllService.getOkezoneTerbaruNews()
            .enqueue(object  : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    _isLoading.value = false
                    if(response.isSuccessful){
                        val responseBody = response.body()
                        if(responseBody != null){
                            _okezoneTerbaruNews.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code" + response.code()
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }
            })
    }

    fun getRepublikaTerbaruNews() {
        ApiClient.getAllService.getRepublikaTerbaruNews()
            .enqueue(object  : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    _isLoading.value = false
                    if(response.isSuccessful){
                        val responseBody = response.body()
                        if(responseBody != null){
                            _republikaTerbaruNews.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code" + response.code()
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }
            })
    }

    fun getSindonewsTerbaruNews() {
        ApiClient.getAllService.getSindonewsTerbaruNews()
            .enqueue(object  : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    _isLoading.value = false
                    if(response.isSuccessful){
                        val responseBody = response.body()
                        if(responseBody != null){
                            _sindonewsTerbaruNews.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code" + response.code()
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }
            })
    }

    // ------------------------------------ tekno 2 ama news 1  -------------------------------

    fun getOkezoneTechnoNews() {
        ApiClient.getAllService.getOkezoneTechnoNews()
            .enqueue(object  : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    _isLoading.value = false
                    if(response.isSuccessful){
                        val responseBody = response.body()
                        if(responseBody != null){
                            _okezoneTechnoNews.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code" + response.code()
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }
            })
    }

    fun getSindonewsTeknoNews() {
        ApiClient.getAllService.getSindonewsTeknoNews()
            .enqueue(object  : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    _isLoading.value = false
                    if(response.isSuccessful){
                        val responseBody = response.body()
                        if(responseBody != null){
                            _sindonewsTeknoNews.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code" + response.code()
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }
            })
    }

    fun getRepublikaNewsNews() {
        ApiClient.getAllService.getRepublikaNewsNews()
            .enqueue(object  : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    _isLoading.value = false
                    if(response.isSuccessful){
                        val responseBody = response.body()
                        if(responseBody != null){
                            _republikaNewsNews.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code" + response.code()
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }
            })
    }

    // ------------------------------------ internasional 2 lifestyle 1 -------------------------------

    fun getOkezoneLifestyleNews() {
        ApiClient.getAllService.getOkezoneLifestyleNews()
            .enqueue(object  : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    _isLoading.value = false
                    if(response.isSuccessful){
                        val responseBody = response.body()
                        if(responseBody != null){
                            _okezoneLifestyleNews.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code" + response.code()
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }
            })
    }

    fun getRepublikaInternasionalNews() {
        ApiClient.getAllService.getRepublikaInternasionalNews()
            .enqueue(object  : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    _isLoading.value = false
                    if(response.isSuccessful){
                        val responseBody = response.body()
                        if(responseBody != null){
                            _republikaInternasionalNews.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code" + response.code()
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }
            })
    }

    fun getSindonewsInternationalNews() {
        ApiClient.getAllService.getSindonewsInternationalNews()
            .enqueue(object  : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    _isLoading.value = false
                    if(response.isSuccessful){
                        val responseBody = response.body()
                        if(responseBody != null){
                            _sindonewsInternationalNews.postValue(response.body())
                        }
                    } else {
                        Log.e(
                            "Repository",
                            "onResponse: Call error with HTTP status code" + response.code()
                        )
                    }
                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                    Log.e(
                        "Repository",
                        "onFailure: " + t.localizedMessage
                    )
                }
            })
    }

}