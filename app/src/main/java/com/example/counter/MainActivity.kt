package com.example.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    var counter:Int=0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txv.text = counter.toString()
    }
    fun Add(v:View){
        //if(v.id == R.id.btn2){
        if(v == btn2){
            counter++
        }
        else{
            counter*=2
        }
        txv.text = counter.toString()
    }
}