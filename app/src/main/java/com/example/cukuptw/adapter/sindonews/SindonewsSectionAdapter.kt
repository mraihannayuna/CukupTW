package com.example.cukuptw.adapter.sindonews

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.cukuptw.ui.home.SindonewsActivity
import com.example.cukuptw.ui.pragments.republika.InternasionalFragment
import com.example.cukuptw.ui.pragments.republika.NewsFragment
import com.example.cukuptw.ui.pragments.sindonews.InternationalFragment
import com.example.cukuptw.ui.pragments.sindonews.TeknoFragment
import com.example.cukuptw.ui.pragments.sindonews.TerbaruFragment

class SindonewsSectionAdapter(fa: SindonewsActivity): FragmentStateAdapter(fa) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> TerbaruFragment()
            1 -> TeknoFragment()
            2 -> InternationalFragment()
            else -> TerbaruFragment()
        }
    }
}