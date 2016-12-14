package com.epicodus.myrestaurantsclass;

import android.support.test.rule.ActivityTestRule;

import com.epicodus.myrestaurantsclass.ui.MainActivity;

import org.junit.Rule;
import org.junit.Test;

/**
 * Created by Guest on 11/27/16.
 */
public class MainActivityInstrumentationTest {
    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void validateEditText() {
//        onView(withId(R.id.locationEditText)).perform(typeText("Portland"))
//                .check(matches(withText("Portland")));
    }
    @Test
    public void locationIsSentToRestaurantsActivity() {
//        String location = "Portland";
//        onView(withId(R.id.locationEditText)).perform(typeText(location));
//        onView(withId(R.id.findRestaurantsButton)).perform(click());
//        onView(withId(R.id.locationTextView)).check(matches
//                (withText("Here are all the restaurants near: " + location)));
    }

}
