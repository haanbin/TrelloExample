package com.test.trelloexample.data.repository

import com.test.trelloexample.data.datasource.TrelloRemoteDataSource

class TrelloRepositoryImpl private constructor() : TrelloRepository {

    override fun getBoards(userName: String, key: String, token: String) =
        trelloRemoteDataSource.getBoards(userName, key, token)


    companion object {

        private var INSTNACE: TrelloRepositoryImpl? = null
        private lateinit var trelloRemoteDataSource: TrelloRemoteDataSource

        fun getInstance(trelloRemoteDataSource: TrelloRemoteDataSource): TrelloRepositoryImpl {
            this.trelloRemoteDataSource = trelloRemoteDataSource
            return INSTNACE ?: TrelloRepositoryImpl().also { INSTNACE = it }
        }
    }
}