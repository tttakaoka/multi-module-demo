package com.github.rmitsubayashi.multimoduledemo.di

import com.github.rmitsubayashi.multimoduledemo.ui.notifications.NotificationsRepository
import com.github.rmitsubayashi.multimoduledemo.ui.notifications.NotificationsRepositoryImpl
import com.github.rmitsubayashi.multimoduledemo.ui.notifications.NotificationsViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val notificationsModule = module {
    viewModel { NotificationsViewModel(get()) }
    single<NotificationsRepository> { NotificationsRepositoryImpl() }
}