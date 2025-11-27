# project-android

![Build](https://img.shields.io/badge/build-passing-brightgreen)
![Kotlin](https://img.shields.io/badge/Kotlin-1.9-blue)
![Android](https://img.shields.io/badge/Android-Project-green)
![License](https://img.shields.io/badge/license-None-lightgrey)

**Short description**

A simple Android project written in **Kotlin**. The project uses Gradle (Kotlin DSL) and can be opened directly in Android Studio.


## Features

* Basic Android project structure (Kotlin)
* Build configuration using `build.gradle.kts`


## Requirements

* JDK 11 or newer
* Android Studio (latest version recommended)
* Android SDK (match the project's `compileSdk` and `targetSdk`)
* Gradle wrapper included (`./gradlew`)


## How to run

1. Clone the repository:

```bash
git clone https://github.com/briezen/project-android.git
cd project-android
```

2. Open the folder in Android Studio (File → Open)
3. Let Android Studio sync Gradle and download dependencies
4. Run the app on an emulator or a real device

> Via command line:

```bash
./gradlew assembleDebug
./gradlew test
```

## Project structure (simple)

* `.idea/` — IDE configuration
* `app/` — main Android application module
* `gradle/`, `gradlew`, `gradlew.bat` — Gradle wrapper
* `build.gradle.kts`, `settings.gradle.kts`, `gradle.properties` — build configs


## Contributing

Pull requests and issues are welcome. For bigger changes, feel free to open an issue first so we can discuss it.
