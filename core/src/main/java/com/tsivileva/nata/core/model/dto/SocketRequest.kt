package com.tsivileva.nata.core.model.dto

import com.google.gson.annotations.SerializedName

data class SocketRequest(
    @SerializedName("id") val id: Int = 1,
    @SerializedName("method") val method: String = "",
    @SerializedName("params") val params: List<String> = listOf()
)

sealed class WebSocketCommand(val name: String) {
    object Subscribe : WebSocketCommand("SUBSCRIBE")
    object Unsubscribe : WebSocketCommand("UNSUBSCRIBE")
}
