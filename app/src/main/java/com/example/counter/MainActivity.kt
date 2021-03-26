package com.example.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import kotlinx.android.synthetic.main.activity_main.*




class MainActivity : AppCompatActivity(),View.OnClickListener,View.OnLongClickListener {


    var counter:Int=0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txv.setOnClickListener(this)
        btn2.setOnClickListener(this)
        btn3.setOnClickListener(this)
        btn4.setOnClickListener(this)
        txv.setOnLongClickListener(this)
        img.setOnLongClickListener(this)

        btnHappy.setOnClickListener(object:View.OnClickListener{
            override fun onClick(v: View?) {
             counter = (1..100).random()
                txv.text = counter.toString()
            }
        })




    }

    override fun onLongClick(v: View?): Boolean {
        if(v==txv) {
            counter += 2
        }
        else{
            counter--
        }
        txv.text = counter.toString()
        return true
    }



    override fun onClick(v: View?){
        if(v==btn2){
            counter++
        }else if(v==btn3){
            counter +=2
        }
        else if(v==btn4){
            counter = 0
        }

        txv.text = counter.toString()
    }
}