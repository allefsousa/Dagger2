package com.example.allef.next.twitterapi.injection

import com.example.allef.next.twitterapi.Tweeter
import com.example.allef.next.twitterapi.dependencies.Timeline
import com.example.allef.next.twitterapi.dependencies.TweeterApi
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class TweeterModule (private val user:String){
    @Provides @Singleton
    fun provideTweeter(api:TweeterApi) = Tweeter(api,user)
    @Provides @Singleton
    fun provideTimeline(api: TweeterApi) = Timeline(api,user)
}