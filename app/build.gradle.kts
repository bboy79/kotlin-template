plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    //id("io.fabric")
    kotlin("kapt")
}

apply {
    from("$rootDir/jacoco.gradle")
}

android {
    compileSdkVersion(Android.compileSDK)

    dataBinding {
        isEnabled = true
    }

    defaultConfig {
        minSdkVersion(Android.minSDK)
        targetSdkVersion(Android.targetSDK)

        applicationId = Android.applicationId
        versionCode = Android.appVersionCode
        versionName = Android.appVersionName
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {

        getByName("release") {
            isShrinkResources = true
            isMinifyEnabled = true
            isUseProguard = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }

        getByName("debug") {
            isShrinkResources = false
            isMinifyEnabled = false
            isDebuggable = true
            versionNameSuffix = "-debug"
            isTestCoverageEnabled = true
        }
    }
}

dependencies {
    implementation(project(Modules.logging))

    implementation(Libraries.kotlinStdLib)
    // TODO check what needs to be removed
    implementation(AndroidLibraries.appCompat)
    implementation(AndroidLibraries.coreKtx)
    implementation(AndroidLibraries.lifecycleExtensions)
    implementation(AndroidLibraries.constraintLayout)
    implementation(AndroidLibraries.materialDesign)
    implementation(AndroidLibraries.supportAnnotations)
    // TODO up to here
    implementation(AndroidLibraries.navigationUI)

    implementation(Libraries.dagger)
    implementation(Libraries.daggerAndroid)
    implementation(Libraries.daggerAndroidSupport)
    kapt(Libraries.daggerCompiler)
    kapt(Libraries.daggerAndroidProcessor)

    //implementation(Libraries.firebaseCore)
    //implementation(Libraries.crashlytics)

    implementation(Libraries.retrofit)
    implementation(Libraries.retrofitConverter)
    implementation(Libraries.okHttp)
    implementation(Libraries.okHttpLoggingInterceptor)

    implementation(Libraries.timber)


    debugImplementation(Libraries.leakCanaryDebug)
    releaseImplementation(Libraries.leakCanaryRelease)
    debugImplementation(Libraries.leakCanaryFragments)
}

/*
apply {
    plugin("com.google.gms.google-services")
}*/