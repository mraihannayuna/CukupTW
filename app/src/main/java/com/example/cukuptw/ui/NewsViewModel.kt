package com.example.cukuptw.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.cukuptw.data.model.NewsResponse
import com.example.cukuptw.data.repository.NewsRepository

class NewsViewModel(private val repository: NewsRepository) : ViewModel() {

    // ------------------------------------ okezone -------------------------------

    val okezoneTerbaruNews: LiveData<NewsResponse> = repository.okezoneTerbaruNews
    val okezoneTechnoNews: LiveData<NewsResponse> = repository.okezoneTechnoNews
    val okezoneLifestyleNews: LiveData<NewsResponse> = repository.okezoneLifestyleNews

    // ------------------------------------ republika-------------------------------

    val republikaTerbaruNews: LiveData<NewsResponse> = repository.republikaTerbaruNews
    val republikaNewsNews: LiveData<NewsResponse> = repository.republikaNewsNews
    val republikaInternasionalNews: LiveData<NewsResponse> = repository.republikaInternasionalNews

    // ------------------------------------ sindonews -------------------------------

    val sindonewsTerbaruNews: LiveData<NewsResponse> = repository.sindonewsTerbaruNews
    val sindonewsTeknoNews: LiveData<NewsResponse> = repository.sindonewsTeknoNews
    val sindonewsInternationalNews: LiveData<NewsResponse> = repository.sindonewsInternationalNews

    // ------------------------------------ loading -------------------------------
    val isLoading: LiveData<Boolean> = repository.isLoading

    // ------------------------------------ GET Okezone -------------------------------

    fun getOkezoneTerbaruNews() {
        repository.getOkezoneTerbaruNews()
    }

    fun getOkezoneTechnoNews() {
        repository.getOkezoneTechnoNews()
    }

    fun getOkezoneLifestyeNews() {
        repository.getOkezoneLifestyleNews()
    }

    // ------------------------------------ GET Republika -------------------------------

    fun getRepublikaTerbaruNews() {
        repository.getRepublikaTerbaruNews()
    }

    fun getRepublikaNewsNews() {
        repository.getRepublikaNewsNews()
    }

    fun getRepublikaInternasionalNews() {
        repository.getRepublikaInternasionalNews()
    }

    // ------------------------------------ GET Sindonews -------------------------------

    fun getSindonewsTerbaruNews() {
        repository.getSindonewsTerbaruNews()
    }

    fun getSindonewsTeknoNews() {
        repository.getSindonewsTeknoNews()
    }

    fun getSindonewsInternationalNews() {
        repository.getSindonewsInternationalNews()
    }

}