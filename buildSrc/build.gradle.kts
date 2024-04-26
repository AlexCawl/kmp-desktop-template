plugins {
    `kotlin-dsl`
}

repositories {
    google()
    gradlePluginPortal()
}

dependencies {
    // Workaround: https://github.com/gradle/gradle/issues/15383
    implementation(files(libs.javaClass.superclass.protectionDomain.codeSource.location))

    // Plugins as dependencies
    implementation(libs.pluginDependency.kotlin.gradle) // -> kotlin("jvm")
    implementation(libs.pluginDependency.kotlin.serialization) // -> kotlin("plugin.serialization")
}