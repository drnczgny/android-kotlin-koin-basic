package project.adrian.com.android_kotlin_koin_basic.main.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import org.koin.android.ext.android.inject
import project.adrian.com.android_kotlin_koin_basic.R
import project.adrian.com.android_kotlin_koin_basic.main.model.MainModel

class MainActivity : AppCompatActivity() {

    companion object {
        val TAG = MainActivity.javaClass.simpleName
    }

    val mainModel: MainModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e(TAG, "" + mainModel.getUsers())
    }
}
