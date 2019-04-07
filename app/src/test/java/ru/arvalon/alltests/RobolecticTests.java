package ru.arvalon.alltests;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static junit.framework.Assert.assertNotNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Robolectric. Содержит компоненты Android SDK но не все и не 100% совпадает поведение
 * Created by arvalon on 09.02.2018.
 */

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class)
public class RobolecticTests {

    MainActivity activity;

    @Before
    public void init(){
        activity= Robolectric.buildActivity(MainActivity.class).create().resume().get();
    }

    @Test
    public void activityCreated(){
        assertNotNull(activity);
    }

    @Test
    public void testHello(){

        EditText edit = activity.findViewById(R.id.edit);
        Button button = activity.findViewById(R.id.button);
        TextView text = activity.findViewById(R.id.text);

        edit.setText("Olga");
        button.performClick();

        String result=text.getText().toString();
        assertThat(result,equalTo("Hello, Olga"));
    }

}
