package com.example.allef.next.twitterapi.dependencies

import okhttp3.OkHttpClient
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class TweeterApi @Inject constructor(private val client: OkHttpClient){
    fun postTweet(user: String, tweet: String) {

    }
}
