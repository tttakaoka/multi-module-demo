package com.example.notification

import com.example.notificationrepo.notificationReposModule
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val notificationsModule = module {
    notificationReposModule
    viewModel { NotificationsViewModel(get()) }
}