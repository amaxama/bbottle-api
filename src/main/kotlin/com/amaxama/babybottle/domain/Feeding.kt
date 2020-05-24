package com.amaxama.babybottle.domain

data class Feeding(
    val quantity: Quantity,
    val unit: Unit,
    val date: LocalDateTime
)