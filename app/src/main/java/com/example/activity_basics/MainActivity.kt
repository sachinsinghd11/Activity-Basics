package com.example.activity_basics

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.activity_basics.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val TAG: String = "MainActivity"
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d(TAG,"onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG,"onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"onPause")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.d(TAG, "onSaveInstanceState")
        //outState.putString("data",binding.editText.text.toString())
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.d(TAG, "onRestoreInstanceState")
        //binding.editText.setText(savedInstanceState.getString("data"))
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"onDestroy")
    }
}