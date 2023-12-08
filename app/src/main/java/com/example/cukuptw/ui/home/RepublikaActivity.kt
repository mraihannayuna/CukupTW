package com.example.cukuptw.ui.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.StringRes
import com.example.cukuptw.R
import com.example.cukuptw.adapter.okezone.OkezoneSectionAdapter
import com.example.cukuptw.adapter.republika.RepublikaSectionAdapter
import com.example.cukuptw.databinding.ActivityOkezoneBinding
import com.example.cukuptw.databinding.ActivityRepublikaBinding
import com.google.android.material.tabs.TabLayoutMediator

class RepublikaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRepublikaBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityRepublikaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // action bar
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Ganti server"

        setUpViewPager()

        supportActionBar?.elevation = 0f
    }

    private fun setUpViewPager() {

        binding.viewPager.adapter = RepublikaSectionAdapter(this)
        val tabList = arrayOf(
            "Terbaru",
            "News",
            "Internasional",
        )
        TabLayoutMediator(binding.tabRepublika, binding.viewPager) {tab, fragment ->
            tab.text = tabList[fragment]
        }.attach()

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return super.onSupportNavigateUp()
    }
}