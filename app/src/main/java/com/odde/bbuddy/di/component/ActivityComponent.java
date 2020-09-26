package com.odde.bbuddy.di.component;

import com.odde.bbuddy.di.module.activity.ActivityModule;
import com.odde.bbuddy.di.scope.ActivityScope;

import dagger.Subcomponent;

@ActivityScope
@Subcomponent(modules = {ActivityModule.class })
public interface ActivityComponent {
}
