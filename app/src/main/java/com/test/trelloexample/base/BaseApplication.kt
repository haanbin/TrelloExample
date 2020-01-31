package com.test.trelloexample.base

import android.app.Application
import timber.log.Timber.DebugTree
import timber.log.Timber.plant

class BaseApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        plant(DebugTree())
    }
}