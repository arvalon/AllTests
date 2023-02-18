package ru.arvalon.alltests;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

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
