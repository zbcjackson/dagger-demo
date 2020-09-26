package com.odde.bbuddy.di.component;

import com.odde.bbuddy.di.module.activity.ActivityModule;
import com.odde.bbuddy.di.module.application.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class })
public interface ApplicationComponent {

    ActivityComponent plus(ActivityModule activityModule);

}
