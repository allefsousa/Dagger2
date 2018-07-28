package com.example.allef.next.twitterapi.dependencies


class Tweeter(private val api: TweeterApi,
              private val user: String) {
    fun tweet(tweet: String) {
        api.postTweet(user, tweet)
    }
}