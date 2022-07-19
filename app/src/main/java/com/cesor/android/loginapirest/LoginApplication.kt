package com.cesor.android.loginapirest

import android.app.Application

/****
 * Project: StoresPrueba1
 * From: com.cesor.android.storesprueba1
 * Created by: César Castro on 23/06/2022 at 15:54.
 ***/
class LoginApplication : Application() {
    companion object{
        lateinit var reqResAPI: ReqResAPI
    }
    override fun onCreate() {
        super.onCreate()
        //Volley
        reqResAPI = ReqResAPI.getInstance(this)
    }
}