package com.mehedi.interactiveapp2302

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.mehedi.interactiveapp2302.databinding.ActivityMainBinding
import kotlin.math.log

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    var score: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d("TAG", "onCreate: ")


        binding.inecrementBtn.setOnClickListener {
            score++
            setValue(score)
        }


        binding.decrementBtn.setOnClickListener {
            score--
            setValue(score)
        }


    }


    override fun onStart() {
        super.onStart()
        Log.d("TAG", "onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d("TAG", "onResume: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d("TAG", "onStop: ")
    }

    override fun onPause() {
        super.onPause()
        Log.d("TAG", "onPause: ")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("TAG", "onRestart: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("TAG", "onDestroy: ")
    }






    fun setValue(int: Int) {
        binding.scoreTv.text = "$int"
    }
}