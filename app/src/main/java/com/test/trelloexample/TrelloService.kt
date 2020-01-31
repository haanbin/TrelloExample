package com.test.trelloexample

import com.test.trelloexample.data.Board
import io.reactivex.Single
import okhttp3.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface TrelloService {

    @GET("1/members/{userName}/boards")
    fun getBoards(
        @Path("userName") userName: String,
        @Query("key") key: String,
        @Query("token") token: String
    ): Single<List<Board>>

}