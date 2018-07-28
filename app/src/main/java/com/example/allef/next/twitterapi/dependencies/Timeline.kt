package com.example.allef.next.twitterapi.dependencies

class Timeline (private val api: TweeterApi,
                private val user:String){


    private val cache:List<Tweet> = emptyList()
    fun get() = cache
    fun loadMore(amount:Int){

    }

}