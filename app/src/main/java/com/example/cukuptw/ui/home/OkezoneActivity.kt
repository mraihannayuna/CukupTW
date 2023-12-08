package com.example.cukuptw.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.StringRes
import com.example.cukuptw.R
import com.example.cukuptw.adapter.okezone.OkezoneSectionAdapter
import com.example.cukuptw.databinding.ActivityOkezoneBinding
import com.google.android.material.tabs.TabLayoutMediator

class OkezoneActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOkezoneBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityOkezoneBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // action bar
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Ganti server"

        setUpViewPager()

        supportActionBar?.elevation = 0f
    }

    private fun setUpViewPager() {

        binding.viewPager.adapter = OkezoneSectionAdapter(this)
        val tabList = arrayOf(
            "Terbaru",
            "Techno",
            "Lifestyle",
        )
        TabLayoutMediator(binding.tabOkezone, binding.viewPager) {tab, fragment ->
            tab.text = tabList[fragment]
        }.attach()

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return super.onSupportNavigateUp()
    }
}