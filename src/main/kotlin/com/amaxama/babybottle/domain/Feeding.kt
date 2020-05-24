package com.amaxama.babybottle.domain

import java.time.LocalDateTime
import javax.measure.Quantity
import javax.measure.quantity.Volume

data class Feeding(
    val id: Long,
    val quantity: Quantity<Volume>,
    val date: LocalDateTime
)