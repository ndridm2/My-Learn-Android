package com.ndridm.mylearn.tab

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class SectionsPagerAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {

    override fun createFragment(position: Int): Fragment {
        val fragment = MrtFragment()
        fragment.arguments = Bundle().apply {
            putInt(MrtFragment.ARG_SECTION_NUMBER, position + 1)
        }
        return fragment
    }

    override fun getItemCount(): Int {
        return 3
    }

}