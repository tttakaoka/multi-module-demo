package com.github.rmitsubayashi.multimoduledemo.di

import com.github.rmitsubayashi.multimoduledemo.ui.dashboard.DashboardViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val dashboardModule =module {
    viewModel { DashboardViewModel() }
}