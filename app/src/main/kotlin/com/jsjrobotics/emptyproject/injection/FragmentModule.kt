package com.jsjrobotics.emptyproject.injection

import android.support.v4.app.Fragment
import com.jsjrobotics.emptyproject.WelcomeFragment
import com.jsjrobotics.emptyproject.injection.androidSubcomponents.WelcomeFragmentSubcomponent
import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.android.support.FragmentKey
import dagger.multibindings.IntoMap

@Module(subcomponents = arrayOf(
        WelcomeFragmentSubcomponent::class
))
abstract class FragmentModule {

    @Binds
    @IntoMap
    @FragmentKey(WelcomeFragment::class)
    internal abstract fun bindWelcomeFragmentInjectorFactory(builder: WelcomeFragmentSubcomponent.Builder): AndroidInjector.Factory<out Fragment>

}