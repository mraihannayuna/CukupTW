package com.example.cukuptw.adapter.republika

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.cukuptw.ui.home.RepublikaActivity
import com.example.cukuptw.ui.pragments.okezone.TechnoFragment
import com.example.cukuptw.ui.pragments.republika.InternasionalFragment
import com.example.cukuptw.ui.pragments.republika.NewsFragment
import com.example.cukuptw.ui.pragments.republika.TerbaruFragment

class RepublikaSectionAdapter(fa: RepublikaActivity): FragmentStateAdapter(fa) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> TerbaruFragment()
            1 -> NewsFragment()
            2 -> InternasionalFragment()
            else -> TerbaruFragment()
        }
    }
}