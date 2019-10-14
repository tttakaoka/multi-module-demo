package com.example.dashboard

import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val dashboardModule =module {
    viewModel { DashboardViewModel() }
}