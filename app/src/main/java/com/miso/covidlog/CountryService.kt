package com.miso.covidlog

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface CountryService {

    @GET("countries")
    fun getAffectedCountryList () : Call<List<MyCountry>>
}