package com.example.learncustomdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity(), MyCustomDialogInterface {

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onDialogBtnClicked(view: View){
        Log.d(TAG, "onDialogBtnClicked: ")

        val myCustomDialog = MyCustomDialog(this, this)
        myCustomDialog.show()
    }

    override fun onSubscribeBtnClicked() {
        Toast.makeText(this, "Subscribe Btn Clicked", Toast.LENGTH_SHORT).show()
    }

    override fun onLikeBtnClicked() {
        Toast.makeText(this, "Like Btn Clicked", Toast.LENGTH_SHORT).show()
    }
}