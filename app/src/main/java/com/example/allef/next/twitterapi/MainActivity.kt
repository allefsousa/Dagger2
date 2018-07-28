package com.example.allef.next.twitterapi

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import dagger.internal.DaggerCollections

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val component = DaggerTweetterComponent.builder()
//                .networkModule(NetworkModule())
//                .twitterModule(TwitterModule("Paulo Salvatore"))
//                .build()

    }
}
