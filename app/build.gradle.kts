plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    // Remove Compose plugin (libs.plugins.kotlin.compose)
}

android {
    namespace = "com.example.flightapp"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.flightapp"
        minSdk = 33
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    // Remove Compose buildFeatures
}

dependencies {
    implementation 'net.skyscanner.backpack:backpack-android:43.0.0'
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat) // Add this for XML compatibility
    implementation(libs.androidx.constraintlayout) // Add this for ConstraintLayout
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.android.material) // Add Material Design

    // Remove all Compose dependencies (they conflict with XML layouts)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}