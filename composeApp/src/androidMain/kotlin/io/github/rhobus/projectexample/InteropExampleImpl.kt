package io.github.rhobus.projectexample

import android.os.Build

class InteropExampleImpl : InteropExample {
    override fun doSomethingNative(): String {
      return Build.MODEL
    }
}