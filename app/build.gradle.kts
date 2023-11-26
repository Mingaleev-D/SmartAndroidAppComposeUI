plugins {
   id("com.android.application")
   id("org.jetbrains.kotlin.android")
   id("com.google.devtools.ksp")
   id("kotlin-parcelize")
   id("com.google.dagger.hilt.android")
}

kotlin {
   jvmToolchain(18)
}

android {
   namespace = "com.example.smartandroidappcomposeui"
   compileSdk = 34

   defaultConfig {
      applicationId = "com.example.smartandroidappcomposeui"
      minSdk = 24
      targetSdk = 34
      versionCode = 1
      versionName = "1.0"

      testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
      vectorDrawables {
         useSupportLibrary = true
      }
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
      isCoreLibraryDesugaringEnabled = true
      sourceCompatibility = JavaVersion.VERSION_1_8
      targetCompatibility = JavaVersion.VERSION_1_8
   }
   kotlinOptions {
      jvmTarget = "1.8"
   }
   buildFeatures {
      compose = true
   }
   composeOptions {
      kotlinCompilerExtensionVersion = "1.5.3"
   }
   packaging {
      resources {
         excludes += "/META-INF/{AL2.0,LGPL2.1}"
      }
   }
}

dependencies {

   implementation("androidx.core:core-ktx:1.12.0")
   implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")
   implementation("androidx.activity:activity-compose:1.8.0")
   implementation(platform("androidx.compose:compose-bom:2023.09.01"))
   implementation("androidx.compose.ui:ui")
   implementation("androidx.compose.ui:ui-graphics")
   implementation("androidx.compose.ui:ui-tooling-preview")
   implementation("androidx.compose.material3:material3")
   testImplementation("junit:junit:4.13.2")
   androidTestImplementation("androidx.test.ext:junit:1.1.5")
   androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
   androidTestImplementation(platform("androidx.compose:compose-bom:2023.09.01"))
   androidTestImplementation("androidx.compose.ui:ui-test-junit4")
   debugImplementation("androidx.compose.ui:ui-tooling")
   debugImplementation("androidx.compose.ui:ui-test-manifest")
   // extended Icons
   //implementation ("androidx.compose.material:material-icons-extended")
   // lifecycle
   val lifecycleVersion = "2.6.2"
   implementation ("androidx.lifecycle:lifecycle-viewmodel-compose:$lifecycleVersion")
   implementation ("androidx.lifecycle:lifecycle-runtime-compose:$lifecycleVersion")
   //navCompose
   val navVersion = "2.7.5"
   implementation ("androidx.navigation:navigation-compose:$navVersion")
   implementation ("androidx.hilt:hilt-navigation-compose:1.1.0")
   // Retrofit
   val retrofitVersion = "2.9.0"
   implementation ("com.squareup.retrofit2:retrofit:$retrofitVersion")
   implementation ("com.squareup.retrofit2:converter-gson:$retrofitVersion")
   //Gson
   val gsonVersion = "2.9.0"
   implementation ("com.google.code.gson:gson:$gsonVersion")
   // OkHTTP
   val okhttpVersion = "4.11.0"
   implementation("com.squareup.okhttp3:logging-interceptor:$okhttpVersion")
   implementation("com.squareup.okhttp3:okhttp:$okhttpVersion")
   // Hilt
   val hiltVersion = "2.48"
   implementation("com.google.dagger:hilt-android:$hiltVersion")
   ksp("com.google.dagger:hilt-compiler:$hiltVersion")
   // Room
   val roomVersion = "2.6.0"
   implementation ("androidx.room:room-runtime:$roomVersion")
   implementation ("androidx.room:room-ktx:$roomVersion")
   ksp ("androidx.room:room-compiler:$roomVersion")
   //Coil
   implementation("io.coil-kt:coil:2.5.0")
   //Accompanist
   implementation ("com.google.accompanist:accompanist-systemuicontroller:0.33.2-alpha")
   //splash screen
   implementation ("androidx.core:core-splashscreen:1.0.1")
   //Desugaring
   coreLibraryDesugaring("com.android.tools:desugar_jdk_libs:2.0.3")
   //compose destination
   val destinationVersion = "1.9.52"
   implementation("io.github.raamcosta.compose-destinations:core:$destinationVersion")
   ksp("io.github.raamcosta.compose-destinations:ksp:$destinationVersion")
   //fonts
   implementation("androidx.compose.ui:ui-text-google-fonts:1.5.3")
}