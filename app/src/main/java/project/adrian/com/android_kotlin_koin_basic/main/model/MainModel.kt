package project.adrian.com.android_kotlin_koin_basic.main.model

import project.adrian.com.android_kotlin_koin_basic.main.service.MainService

class MainModel constructor(val mainService: MainService) {

    fun getUsers(): List<String> {
        return mainService.findUsers()
    }
}