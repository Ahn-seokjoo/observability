package com.sample.observability

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @GetMapping("/hello")
    fun hello(): String {
        Thread.sleep(1000)
        return "Hello Observe!"
    }
}
