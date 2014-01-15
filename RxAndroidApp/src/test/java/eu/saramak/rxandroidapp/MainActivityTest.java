package eu.saramak.rxandroidapp;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.fest.assertions.api.ANDROID.assertThat;


@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {



    @Before
    public void setup() {

    }

    @Test
    public void shouldNotFail() {
        final MainActivity mainActivity = Robolectric.buildActivity(MainActivity.class).create().resume().get();
        assertThat(mainActivity).isNotNull();
        assertThat(mainActivity.mDummyFragment.mHalloWorldTextView).isNotNull();
    }
}
