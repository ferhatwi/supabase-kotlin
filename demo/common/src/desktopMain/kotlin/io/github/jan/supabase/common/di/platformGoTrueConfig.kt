package io.github.jan.supabase.common.di

import io.github.jan.supabase.gotrue.GoTrueConfig

actual fun GoTrueConfig.platformGoTrueConfig() {
    htmlTitle = "Chat App"
}