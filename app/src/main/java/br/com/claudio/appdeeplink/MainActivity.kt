package br.com.claudio.appdeeplink

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.claudio.appdeeplink.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val param1 = intent.getStringExtra("parametro1")
        val param2 = intent.getIntExtra("parametro2", 0)
        val param3 = intent.getBooleanExtra("parametro3", false)

        println("Param1: ${param1}")
        println("Param2: ${param2}")
        println("Param3: ${param3}")
    }
}