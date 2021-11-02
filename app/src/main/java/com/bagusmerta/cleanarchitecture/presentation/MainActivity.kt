package com.bagusmerta.cleanarchitecture.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.bagusmerta.cleanarchitecture.R
import com.bagusmerta.cleanarchitecture.databinding.ActivityMainBinding
import com.bagusmerta.cleanarchitecture.presentation.viewmodel.MainViewModel
import com.bagusmerta.cleanarchitecture.presentation.viewmodel.ViewModelFactory

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewModelFactory = ViewModelFactory.getInstance()
        val mainViewModel = ViewModelProvider(this, viewModelFactory)[MainViewModel::class.java]

        mainViewModel.setTextMessage("welcome to metaverse")
        mainViewModel.text.observe(this){
            binding.tvTextMessage.text = it.text
        }
    }
}