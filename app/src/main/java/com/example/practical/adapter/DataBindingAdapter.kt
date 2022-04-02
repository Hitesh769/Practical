package com.amnex.stfc.ui.adapter

import android.text.TextUtils
import android.text.TextWatcher
import android.view.View
import android.widget.*
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.practical.R


class DataBindingAdapter {

    companion object {

        /*any load image*/
        @JvmStatic
        @BindingAdapter("bind:loadimage")
        fun loadimage(view: ImageView, url: String?) {
            val requestOptions:RequestOptions = RequestOptions()
            requestOptions.placeholder(R.mipmap.ic_launcher)
            requestOptions.error(R.mipmap.ic_launcher)
            requestOptions.dontTransform()
            Glide.with(view.context.applicationContext).load("" + url)
                .apply(requestOptions).into(view)
        }

       /*any text watcher need bind this method*/
        @JvmStatic
        @BindingAdapter("bind:addTextWatcher")
        fun addTextWatcher(edtitext:EditText, listner:TextWatcher){
            edtitext.addTextChangedListener(listner)
        }
        @JvmStatic
        @BindingAdapter("bind:phoneNumberValidator")
        fun phoneNumberValidation(editText:EditText, phone:String){
            val minimumLength = 10
            if (TextUtils.isEmpty(phone)) {
                editText.setError(null)
                return
            }
            if (editText.text.toString().length < minimumLength) {
                editText.setError("Phone Number must be minimum $minimumLength length")
            } else editText.setError(null)
        }
        @JvmStatic
        @BindingAdapter("bind:data")
        fun userdata(editText:EditText, phone:String){
            val minimumLength = 10
            if (TextUtils.isEmpty(phone)) {
                editText.setError(null)
                return
            }
            if (editText.text.toString().length < minimumLength) {
                editText.setError("Phone Number must be minimum $minimumLength length")
            } else editText.setError(null)
        }
        @JvmStatic
        @BindingAdapter("bind:otpVerification")
        fun OtpVerificaiton(editText:EditText, otpPin:String){
           // val minimumLength = 10
            if (TextUtils.isEmpty(otpPin)) {
                editText.setError("Please enter valid otp")
                return
            }
           /* if (editText.text.toString().length < minimumLength) {
                editText.setError("Phone Number must be minimum $minimumLength length")
            } else editText.setError(null)*/
        }
        /*visible or gone any widject*/
        @JvmStatic
        @BindingAdapter("bind:visibility")
        fun View.visible(isVisible: Boolean) {
            visibility = if (isVisible) View.VISIBLE else View.GONE
        }

    }

}
