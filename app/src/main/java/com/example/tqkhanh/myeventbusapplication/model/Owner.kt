package com.example.tqkhanh.myeventbusapplication.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName



/**
 * Created by tqkhanh on 1/9/18.
 */
class Owner {

    @SerializedName("reputation")
    @Expose
    var reputation: Int? = null
    @SerializedName("user_id")
    @Expose
    var userId: Int? = null
    @SerializedName("user_type")
    @Expose
    var userType: String? = null
    @SerializedName("accept_rate")
    @Expose
    var acceptRate: Int? = null
    @SerializedName("profile_image")
    @Expose
    var profileImage: String? = null
    @SerializedName("display_name")
    @Expose
    var displayName: String? = null
    @SerializedName("link")
    @Expose
    var link: String? = null

}