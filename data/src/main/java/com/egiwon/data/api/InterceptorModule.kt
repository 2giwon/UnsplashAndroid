package com.egiwon.data.api

import okhttp3.Interceptor

object InterceptorModule {
    fun getQueryInterceptor(): Interceptor {
        return Interceptor { chain ->
            val url = chain.request()
                    .url
                    .newBuilder()
                    .addQueryParameter("client_id", "fwys9Zgd8cBBdZmwjdOQSKtfpotT3vVZJNnLxYMBhvk")
                    .build()

            val requestBuilder = chain.request().newBuilder().url(url)
            chain.proceed(requestBuilder.build())
        }
    }
}
