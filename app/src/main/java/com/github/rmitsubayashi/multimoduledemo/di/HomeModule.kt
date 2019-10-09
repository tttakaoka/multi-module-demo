package com.github.rmitsubayashi.multimoduledemo.di

import com.github.rmitsubayashi.multimoduledemo.ui.home.HomeViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val homeModule = module {
    viewModel { HomeViewModel() }
}