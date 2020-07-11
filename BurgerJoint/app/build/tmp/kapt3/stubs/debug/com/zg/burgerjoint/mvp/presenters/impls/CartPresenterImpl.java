package com.zg.burgerjoint.mvp.presenters.impls;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/zg/burgerjoint/mvp/presenters/impls/CartPresenterImpl;", "Lcom/zg/burgerjoint/mvp/presenters/CartPresenter;", "Lcom/zg/burgerjoint/mvp/presenters/impls/BaseAppPresenterImpl;", "Lcom/zg/burgerjoint/mvp/views/CartView;", "()V", "mBurgerModel", "Lcom/zg/burgerjoint/data/model/impls/BurgerModelImpl;", "onTapCancelThankYouMessage", "", "onTapCheckout", "onTapRemoveFromCart", "burger", "Lcom/zg/burgerjoint/data/vos/BurgerVO;", "adapterPosition", "", "onUIReady", "owner", "Landroidx/lifecycle/LifecycleOwner;", "app_debug"})
public final class CartPresenterImpl extends com.zg.burgerjoint.mvp.presenters.impls.BaseAppPresenterImpl<com.zg.burgerjoint.mvp.views.CartView> implements com.zg.burgerjoint.mvp.presenters.CartPresenter {
    private final com.zg.burgerjoint.data.model.impls.BurgerModelImpl mBurgerModel = null;
    
    @java.lang.Override()
    public void onUIReady(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner owner) {
    }
    
    @java.lang.Override()
    public void onTapRemoveFromCart(@org.jetbrains.annotations.NotNull()
    com.zg.burgerjoint.data.vos.BurgerVO burger, int adapterPosition) {
    }
    
    @java.lang.Override()
    public void onTapCheckout() {
    }
    
    @java.lang.Override()
    public void onTapCancelThankYouMessage() {
    }
    
    public CartPresenterImpl() {
        super();
    }
}