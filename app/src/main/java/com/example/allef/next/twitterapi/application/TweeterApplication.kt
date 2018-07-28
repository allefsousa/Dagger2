package com.example.allef.next.twitterapi.application

import com.example.allef.next.twitterapi.dependencies.Streaming
import com.example.allef.next.twitterapi.dependencies.Timeline
import com.example.allef.next.twitterapi.dependencies.Tweeter
import javax.inject.Inject


class TweeterApplication /*@Inject constructor (private val tweeter:Tweeter, private val timeline: Timeline)*/{

    @Inject lateinit var tweeter: Tweeter
    @Inject lateinit var timeline: Timeline

    @Inject
    fun enableStreaming(streaming: Streaming){
        streaming.register(this)
    }
}