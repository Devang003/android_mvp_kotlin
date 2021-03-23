package com.example.demo_mvp.api_client

import android.content.Context
import android.text.TextUtils
import android.util.Log
import com.androidnetworking.common.Priority
import com.example.demo_mvp.BuildConfig
import com.example.demo_mvp.R
import com.example.demo_mvp.utils.*
import com.rx2androidnetworking.Rx2ANRequest
import com.rx2androidnetworking.Rx2AndroidNetworking
import org.json.JSONException
import org.json.JSONObject

class API {

    var headers: HashMap<String, String>? = null
    var limit = 20

    constructor()

    constructor(context: Context) {


        //  if (context.isNetworkConnectionAvailable()) {
        val requestPrm = context.resources.getStringArray(R.array.headers)
        headers = HashMap()
        headers!![requestPrm[0]] = requestPrm[1]
        if (context.getLanguageType() == "cn") {
            headers!![requestPrm[2]] = "zh-HK"
        } else {
            headers!![requestPrm[2]] = context.getLanguageType()
        }

        if (!TextUtils.isEmpty(context.getLoginToken())) {
            headers!![requestPrm[3]] = context.getLoginToken()
        } else {
            headers!![requestPrm[9]] = context.getIMEI()
            // headers!![requestPrm[9]] = context.getDeviceID()
        }
        if (!TextUtils.isEmpty(context.getSocialToken())) {
            headers!![requestPrm[4]] = context.getSocialToken()
        }
        headers!![requestPrm[5]] = context.getLatitude()
        headers!![requestPrm[6]] = context.getLongitude()
        headers!![requestPrm[7]] = context.getIMEI()
        headers!![requestPrm[8]] = context.getDeviceType().toString()

        if (context.getCurrencid() == 0) {
            headers!![requestPrm[10]] = 1.toString()
        } else {
            headers!![requestPrm[10]] = context.getCurrencid().toString()
        }


        Log.d("Auth-Token", context.getLoginToken())
        Log.d("X-Device-Token", context.getLoginToken())


        /* }else{
             context.ToastMessage("No Internet available")
         }*/
    }

    fun GetMainURL(context: Context): String {
        val main_url =
            if (BuildConfig.DEBUG) context.getString(R.string.main_url_local)
            else
                context.getString(R.string.main_url_live)
        return main_url
    }


    /**
     * API call for postSignIn
     *
     * @param mobile send mobile number as request parameter in API.
     * @param pin send password as request parameter in API.
     */
    fun postSignIn(
        context: Context,
        email: String,
        password: String
    ): Rx2ANRequest {
        val requestPrm = context.resources.getStringArray(R.array.login_array)
        val jsonObject = JSONObject()
        try {
            jsonObject.put(requestPrm[1], email)
            jsonObject.put(requestPrm[2], password)
            jsonObject.put(requestPrm[3], context.getDeviceType())
            jsonObject.put(requestPrm[4], context.getIMEI())
            jsonObject.put(requestPrm[5], context.getNotificationToken())
        } catch (e: JSONException) {
            e.printStackTrace()
        }

        return Rx2AndroidNetworking.post(GetMainURL(context).plus(requestPrm[0]))
            .addHeaders(headers)
            .addJSONObjectBody(jsonObject)
            .setTag("Request")
            .setPriority(Priority.HIGH)
            .build()
    }

}