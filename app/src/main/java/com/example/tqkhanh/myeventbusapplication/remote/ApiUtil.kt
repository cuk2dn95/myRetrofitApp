package com.example.tqkhanh.myeventbusapplication.remote

/**
 * Created by tqkhanh on 1/9/18.
 */
class ApiUtil {

   companion object {


       val BASE_URL : String = "https://api.stackexchange.com/2.2"
       fun getService() : Service {
            return RetrofitClient.getClient(BASE_URL).create(Service::class.java)
       }
   }


}