package com.example.smsapp

sealed class AppScreen(
    val route: String,
    val title: String
) {
    object Send : AppScreen("send", "Send SMS")
    object InboxV1 : AppScreen("inbox", "Inbox V1")
    object InboxV2 : AppScreen("inbox_v2", "Inbox V2")

    companion object {
        val drawerItems: List<AppScreen>
            get() = listOf(Send, InboxV1, InboxV2)
    }
}