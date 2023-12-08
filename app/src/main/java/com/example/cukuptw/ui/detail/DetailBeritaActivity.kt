package com.example.cukuptw.ui.detail

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.cukuptw.R
import com.example.cukuptw.data.model.ArticlesItem
import com.example.cukuptw.databinding.ActivityDetailBeritaBinding
import com.squareup.picasso.Picasso

class DetailBeritaActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBeritaBinding
    companion object {
        const val DATA_NEWS = "data_news"
        const val DATE_NEWS = "date_news"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBeritaBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val dataNews = intent.getParcelableExtra<ArticlesItem>(DATA_NEWS)
        val date = intent.getStringExtra(DATE_NEWS)
        setupMyXML(dataNews, date)
        setupWebView(dataNews)
        setSupportActionBar(binding.toolbarDetail)

        supportActionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            title = "Kembali"
        }

    }

    private fun setupWebView(dataNews: ArticlesItem?) {
        val webSetting = binding.wvDetail.settings
        webSetting.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW

        binding.wvDetail.webViewClient = object: WebViewClient() {
            override fun onPageStarted(view: WebView?, url: String?, favicon: Bitmap?) {
                super.onPageStarted(view, url, favicon)
                binding.loadingView.root.visibility = View.VISIBLE
            }

            override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
                binding.loadingView.root.visibility = View.GONE
            }
        }
        dataNews?.link?.let { binding.wvDetail.loadUrl(it) }
    }

    private fun setupMyXML(dataNews: ArticlesItem?, date: String?) {
        binding.apply {
            detailTitle.text = dataNews?.title
            detailPublishedAt.text = date

            Picasso.get()
                .load(dataNews?.thumbnail)
                .fit()
                .centerInside()
                .into(detailImage)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return super.onSupportNavigateUp()
    }
}