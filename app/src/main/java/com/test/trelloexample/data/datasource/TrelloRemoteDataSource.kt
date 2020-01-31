package com.test.trelloexample.data.datasource

import com.test.trelloexample.data.Board
import io.reactivex.Single
import okhttp3.Response

interface TrelloRemoteDataSource {

    fun getBoards(
        userName: String,
        key: String,
        token: String
    ): Single<List<Board>>
}