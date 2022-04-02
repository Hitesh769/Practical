package com.example.practical.model

import android.content.Context
import android.graphics.drawable.Drawable

data class CarResponse(val context: Context, var name:String, var image: Int?){
        fun getImageStr(): Drawable? {
            return context.getDrawable(image!!)
        }
}
