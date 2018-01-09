package com.example.tqkhanh.myeventbusapplication.remote

import com.example.tqkhanh.myeventbusapplication.model.SOAnswersResponse
import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by tqkhanh on 1/9/18.
 */
interface Service {

    @GET("/answers?order=desc&sort=activity&site=stackoverflow")
    fun getAnswers() : Call<List<SOAnswersResponse>>


}