package com.example.practical.model

import android.content.Context
import android.graphics.drawable.Drawable

data class SliderImage(val context: Context, var image: Int){
    fun getImageStr(): Drawable? {
        return context.getDrawable(image!!)
    }
}
