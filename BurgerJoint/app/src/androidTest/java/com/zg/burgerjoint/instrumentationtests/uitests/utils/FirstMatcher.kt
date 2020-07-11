package com.zg.burgerjoint.instrumentationtests.uitests.utils

import org.hamcrest.BaseMatcher
import org.hamcrest.Description

fun <T> first(matcher: org.hamcrest.Matcher<T>): org.hamcrest.Matcher<T> {
    return object : BaseMatcher<T>() {
        var isFirst = true

        override fun describeTo(description: Description?) {
            description?.appendText(DESCRIPTION_TEXT)
        }

        override fun matches(item: Any?): Boolean {

            if (isFirst && matcher.matches(item)) {
                isFirst = false
                return true
            }
            return false
        }
    }
}

const val DESCRIPTION_TEXT = "First item matcher"