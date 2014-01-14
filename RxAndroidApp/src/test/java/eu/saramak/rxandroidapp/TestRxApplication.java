package eu.saramak.rxandroidapp;


import android.util.Log;
import org.robolectric.Robolectric;
import org.robolectric.TestLifecycleApplication;
import roboguice.RoboGuice;

import java.lang.reflect.Method;

/**
 * Created by mario on 1/9/14.
 */
public class TestRxApplication extends RxApplication implements TestLifecycleApplication {

    public static final String TEST_RX_APPLICATION = "TestRxApplication";

    @Override
    public void beforeTest(Method method) {
        Log.d(TEST_RX_APPLICATION, "beforeTest " + method.getName());
    }

    @Override
    public void prepareTest(Object test) {
//        TestRxApplication application = (TestRxApplication) Robolectric.application;
//        Log.d(TEST_RX_APPLICATION, "beforeTest " + test);
//        RoboGuice.getInjector(application).injectMembers(test);
    }

    @Override
    public void afterTest(Method method) {

    }
}
