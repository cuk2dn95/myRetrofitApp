package com.example.tqkhanh.myeventbusapplication.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by tqkhanh on 1/9/18.
 */
class RetrofitClient {




    companion object {
        var retrofit: Retrofit ? = null
        fun getClient(baseUrl : String ) : Retrofit{

            if(retrofit == null ){
                retrofit = Retrofit.Builder()
                        .baseUrl(baseUrl)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()

            }

            return retrofit!!
        }
    }


}