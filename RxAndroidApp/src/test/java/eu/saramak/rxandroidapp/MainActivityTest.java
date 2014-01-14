package eu.saramak.rxandroidapp;
import com.google.inject.Inject;
import eu.saramak.rxandroidapp.fast.test.RobolectricGuiceTestRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.fest.assertions.api.ANDROID.assertThat;


@RunWith(RobolectricGuiceTestRunner.class)
public class MainActivityTest {

    @Inject MainActivity activity;

    @Before
    public void setup() {

    }

    @Test
    public void shouldNotFail() {
        assertThat(activity).isNotNull();
        assertThat(activity.mHalloWorldTextView).isNotNull();
    }
}
