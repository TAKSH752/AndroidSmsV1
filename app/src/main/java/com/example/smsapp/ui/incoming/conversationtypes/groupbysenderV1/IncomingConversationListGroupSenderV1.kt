package com.example.smsapp.ui.incoming.conversationtypes.groupbysenderV1

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.smsapp.ui.incoming.common.IncomingEmptyState
import com.example.smsapp.ui.incoming.conversationtypes.groupbysender.IncomingConversationItemGroupSender
import com.example.smsapp.ui.incoming.model.IncomingConversation

@Composable
fun IncomingConversationListGroupSenderV1(
    conversations: List<IncomingConversation>,
    modifier: Modifier = Modifier,
    onOpenConversation: (String) -> Unit
) {

    if (conversations.isEmpty()) {
        IncomingEmptyState()
        return
    }

    LazyColumn(modifier = modifier) {
        items(conversations) { convo ->
            IncomingConversationItemGroupSenderV1(convo, onOpenConversation)
        }
    }
}