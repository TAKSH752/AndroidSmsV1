package com.example.smsapp.ui.incoming.v2

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.example.smsapp.ui.components.AppTopBar
import com.example.smsapp.data.SmsMessage
import com.example.smsapp.ui.incoming.common.IncomingPermission
import com.example.smsapp.ui.incoming.common.loadIncomingSms

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IncomingScreenV2(
    openDrawer: () -> Unit,
    inHeadLabel: String = "Incoming V2"
) {
    val context = LocalContext.current
    var messages by remember { mutableStateOf<List<SmsMessage>>(emptyList()) }

    IncomingPermission(context) {
        messages = loadIncomingSms(context)
    }

    Scaffold(
        topBar = {
            AppTopBar(title = inHeadLabel, showBack = false, onMenuClick = openDrawer)
        }
    ) { padding ->
        IncomingListUIForV2(
            messages = messages,
            modifier = Modifier.padding(padding).fillMaxSize()
        )
    }
}