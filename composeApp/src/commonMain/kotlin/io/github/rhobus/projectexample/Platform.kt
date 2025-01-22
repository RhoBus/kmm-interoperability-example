package io.github.rhobus.projectexample

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform