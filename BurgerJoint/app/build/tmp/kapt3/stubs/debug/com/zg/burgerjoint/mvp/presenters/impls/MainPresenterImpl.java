package com.zg.burgerjoint.mvp.presenters.impls;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0012\u001a\u00020\fH\u0016J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0016"}, d2 = {"Lcom/zg/burgerjoint/mvp/presenters/impls/MainPresenterImpl;", "Lcom/zg/burgerjoint/mvp/presenters/MainPresenter;", "Lcom/zg/burgerjoint/mvp/presenters/impls/BaseAppPresenterImpl;", "Lcom/zg/burgerjoint/mvp/views/MainView;", "()V", "mBurgerModel", "Lcom/zg/burgerjoint/data/model/BurgerModel;", "getMBurgerModel", "()Lcom/zg/burgerjoint/data/model/BurgerModel;", "setMBurgerModel", "(Lcom/zg/burgerjoint/data/model/BurgerModel;)V", "onTapAddToCart", "", "burger", "Lcom/zg/burgerjoint/data/vos/BurgerVO;", "burgerImageView", "Landroid/widget/ImageView;", "onTapBurger", "onTapCart", "onUIReady", "owner", "Landroidx/lifecycle/LifecycleOwner;", "app_debug"})
public final class MainPresenterImpl extends com.zg.burgerjoint.mvp.presenters.impls.BaseAppPresenterImpl<com.zg.burgerjoint.mvp.views.MainView> implements com.zg.burgerjoint.mvp.presenters.MainPresenter {
    @org.jetbrains.annotations.NotNull()
    private com.zg.burgerjoint.data.model.BurgerModel mBurgerModel;
    
    @org.jetbrains.annotations.NotNull()
    public final com.zg.burgerjoint.data.model.BurgerModel getMBurgerModel() {
        return null;
    }
    
    public final void setMBurgerModel(@org.jetbrains.annotations.NotNull()
    com.zg.burgerjoint.data.model.BurgerModel p0) {
    }
    
    @java.lang.Override()
    public void onTapAddToCart(@org.jetbrains.annotations.NotNull()
    com.zg.burgerjoint.data.vos.BurgerVO burger, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView burgerImageView) {
    }
    
    @java.lang.Override()
    public void onTapCart() {
    }
    
    @java.lang.Override()
    public void onUIReady(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner owner) {
    }
    
    @java.lang.Override()
    public void onTapBurger(@org.jetbrains.annotations.NotNull()
    com.zg.burgerjoint.data.vos.BurgerVO burger, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView burgerImageView) {
    }
    
    public MainPresenterImpl() {
        super();
    }
}