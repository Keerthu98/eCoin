package com.example.vicky.e_coin;



import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.action.ViewActions.click;

import android.support.test.espresso.contrib.RecyclerViewActions;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class RecyclerViewTest {

    @Rule
    public ActivityTestRule<Recycler> mActivityTestRule = new ActivityTestRule<>(Recycler.class);

    @Test
    public void Test1() {
        onView(ViewMatchers.withId(R.id.recycler))
                .perform(RecyclerViewActions.actionOnItemAtPosition(0, click()));
        pressBack();
    }

    @Test
    public void Test2() {
        onView(ViewMatchers.withId(R.id.recycler))
                .perform(RecyclerViewActions.scrollToPosition(1));

        onView(ViewMatchers.withId(R.id.recycler))
                .perform(RecyclerViewActions.actionOnItemAtPosition(1, click()));
        pressBack();
    }
    @Test
    public void Test3() {

        onView(ViewMatchers.withId(R.id.recycler))
                .perform(RecyclerViewActions.scrollToPosition(2));

        onView(ViewMatchers.withId(R.id.recycler))
                .perform(RecyclerViewActions.actionOnItemAtPosition(2, click()));
        pressBack();
    }

    @Test
    public void Test4() {

        onView(ViewMatchers.withId(R.id.recycler))
                .perform(RecyclerViewActions.scrollToPosition(3));

        onView(ViewMatchers.withId(R.id.recycler))
                .perform(RecyclerViewActions.actionOnItemAtPosition(3, click()));

        pressBack();
    }
}
