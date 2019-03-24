package com.example.vicky.e_coin;


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
public class UpiTest {

    @Rule
    public ActivityTestRule<Fragmentholder> mActivityTestRule = new ActivityTestRule<>(Fragmentholder.class);

    @Before
    public void yourSetUPFragment() {
        mActivityTestRule.getActivity()
                .getFragmentManager().beginTransaction();
    }
    @Test
    public void upiTest1() {



        ViewInteraction appCompatImageView = onView(
                allOf(withId(R.id.upiid),
                        childAtPosition(
                                childAtPosition(
                                        withClassName(is("android.support.v7.widget.CardView")),
                                        0),
                                0),
                        isDisplayed()));
        appCompatImageView.perform(click());

        ViewInteraction materialEditText = onView(
                allOf(withId(R.id.upitrans),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.frame_check_container),
                                        1),
                                0),
                        isDisplayed()));
        materialEditText.perform(replaceText("kk@iicic"), closeSoftKeyboard());

        ViewInteraction materialEditText2 = onView(
                allOf(withId(R.id.upitrans), withText("kk@iicic"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.frame_check_container),
                                        1),
                                0),
                        isDisplayed()));
        materialEditText2.perform(click());


        ViewInteraction materialEditText3 = onView(
                allOf(withId(R.id.materialEditText),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.frame_check_container),
                                        1),
                                1),
                        isDisplayed()));
        materialEditText3.perform(replaceText("hello"), closeSoftKeyboard());

        ViewInteraction materialEditText4 = onView(
                allOf(withId(R.id.materialEditText), withText("hello"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.frame_check_container),
                                        1),
                                1),
                        isDisplayed()));
        materialEditText4.perform(click());

        ViewInteraction materialEditText5 = onView(
                allOf(withId(R.id.materialEditText), withText("hello"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.frame_check_container),
                                        1),
                                1),
                        isDisplayed()));
        materialEditText5.perform(click());

        ViewInteraction materialEditText6 = onView(
                allOf(withId(R.id.materialEditText), withText("hello"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.frame_check_container),
                                        1),
                                1),
                        isDisplayed()));
        materialEditText6.perform(pressImeActionButton());

        ViewInteraction appCompatButton2 = onView(
                allOf(withId(R.id.upitransonclick), withText("Submit"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.frame_check_container),
                                        1),
                                2),
                        isDisplayed()));
        appCompatButton2.perform(click());

        ViewInteraction appCompatEditText4 = onView(
                allOf(withId(R.id.recipient),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                1),
                        isDisplayed()));
        appCompatEditText4.perform(replaceText("abcd@sbi"), closeSoftKeyboard());

        ViewInteraction appCompatEditText5 = onView(
                allOf(withId(R.id.amount),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        appCompatEditText5.perform(click());

        ViewInteraction appCompatEditText6 = onView(
                allOf(withId(R.id.amount),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                2),
                        isDisplayed()));
        appCompatEditText6.perform(replaceText("1000"), closeSoftKeyboard());

        ViewInteraction appCompatEditText7 = onView(
                allOf(withId(R.id.regmobile),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                3),
                        isDisplayed()));
        appCompatEditText7.perform(replaceText(""), closeSoftKeyboard());

        ViewInteraction appCompatEditText8 = onView(
                allOf(withId(R.id.regmobile),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                3),
                        isDisplayed()));
        appCompatEditText8.perform(pressImeActionButton());


        ViewInteraction appCompatButton3 = onView(
                allOf(withId(R.id.pay), withText("pay"),
                        childAtPosition(
                                childAtPosition(
                                        withId(android.R.id.content),
                                        0),
                                4),
                        isDisplayed()));
        appCompatButton3.perform(click());
    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}
