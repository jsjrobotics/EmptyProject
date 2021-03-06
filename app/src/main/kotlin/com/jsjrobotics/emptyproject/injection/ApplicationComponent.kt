package com.jsjrobotics.emptyproject.injection

import com.jsjrobotics.emptyproject.Application
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = arrayOf(
        AndroidInjectionModule::class,
        ApplicationModule::class,
        ActivityModule::class,
        FragmentModule::class
))

interface ApplicationComponent {
    fun inject(app: Application)
    // Explicitly declare function returning a Provided object for dagger binding
    fun getApplication(): Application
}