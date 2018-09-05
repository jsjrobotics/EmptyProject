package com.jsjrobotics.emptyproject.injection.androidSubcomponents

import com.jsjrobotics.emptyproject.WelcomeFragment
import dagger.Subcomponent
import dagger.android.AndroidInjector

@Subcomponent
interface WelcomeFragmentSubcomponent : AndroidInjector<WelcomeFragment> {
    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<WelcomeFragment>()

}