package project.adrian.com.android_kotlin_koin_basic

import android.app.Application
import org.koin.android.ext.android.startKoin
import project.adrian.com.android_kotlin_koin_basic.di.modules

class MyApplication : Application() {


    override fun onCreate() {
        super.onCreate()

        startKoin(this, modules);
    }
}