package com.example.navigationarchitecturewithkotlin.repository.network

import java.io.IOException

import okhttp3.Interceptor
import okhttp3.Response

class DefaultHeaderInterceptor : Interceptor {

    @Throws(IOException::class)
    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request().newBuilder()
                .addHeader("Content-Type", "application/json; charset=utf-8").build()
        return chain.proceed(request)
    }
}
