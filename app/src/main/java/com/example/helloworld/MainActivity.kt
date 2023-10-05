package com.example.helloworld

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Use logcat to see when lifecycle method runs
        Log.i("test","onCreate() initiated moving to onStart()")
    }
    override fun onStart(){
        super.onStart()
        Log.i("test","onStart() initiated moving to onResume()")
    }
    override fun onResume(){
        super.onResume()
        Log.i("test","onResume() initiated waiting for onPause()")
    }
    override fun onPause(){
        super.onPause()
        Log.i("test","onPause() initiated waiting for onStop() or onResume()")
    }
    override fun onStop(){
        super.onStop()
        Log.i("test","onStop() initiated waiting for onDestroy() or onRestart()")
    }
    override fun onRestart(){
        super.onRestart()
        Log.i("test","onRestart() moving to onStart()")
    }
    override fun onDestroy(){
        super.onDestroy()
        Log.i("test","onDestroy() app has been terminated")
    }

}