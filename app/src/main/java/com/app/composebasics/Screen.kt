package com.app.composebasics

sealed class Screen {
    @kotlinx.serialization.Serializable
    data object Screen1: Screen()

    @kotlinx.serialization.Serializable
    data class Screen2(val id: Int): Screen()

    @kotlinx.serialization.Serializable
    data object Screen3: Screen()
}