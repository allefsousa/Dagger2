package com.example.allef.next.twitterapi

import com.example.allef.next.twitterapi.dependencies.TweeterApi

class Tweeter(api: TweeterApi, user: String) {
    fun tweet(tweet:String){
        //val api = TwitterApi()
        //api.postTweet("Allef sousa",tweet)
    }
}

//class TwitterApi(private val client:OkHttpClient) {
//    fun postTweet(user: String, tweet: String) {
//        val cliente = OkHttpClient()
//        val request = Request.Builder()/*...*/.build()
//        client.newCall(request).execute()
//    }
//    fun execute(){
//        val tweeter = Tweeter(api, user)
//        tweeter.tweet("legal")
//        val timeline = TimeLine("ALlef")
//
//    }

//}
