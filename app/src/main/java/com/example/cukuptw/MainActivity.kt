package com.example.cukuptw

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.cukuptw.databinding.ActivityMainBinding

import com.example.cukuptw.ui.home.OkezoneActivity
import com.example.cukuptw.ui.home.RepublikaActivity
import com.example.cukuptw.ui.home.SindonewsActivity

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setView()

    }

    private fun setView() {
        binding.apply {
            chooseOkezone.setOnClickListener(this@MainActivity)
            chooseRepublika.setOnClickListener(this@MainActivity)
            chooseSindonews.setOnClickListener(this@MainActivity)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onClick(v: View?) {
        when(v?.id)
        {

            R.id.chooseOkezone -> {
                val intentDDS = Intent(this@MainActivity, OkezoneActivity::class.java)
                startActivity(intentDDS)
            }

            R.id.chooseRepublika -> {
                val intentDDS = Intent(this@MainActivity, RepublikaActivity::class.java)
                startActivity(intentDDS)
            }

            R.id.chooseSindonews -> {
                val intentDDS = Intent(this@MainActivity, SindonewsActivity::class.java)
                startActivity(intentDDS)
            }

        }
    }

}
