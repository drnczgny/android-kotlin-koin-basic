package project.adrian.com.android_kotlin_koin_basic.main.service

class MainService {

    fun findUsers(): List<String> {
        return listOf<String>("user1", "user2")
    }
}