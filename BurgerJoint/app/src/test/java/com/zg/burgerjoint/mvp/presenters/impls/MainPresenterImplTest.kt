package com.zg.burgerjoint.mvp.presenters.impls

import android.widget.ImageView
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.zg.burgerjoint.data.model.BurgerModel
import com.zg.burgerjoint.data.model.impls.BurgerModelImpl
import com.zg.burgerjoint.data.model.impls.MockBurgerModelImpl
import com.zg.burgerjoint.data.vos.BurgerVO
import com.zg.burgerjoint.dummy.getDummyBurgers
import com.zg.burgerjoint.mvp.views.MainView
import io.mockk.MockKAnnotations
import io.mockk.impl.annotations.RelaxedMockK
import io.mockk.verify
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock
import org.robolectric.annotation.Config

@RunWith(AndroidJUnit4::class)
@Config(manifest = Config.NONE)
class MainPresenterImplTest {
   private lateinit var mPresenter : MainPresenterImpl

    @RelaxedMockK
    private lateinit var mView : MainView

    private lateinit var mModel : BurgerModel

    @Before
    fun setUpPresenter(){
        MockKAnnotations.init(this)

        BurgerModelImpl.init(ApplicationProvider.getApplicationContext())
        mModel=MockBurgerModelImpl

        mPresenter= MainPresenterImpl()
        mPresenter.initPresenter(mView)
        mPresenter.mBurgerModel=this.mModel
    }

    @Test
    fun onTapAddToCart_callAddBurgerToCart(){
        val burgerOne=BurgerVO()
        burgerOne.burgerId=1
        burgerOne.burgerName="Cheese Burger"
        burgerOne.burgerImageUrl=""
        burgerOne.burgerDescription="The All-American Cheeseburger has certain non-negotiable elements: American cheese is one of them. Rather than unwrap individual singles, get sliced cheese from your nearest deli counter — it tastes better and melts slower and more evenly. "

        val imageView = ImageView(ApplicationProvider.getApplicationContext())

        mPresenter.onTapAddToCart(burgerOne,imageView)
        verify {
            mView.addBurgerToCart(burgerOne,imageView)
        }
    }

    @Test
    fun onTapCart_callNavigateToCartScreen(){
        mPresenter.onTapCart()
        verify {
            mView.navigatetoCartScreen()
        }
    }

    @Test
    fun onUIReady_callDisplayBurgerList_callDisplayCountInCart(){
        val lifecycleOwner = mock(LifecycleOwner::class.java)
        val lifecycleRegistry = LifecycleRegistry(lifecycleOwner)
        lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME)
        `when`(lifecycleOwner.lifecycle).thenReturn(lifecycleRegistry)

        mPresenter.onUIReady(lifecycleOwner)
        verify {
            mView.displayBurgerList(getDummyBurgers())
        }
    }

    @Test
    fun onTapBurger_callNavigateToBurgerDetailScreen(){
        val burgerTwo=BurgerVO()
        burgerTwo.burgerId=2
        burgerTwo.burgerName="Chicken Burger"
        burgerTwo.burgerImageUrl=""
        burgerTwo.burgerDescription="The All-American Cheeseburger has certain non-negotiable elements: American cheese is one of them. Rather than unwrap individual singles, get sliced cheese from your nearest deli counter — it tastes better and melts slower and more evenly. "

        val imageView = ImageView(ApplicationProvider.getApplicationContext())

        mPresenter.onTapBurger(burgerTwo,imageView)
        verify {
            mView.navigateToBurgerDetailsScreen(burgerTwo.burgerId,imageView)
        }
    }
}