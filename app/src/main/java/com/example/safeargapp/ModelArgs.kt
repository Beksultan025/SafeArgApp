package com.example.safeargapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ModelArgs(
    val name:String,
    val email:String,
    val password:String
): Parcelable
