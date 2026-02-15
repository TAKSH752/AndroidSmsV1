package com.example.smsapp.ui.outgoing.v5

import com.example.smsapp.data.SmsMessage

data class SmsMessageAgo(
    val original: SmsMessage,
    val timeAgo: String
)