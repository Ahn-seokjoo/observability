package com.sample.observability

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.math.sqrt

@RestController
class HelloController {

    private val loggger = LoggerFactory.getLogger(HelloController::class.java)

    @GetMapping("/hello")
    fun hello(): String {
        loggger.info("hi called")
        Thread.sleep(1000)
        return "Hello Observe!"
    }

    @GetMapping("/cpu")
    fun cpu(): String {
        val start = System.currentTimeMillis()

        while (System.currentTimeMillis() - start < 5000) {
            sqrt(Math.random()) // 의미없는 연산
        }

        return "CPU Burned"
    }

    @GetMapping("/memory")
    fun memory(): String {
        val list = mutableListOf<ByteArray>()

        repeat(1000) {
            list.add(ByteArray(10 * 1024 * 1024)) // 10MB
            Thread.sleep(100)
        }

        return "Memory Loaded"
    }

    @GetMapping("/gc")
    fun gc(): String {
        repeat(5_000_000) {
            val tmp = "GC-" + it + Math.random()
        }
        return "GC Triggered"
    }

    @GetMapping("/thread")
    fun thread(): String {
        Thread.sleep(30_000) // 30초 블로킹
        return "Thread Blocked"
    }
}
