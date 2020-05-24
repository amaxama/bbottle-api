package com.amaxama.babybottle.controller

import com.amaxama.babybottle.domain.Feeding
import com.amaxama.babybottle.service.FeedingService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.net.URI

@RestController("/v1/feedings")
class FeedingController(private val feedingService: FeedingService) {

    @PostMapping
    fun createFeeding(@RequestBody feeding: Feeding): ResponseEntity<Feeding> {
        val createdFeeding = feedingService.createFeeding(feeding)
        val uri = URI("http://localhost:8080/v1/feedings/${createdFeeding.id}")
        return ResponseEntity.created(uri).body(createdFeeding)
    }

    @DeleteMapping("{feeding_id}")
    fun deleteFeeding(@PathVariable id: Long): ResponseEntity<Unit> {
        feedingService.deleteFeeding(id)
        return ResponseEntity.noContent().build()
    }

}