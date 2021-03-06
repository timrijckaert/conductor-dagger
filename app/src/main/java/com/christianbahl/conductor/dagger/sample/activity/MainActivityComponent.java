package com.christianbahl.conductor.dagger.sample.activity;

import com.christianbahl.conductor.ConductorInjectionModule;
import com.christianbahl.conductor.dagger.sample.di.binder.ControllerBindingModule;
import com.christianbahl.conductor.dagger.sample.di.scope.ActivityScope;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent(modules = {
        MainActivityModule.class,
        ControllerBindingModule.class,
        ConductorInjectionModule.class
})
@ActivityScope
public interface MainActivityComponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {}
}