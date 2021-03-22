package com.example.learncustomdialog

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log
import android.view.View

class MyCustomDialog(context : Context, myCustomDialogInterface: MyCustomDialogInterface)
    : Dialog(context), View.OnClickListener{

    val TAG = " - 로그"

   private var myCustomDialogInterface: MyCustomDialogInterface? = null

    init {
        this.myCustomDialogInterface = myCustomDialogInterface
    }

    //
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.custom_dialog)

        // 배경 투명
        window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        Log.d(TAG, "onCreate: ")
        findViewById<View>(R.id.like_btn).setOnClickListener(this)
        findViewById<View>(R.id.subscribe_btn).setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.like_btn ->{
                myCustomDialogInterface?.onLikeBtnClicked()
            }
            R.id.subscribe_btn ->{
                myCustomDialogInterface?.onSubscribeBtnClicked()
            }
        }
    }

}