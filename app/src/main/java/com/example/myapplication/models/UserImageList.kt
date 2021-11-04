package com.example.myapplication.models

import com.google.firebase.firestore.PropertyName

data class UserImageList (
    // key to map images from firebase to the val list 'images'
    @PropertyName("images") val images: List<String>? = null
)
