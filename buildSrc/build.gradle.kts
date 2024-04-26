plugins {
    `kotlin-dsl`
}

repositories {
    google()
    mavenLocal()
    gradlePluginPortal()
}

dependencies {
    // Workaround: https://github.com/gradle/gradle/issues/15383
    implementation(files(libs.javaClass.superclass.protectionDomain.codeSource.location))
    implementation(libs.kotlin.gradle.plugin)
}