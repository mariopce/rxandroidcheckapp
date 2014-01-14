package eu.saramak.rxandroidapp.fast.test;

import android.app.Application;
import com.google.inject.Injector;
import eu.saramak.rxandroidapp.MainActivity;
import eu.saramak.rxandroidapp.RobolectricTestModule;
import eu.saramak.rxandroidapp.TestApplication;
import org.junit.runners.model.InitializationError;
import org.robolectric.AndroidManifest;
import org.robolectric.Robolectric;
import org.robolectric.TestLifecycleApplication;
import org.robolectric.annotation.Config;
import org.robolectric.res.Fs;
import org.robolectric.RobolectricTestRunner;
import roboguice.RoboGuice;
import roboguice.test.RobolectricRoboTestRunner;

import java.lang.reflect.Method;

public class RobolectricGuiceTestRunner extends RobolectricTestRunner {

    public RobolectricGuiceTestRunner(Class<?> testClass) throws InitializationError {
        super(testClass);
        RoboGuice.getInjector(Robolectric.application).injectMembers(testClass);
    }


}
