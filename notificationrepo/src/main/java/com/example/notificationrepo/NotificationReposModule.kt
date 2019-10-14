package com.example.notificationrepo

import org.koin.dsl.module

val notificationReposModule = module {
    single<NotificationsRepository> { NotificationsRepositoryImpl() }
}