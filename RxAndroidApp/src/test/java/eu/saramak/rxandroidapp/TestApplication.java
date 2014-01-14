package eu.saramak.rxandroidapp;


import org.robolectric.Robolectric;
import org.robolectric.TestLifecycleApplication;
import roboguice.RoboGuice;

import java.lang.reflect.Method;

/**
 * Created by mario on 1/9/14.
 */
public class TestApplication extends Application implements TestLifecycleApplication {
    @Override
    public void beforeTest(Method method) {

    }

    @Override
    public void prepareTest(Object test) {
        TestApplication application = (TestApplication) Robolectric.application;

        RoboGuice.getInjector(application).injectMembers(test);
    }

    @Override
    public void afterTest(Method method) {

    }
}
