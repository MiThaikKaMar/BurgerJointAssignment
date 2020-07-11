package com.zg.burgerjoint.instrumentationtests.uitests.login

import android.content.Intent
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import androidx.test.rule.ActivityTestRule
import com.zg.burgerjoint.R
import com.zg.burgerjoint.activities.LoginActivity
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class LoginFailTest {

    private val activityTestRule = ActivityTestRule<LoginActivity>(LoginActivity::class.java)

    @Before
    fun setUp() {
        activityTestRule.launchActivity(Intent())
    }

    @Test
    fun fillInformation_goToMainScreenFail() {
        onView(withId(R.id.etUserName)).perform(typeText(""), closeSoftKeyboard())
        onView((withId(R.id.etPassword))).perform(typeText(""), closeSoftKeyboard())
        onView(withId(R.id.btnLogin)).perform(click())
        Thread.sleep(400)

        onView(withId(com.google.android.material.R.id.snackbar_text)).check(matches(isDisplayed()))
    }
}