package com.test.trelloexample

import android.os.Bundle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.jake.archstudy.util.ResourceProviderImpl
import com.test.trelloexample.base.BaseActivity
import com.test.trelloexample.data.datasource.TrelloRemoteDataSourceImpl
import com.test.trelloexample.data.repository.TrelloRepositoryImpl
import com.test.trelloexample.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>(R.layout.activity_main) {

    override val vm by lazy {
        ViewModelProviders.of(this, object : ViewModelProvider.Factory{
            override fun <T : ViewModel?> create(modelClass: Class<T>): T {
                return MainViewModel(
                    TrelloRepositoryImpl.getInstance(TrelloRemoteDataSourceImpl(RetrofitClient.getService())),
                    ResourceProviderImpl(applicationContext)
                ) as T
            }
        }).get(MainViewModel::class.java)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}
