package com.codingcanines.howliday

import android.app.Application
import com.codingcanines.howliday.data.AppContainer
import com.codingcanines.howliday.data.AppDataContainer

class HowlidayApplication : Application() {
    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = AppDataContainer()
    }
}
