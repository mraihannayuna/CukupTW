package com.example.cukuptw.adapter.okezone

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.cukuptw.ui.home.OkezoneActivity
// -------------------------------- Okezone ------------------------------
import com.example.cukuptw.ui.pragments.okezone.LifestyleFragment
import com.example.cukuptw.ui.pragments.okezone.TechnoFragment
import com.example.cukuptw.ui.pragments.okezone.TerbaruFragment

class OkezoneSectionAdapter(fa: OkezoneActivity): FragmentStateAdapter(fa) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> TerbaruFragment()
            1 -> TechnoFragment()
            2 -> LifestyleFragment()
            else -> TerbaruFragment()
        }
    }
}