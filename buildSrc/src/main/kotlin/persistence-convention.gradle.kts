// Workaround: https://github.com/gradle/gradle/issues/15383
val libs = the<org.gradle.accessors.dm.LibrariesForLibs>()

plugins {
    id("org.jetbrains.kotlin.jvm")
    id("app.cash.sqldelight")
}

dependencies {
    implementation(libs.kotlin.sql.driver)
}