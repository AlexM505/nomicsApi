package com.alex.nomicsapi

import io.reactivex.Observable
import retrofit2.http.GET

interface GetData {

    @GET("prices?key=d1dcd26316f961401a812e3128c0f2aa")
    fun getData() : Observable<List<RetroCrypto>>
}