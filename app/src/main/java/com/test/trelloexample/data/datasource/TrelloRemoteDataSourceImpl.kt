package com.test.trelloexample.data.datasource

import com.test.trelloexample.TrelloService
import com.test.trelloexample.data.Board
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import okhttp3.Response

class TrelloRemoteDataSourceImpl(
    private val trelloService: TrelloService
) : TrelloRemoteDataSource {

    override fun getBoards(userName: String, key: String, token: String): Single<List<Board>> {
        return trelloService.getBoards(userName, key, token)
            .subscribeOn(Schedulers.io())
    }

}