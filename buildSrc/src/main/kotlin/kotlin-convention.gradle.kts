@file:Suppress("UnstableApiUsage")

// Workaround: https://github.com/gradle/gradle/issues/15383
val libs = the<org.gradle.accessors.dm.LibrariesForLibs>()

plugins {
    id("org.jetbrains.kotlin.jvm")
    id("org.jetbrains.kotlin.plugin.serialization")
}

kotlin {
    jvmToolchain {
        languageVersion = JavaLanguageVersion.of(libs.versions.jdk.get())
    }
}

dependencies {
    implementation(libs.kotlinx.serialization.json)
    testImplementation(libs.junit)
}

tasks.test {
    useJUnitPlatform()
}