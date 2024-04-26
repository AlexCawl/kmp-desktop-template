@file:Suppress("UnstableApiUsage")

// Workaround: https://github.com/gradle/gradle/issues/15383
val libs = the<org.gradle.accessors.dm.LibrariesForLibs>()

plugins {
    kotlin("jvm")
}

kotlin {
    jvmToolchain {
        languageVersion = JavaLanguageVersion.of(libs.versions.jdk.get())
    }
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}