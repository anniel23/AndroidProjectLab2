package com.example.lab1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("My_log", "onCreate")
        val toast = Toast.makeText(applicationContext, "onCreate", Toast.LENGTH_SHORT)
        toast.show()
    }

    override fun onStart() {
        super.onStart()
        Log.d("My_log", "onStart")
        val toast = Toast.makeText(applicationContext, "onStart", Toast.LENGTH_SHORT)
        toast.show()
    }

    override fun onResume() {
        super.onResume()
        Log.d("My_log", "onResume")
        val toast = Toast.makeText(applicationContext, "onResume", Toast.LENGTH_SHORT)
        toast.show()
    }

    override fun onPause() {
        super.onPause()
        Log.d("My_log", "onPause")
        val toast = Toast.makeText(applicationContext, "onPause", Toast.LENGTH_SHORT)
        toast.show()
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("My_log", "onRestart")
        val toast = Toast.makeText(applicationContext, "onRestart", Toast.LENGTH_SHORT)
        toast.show()
    }

    override fun onStop() {
        super.onStop()
        Log.d("My_log", "onStop")
        val toast = Toast.makeText(applicationContext, "onStop", Toast.LENGTH_SHORT)
        toast.show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("My_log", "onDestroy")
        val toast = Toast.makeText(applicationContext, "onDestroy", Toast.LENGTH_SHORT)
        toast.show()
    }
}
