package com.amaxama.babybottle.service

import com.amaxama.babybottle.domain.Feeding
import mu.KotlinLogging
import org.springframework.stereotype.Service

private val logger = KotlinLogging.logger {}

@Service
class FeedingService {

    fun createFeeding(feeding: Feeding): Feeding {
        logger.info { feeding }
        return feeding
    }

    fun deleteFeeding(id: Long) {
        logger.info { "Deleting feeding $id" }

    }

}