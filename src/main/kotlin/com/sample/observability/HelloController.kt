package com.sample.observability

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    private val loggger = LoggerFactory.getLogger(HelloController::class.java)

    @GetMapping("/hello")
    fun hello(): String {
        loggger.info("hi called")
        Thread.sleep(1000)
        return "Hello Observe!"
    }
}
