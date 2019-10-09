package com.github.rmitsubayashi.multimoduledemo.ui.notifications

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NotificationsViewModel(val notificationsRepo: NotificationsRepository) : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = notificationsRepo.getText()
    }
    val text: LiveData<String> = _text
}