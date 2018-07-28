package com.example.allef.next.twitterapi.injection

import com.example.allef.next.twitterapi.dependencies.Timeline
import com.example.allef.next.twitterapi.dependencies.Tweeter
import dagger.Component

@Component(modules = [NetworkingModule::class,TweeterModule::class])
interface TweeterComponent {

    fun tweeter():Tweeter
    fun timeline():Timeline


}