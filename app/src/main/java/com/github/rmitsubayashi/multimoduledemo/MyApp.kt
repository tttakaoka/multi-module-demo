package com.github.rmitsubayashi.multimoduledemo

import android.app.Application
import com.github.rmitsubayashi.multimoduledemo.di.dashboardModule
import com.github.rmitsubayashi.multimoduledemo.di.homeModule
import com.github.rmitsubayashi.multimoduledemo.di.notificationsModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApp: Application() {
    override fun onCreate(){
        super.onCreate()
        startKoin {
            androidContext(this@MyApp)
            modules(listOf(dashboardModule, homeModule, notificationsModule))
        }
    }
}