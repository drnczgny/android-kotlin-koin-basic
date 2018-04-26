package project.adrian.com.android_kotlin_koin_basic.di

import org.koin.dsl.module.applicationContext
import project.adrian.com.android_kotlin_koin_basic.main.model.MainModel
import project.adrian.com.android_kotlin_koin_basic.main.service.MainService


val mainModule = applicationContext {
    bean { MainService() }
    bean { MainModel(get()) }
}

val modules = listOf(mainModule)