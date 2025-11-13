package com.example.myfirstappbp2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlin.text.replace

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

//        // 1. Ini data yang bakal tampil
//        val dataList = arrayListOf(
//            Mahasiswa("Sheila", "24.12.3193"),
//            Mahasiswa("Diva", "24.12.3175"),
//            Mahasiswa("Gisha", "24.12.3182"),
//            Mahasiswa("Naura", "24.12.3206"),
//            Mahasiswa("Illit", "24.12.2877")
//        )
//
//        // 2. Inisialisasi RecyclerView
//        val rv_mahasiswa: RecyclerView = findViewById(R.id.rv_mahasiswa)
//
//        // 3. Atur LayoutManager
//        rv_mahasiswa.layoutManager = GridLayoutManager(this,2)
//
//        // 4. Inisialisasi Adapter
//        val adapter = MahasiswaAdapter(dataList)
//
//        // 5. Set Adapter ke RecyclerView
//        rv_mahasiswa.adapter = adapter

        val bottomNav: BottomNavigationView = findViewById(R.id.bottom_navigation)

        // 1. Muat Fragment default (Dashboard) saat pertama kali dibuka
        loadFragment(DashboardFragment())

        // 2. Tambahkan listener untuk menangani klik item navigasi
        bottomNav.setOnItemSelectedListener { item ->
            var fragment: Fragment
            when (item.itemId) {
                R.id.nav_dashboard -> {
                    fragment = DashboardFragment()
                    loadFragment(fragment)
                    true // Mengembalikan true menandakan item telah ditangani
                }
                R.id.nav_profile -> {
                    fragment = ProfileFragment()
                    loadFragment(fragment)
                    true
                }
                R.id.nav_settings -> {
                    fragment = SettingsFragment()
                    loadFragment(fragment)
                    true
                }
                else -> false
            }
        }

    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container_home, fragment)
            .commit()
    }
}


