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

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // 1. Ini data yang bakal tampil
        val dataList = arrayListOf(
            Mahasiswa("Sheila", "24.12.3193"),
            Mahasiswa("Diva", "24.12.3175"),
            Mahasiswa("Gisha", "24.12.3182"),
            Mahasiswa("Naura", "24.12.3206"),
            Mahasiswa("Illit", "24.12.2877")
        )

        // 2. Inisialisasi RecyclerView
        val rv_mahasiswa: RecyclerView = findViewById(R.id.rv_mahasiswa)

        // 3. Atur LayoutManager
        rv_mahasiswa.layoutManager = GridLayoutManager(this,2)

        // 4. Inisialisasi Adapter
        val adapter = MahasiswaAdapter(dataList)

        // 5. Set Adapter ke RecyclerView
        rv_mahasiswa.adapter = adapter
    }
}