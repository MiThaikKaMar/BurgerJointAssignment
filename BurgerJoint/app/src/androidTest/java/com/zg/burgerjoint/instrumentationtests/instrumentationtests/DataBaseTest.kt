package com.zg.burgerjoint.instrumentationtests.instrumentationtests

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.zg.burgerjoint.data.vos.BurgerVO
import com.zg.burgerjoint.persistence.BurgerJointDatabase
import com.zg.burgerjoint.persistence.daos.BurgerDao
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class DataBaseTest {
    private lateinit var burgerDao : BurgerDao
    private lateinit var db : BurgerJointDatabase

    @Before
    fun setUpDB(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        db = Room.inMemoryDatabaseBuilder(context,BurgerJointDatabase::class.java).build()
        burgerDao=db.getBurgerDao()
    }

    @After
    fun closeDB(){
        db.close()
    }

    @Test
    fun roomDBTest(){
        val burgerOne = BurgerVO()
        burgerOne.burgerId=1
        burgerOne.burgerName="Chicken Burger"
        burgerOne.burgerImageUrl=""
        burgerOne.burgerDescription="The All-American Cheeseburger has certain non-negotiable elements: American cheese is one of them. Rather than unwrap individual singles, get sliced cheese from your nearest deli counter — it tastes better and melts slower and more evenly. "

        burgerDao.insert(burgerOne)
        assert(burgerDao.findBurgerById(burgerOne.burgerId).value?.burgerId == burgerOne.burgerId)
    }
}