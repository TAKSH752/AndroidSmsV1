package com.example.smsapp.ui.incoming.v3

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.smsapp.data.SmsMessage

@Composable

fun IncomingListUIForV3(
    messages: List<SmsMessage>,
    modifier: Modifier = Modifier
) {

    LazyColumn(modifier = modifier)
    {
        items(messages) { sms ->

            Card(
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth()
            ) {
                Column(modifier = Modifier.padding(12.dp)) {

                    Text(sms.address, style = MaterialTheme.typography.titleMedium)
                    Spacer(Modifier.height(4.dp))
                    Text(sms.body, style = MaterialTheme.typography.bodyMedium)
                    Spacer(Modifier.height(4.dp))
                    Text(sms.date, style = MaterialTheme.typography.labelSmall)
                }
            }
        }
    }
}