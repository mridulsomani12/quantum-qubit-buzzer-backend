@file:Suppress("SpellCheckingInspection")

plugins {
    kotlin("jvm") version "1.9.23" // or your version
    id("org.jetbrains.kotlin.plugin.serialization") version "1.9.23" // or your version
    application
    id("com.github.johnrengelman.shadow") version "8.1.1"
}

kotlin {
    jvmToolchain(17) // or 21, but NOT 23 unless all dependencies support it
}

tasks.withType<JavaCompile> {
    sourceCompatibility = "17"
    targetCompatibility = "17"
}

application {
    mainClass.set("com.example.buzzerbackend.MainKt")
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("io.ktor:ktor-server-core:2.3.8")
    implementation("io.ktor:ktor-server-netty:2.3.8")
    implementation("io.ktor:ktor-server-websockets:2.3.8")
    implementation("io.ktor:ktor-server-content-negotiation:2.3.8")
    implementation("ch.qos.logback:logback-classic:1.5.13")
    implementation("io.ktor:ktor-serialization-kotlinx-json:2.3.8")
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.6.3")
}