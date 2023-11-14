import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    kotlin("multiplatform")
    id("org.jetbrains.compose")
}

group = "com.asura.kdict"
version = "1.0-SNAPSHOT"

repositories {
    google()
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
}

kotlin {
    jvm {
        jvmToolchain(11)
        withJava()
    }
    sourceSets {
        val jvmMain by getting {
            dependencies {
                implementation(compose.desktop.currentOs)

                // GSON
                implementation("com.google.code.gson:gson:2.10.1")

                // Room
                implementation("androidx.room:room-runtime:2.4.1")
                // Navigation
                implementation("androidx.hilt:hilt-navigation-compose:1.0.0-alpha03")

                // Lifecycle
                implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.5.0-beta01")

                // Sentry
                implementation("io.sentry:sentry-android:5.7.3")
            }
        }
        val jvmTest by getting
    }
}

compose.desktop {
    application {
        mainClass = "MainKt"
        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "KDictionary"
            packageVersion = "1.0.0"
        }
    }
}
