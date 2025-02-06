package com.ibrahim.applistatarefas

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.ibrahim.applistatarefas.databinding.ActivityAdicionarTarefaBinding
import com.ibrahim.applistatarefas.databinding.ActivityMainBinding

class AdicionarTarefaActivity : AppCompatActivity() {

    private val binding by lazy{
        ActivityAdicionarTarefaBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}