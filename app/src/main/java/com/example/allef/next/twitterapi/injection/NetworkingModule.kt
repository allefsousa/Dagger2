package com.example.allef.next.twitterapi.injection

import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import javax.inject.Singleton

@Module
class NetworkingModule{

    @Provides @Singleton
    fun provideOkHttpClient():OkHttpClient = OkHttpClient()
//    @Provides @Singleton
//    fun providerTwitterApi(client: OkHttpClient):TwitterApi = TwitterApi(client)
}