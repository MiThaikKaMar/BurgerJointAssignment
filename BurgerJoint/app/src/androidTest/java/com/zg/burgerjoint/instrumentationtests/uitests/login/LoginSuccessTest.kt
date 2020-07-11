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
class LoginSuccessTest {

    private val activityTestRule = ActivityTestRule<LoginActivity>(LoginActivity::class.java)

    @Before
    fun setUp() {
        activityTestRule.launchActivity(Intent())
    }

    @Test
    fun fillInformation_goToMainScreen() {
        onView(withId(R.id.etUserName)).perform(typeText(TEST_USER_NAME), closeSoftKeyboard())
        onView(withId(R.id.etPassword)).perform(typeText(TEST_PASSWORD), closeSoftKeyboard())
        onView(withId(R.id.btnLogin)).perform(click())

        Thread.sleep(400)

        onView(withId(R.id.rvBurgerList)).check(matches(isDisplayed()))
    }

    companion object {
        const val TEST_USER_NAME = "Mi Thaik Ka Mar"
        const val TEST_PASSWORD = "1234"
    }
}