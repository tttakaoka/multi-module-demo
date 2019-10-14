package com.example.notification

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.notificationrepo.NotificationsRepository

internal class NotificationsViewModel(private val notificationsRepo: NotificationsRepository) : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = notificationsRepo.getText()
    }
    val text: LiveData<String> = _text
}