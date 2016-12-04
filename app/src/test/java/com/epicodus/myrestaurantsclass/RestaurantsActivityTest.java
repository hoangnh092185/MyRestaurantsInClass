package com.epicodus.myrestaurantsclass;

import android.os.Build;
import android.widget.ListView;

import com.epicodus.myrestaurantsclass.ui.RestaurantsListActivity;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by Guest on 11/27/16.
 */

@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
@RunWith(RobolectricGradleTestRunner.class)


public class RestaurantsActivityTest {
    private RestaurantsListActivity activity;
    private ListView mRestaurantListView;

    @Before
    public void setup() {
        activity = Robolectric.setupActivity(RestaurantsListActivity.class);
    }

    @Test
    public void restaurantListViewPopulates() {
        assertNotNull(mRestaurantListView.getAdapter());
        assertEquals(mRestaurantListView.getAdapter().getCount(), 15);
    }

}
