package space.plasmic.serialexperiments.authserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@EnableEurekaClient
@RestController
class AuthServerApplication {
    @GetMapping("/login/{id}")
    fun loginById(@PathVariable id: Long): String {
        return "{\"id\":$id}"
    }
}

fun main(args: Array<String>) {
    runApplication<AuthServerApplication>(*args)
}
