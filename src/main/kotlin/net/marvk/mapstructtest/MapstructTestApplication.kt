package net.marvk.mapstructtest

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.core.convert.ConversionService

@SpringBootApplication
class MapstructTestApplication {
    @Bean
    fun commandLineRunner(conversionService: ConversionService) =
        CommandLineRunner {
            val from = Foo::class.java
            val to = FooDto::class.java

            check(conversionService.canConvert(from, to)) { "${from.simpleName} to ${to.simpleName} converter is not registered" }
            println("${from.simpleName} to ${to.simpleName} converter is registered!")
        }
}

fun main(args: Array<String>) {
    runApplication<MapstructTestApplication>(*args)
}

