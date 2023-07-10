@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    kotlin("android")
    alias(libs.plugins.android.library)
}

android {
    namespace = "com.chs.myvehicleforwatch"
    compileSdk = libs.versions.compileSdkVersion.get().toInt()

    defaultConfig {
        applicationId = "com.chs.myvehicleforwatch"
        minSdk = libs.version.minSdkVersion.get().toInt()
        targetSdk = libs.version.targetSdkVersion.get().toInt()
        versionCode = libs.version.versionCode.get().toInt()
        versionName = libs.version.versionName.get()

    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }
    packagingOptions {
        resources.excludes.add("/META-INF/{AL2.0,LGPL2.1}")
    }

}

dependencies {
}