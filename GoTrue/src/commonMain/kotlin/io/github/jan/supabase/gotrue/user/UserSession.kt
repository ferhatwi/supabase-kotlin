package io.github.jan.supabase.gotrue.user

import kotlinx.datetime.Clock
import kotlinx.datetime.Instant
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlin.time.Duration.Companion.seconds

@Serializable
data class UserSession(
    @SerialName("access_token") val accessToken: String,
    @SerialName("refresh_token") val refreshToken: String,
    @SerialName("expires_in") val expiresIn: Long,
    @SerialName("token_type") val tokenType: String,
    val user: UserInfo?,
    @SerialName("type") val type: String = "",
    val expiresAt: Instant = Clock.System.now() + expiresIn.seconds,
) {



}
