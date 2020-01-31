package com.test.trelloexample

import com.jake.archstudy.util.ResourceProvider
import com.test.trelloexample.base.BaseViewModel
import com.test.trelloexample.data.repository.TrelloRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.rxkotlin.addTo
import timber.log.Timber

class MainViewModel(
    private val repository: TrelloRepository,
    private val resourceProvider: ResourceProvider
) : BaseViewModel() {

    init {
        getBoardsData()
    }

    private fun getBoardsData() {
        repository.getBoards(
            "user75498803",
            resourceProvider.getString(R.string.key),
            resourceProvider.getString(R.string.token)
        )
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                {
                    Timber.d(it.toString())
                },{
                    showToastMessage(it.message.toString())
                }
            )
            .addTo(compositeDisposable)
    }
}