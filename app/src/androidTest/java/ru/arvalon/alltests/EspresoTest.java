package ru.arvalon.alltests;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by arvalon on 09.02.2018.
 */

@RunWith(AndroidJUnit4.class)
public class EspresoTest {

    @Rule
    public ActivityTestRule<MainActivity> activity=new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void sayHello(){
        onView(withId(R.id.edit)).perform(typeText("Olga"));
        onView(withId(R.id.button)).perform(click());
        onView(withId(R.id.text)).check(matches(withText("Hello, Olga")));
    }

}
