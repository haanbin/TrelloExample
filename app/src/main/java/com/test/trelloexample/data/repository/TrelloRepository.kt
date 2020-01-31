package com.test.trelloexample.data.repository

import com.test.trelloexample.data.Board
import io.reactivex.Single
import okhttp3.Response

interface TrelloRepository {

    fun getBoards(
        userName: String,
        key: String,
        token: String
    ): Single<List<Board>>
}