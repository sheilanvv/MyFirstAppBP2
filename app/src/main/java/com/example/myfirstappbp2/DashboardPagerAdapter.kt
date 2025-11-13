package com.example.myfirstappbp2

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class DashboardPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> BeritaFragment()
            1 -> PengumumanFragment()
            else -> throw IllegalStateException("Posisi tab tidak valid: $position")
        }
    }
}
