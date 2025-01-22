# Interoperability example with Kotlin Multiplatform


This is a Kotlin Multiplatform project targeting Android, iOS.

* `/composeApp` is for code that will be shared across your Compose Multiplatform applications.
  It contains the following subfolders:
  - `commonMain` is for code that’s common for ***all targets***.
  - `androidMain` is for code for Android code only.
  - `iosMain` is for kotlin code to share with iOS platform.

* `/iosApp` contains iOS applications. Even if you’re sharing your UI with Compose Multiplatform, you need this entry point for your iOS app. This is the project that makes iOS compilation possible.


