package com.example.cukuptw.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.StringRes
import com.example.cukuptw.R
import com.example.cukuptw.adapter.republika.RepublikaSectionAdapter
import com.example.cukuptw.adapter.sindonews.SindonewsSectionAdapter
import com.example.cukuptw.databinding.ActivityRepublikaBinding
import com.example.cukuptw.databinding.ActivitySindonewsBinding
import com.google.android.material.tabs.TabLayoutMediator

class SindonewsActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySindonewsBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivitySindonewsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // action bar
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Ganti server"

        setUpViewPager()

        supportActionBar?.elevation = 0f
    }

    private fun setUpViewPager() {

        binding.viewPager.adapter = SindonewsSectionAdapter(this)
        val tabList = arrayOf(
            "Terbaru",
            "Tekno",
            "International",
        )
        TabLayoutMediator(binding.tabSindonews, binding.viewPager) {tab, fragment ->
            tab.text = tabList[fragment]
        }.attach()

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return super.onSupportNavigateUp()
    }
}