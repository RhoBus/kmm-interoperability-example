package io.github.rhobus.projectexample

import platform.UIKit.UIDevice

class IOSPlatform: Platform {
    override val name: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}

fun asdasd() {
    UIKit
}

actual fun getPlatform(): Platform = IOSPlatform()