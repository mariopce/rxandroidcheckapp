package eu.saramak.rxandroidapp.fast.test;

import org.junit.runners.model.InitializationError;
import org.robolectric.RobolectricTestRunner;

public class RobolectricGuiceTestRunner extends RobolectricTestRunner {

    public RobolectricGuiceTestRunner(Class<?> testClass) throws InitializationError {
        super(testClass);
    }


}
