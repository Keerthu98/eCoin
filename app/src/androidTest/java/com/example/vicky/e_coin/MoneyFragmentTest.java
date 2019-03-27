package com.example.vicky.e_coin;

import android.support.test.espresso.FailureHandler;
import android.support.test.espresso.ViewInteraction;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.pressImeActionButton;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withClassName;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;
import android.support.test.espresso.contrib.RecyclerViewActions;
//import androidx.test.core.app.ActivityScenario;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MoneyFragmentTest {
    @Rule
    public ActivityTestRule<Fragmentholder> mActivityTestRule = new ActivityTestRule<>(Fragmentholder.class);

    @Before
    public void init() {
        mActivityTestRule.getActivity()
                .getFragmentManager().beginTransaction();
    }
    @Test
    public void Test1() {
    onView(withId(R.id.mailid)).check(matches(isDisplayed()));
//        onView(withId(R.id.mailid)).perform(scrollTo()).perform(click());

    }
    @Test
    public void Test2() {
        onView(withId(R.id.upiid)).check(matches(isDisplayed()));
    }
    @Test
    public void Test3() {
        onView(withId(R.id.phone)).check(matches(isDisplayed()));
    }

    @Test
    public void Test4() {
        onView(withId(R.id.atm)).check(matches(isDisplayed()));
    }
}
