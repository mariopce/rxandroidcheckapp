package eu.saramak.rxandroidapp;
import eu.saramak.rxandroidapp.fast.test.RobolectricGuiceTestRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;

import javax.inject.Inject;

import static org.fest.assertions.api.ANDROID.assertThat;


@RunWith(RobolectricGuiceTestRunner.class)
public class MainActivityTest {



    @Before
    public void setup() {

    }

    @Test
    public void shouldNotFail() {
        final MainActivity mainActivity = Robolectric.buildActivity(MainActivity.class).create().get();
        assertThat(mainActivity).isNotNull();
        assertThat(mainActivity.mHalloWorldTextView).isNotNull();
    }
}
