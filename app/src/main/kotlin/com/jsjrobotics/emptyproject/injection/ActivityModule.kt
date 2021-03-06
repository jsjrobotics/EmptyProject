package com.jsjrobotics.emptyproject.injection

import android.app.Activity
import com.jsjrobotics.emptyproject.MainActivity
import com.jsjrobotics.emptyproject.injection.androidSubcomponents.MainActivitySubcomponent
import dagger.Binds
import dagger.Module
import dagger.android.ActivityKey
import dagger.android.AndroidInjector
import dagger.multibindings.IntoMap

@Module(subcomponents = arrayOf(
        MainActivitySubcomponent::class
))
abstract class ActivityModule {
    @Binds
    @IntoMap
    @ActivityKey(MainActivity::class)
    internal abstract fun bindMainActivityInjectorFactory(builder: MainActivitySubcomponent.Builder): AndroidInjector.Factory<out Activity>
}