package com.example.smsapp.viewmodel

import android.app.Application
import android.content.Context
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import com.example.smsapp.data.SmsMessage
import com.example.smsapp.data.SmsReaderRepository

class InboxViewModel : ViewModel() {
    private var repository: SmsReaderRepository? = null

    private val _messages = MutableStateFlow<List<SmsMessage>>(emptyList())
    val messages: StateFlow<List<SmsMessage>> = _messages

    fun loadMessages(context: Context) {
        if (repository == null) {
            repository = SmsReaderRepository(context.applicationContext)
        }
        _messages.value = repository!!.getInboxMessages()
    }

    fun getGroupedMessages(context: Context): Map<String, List<SmsMessage>> {
        if (repository == null) {
            repository = SmsReaderRepository(context.applicationContext)
        }
        return repository!!.getGroupedMessages()
    }
}