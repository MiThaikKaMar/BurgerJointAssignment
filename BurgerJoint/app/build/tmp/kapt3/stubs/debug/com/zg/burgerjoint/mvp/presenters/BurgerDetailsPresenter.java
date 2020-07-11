package com.zg.burgerjoint.mvp.presenters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lcom/zg/burgerjoint/mvp/presenters/BurgerDetailsPresenter;", "Lcom/maex/shared/mvp/presenters/BasePresenter;", "Lcom/zg/burgerjoint/mvp/views/BurgerDetailsView;", "onBurgerDetailsUiReady", "", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "burgerDetailsId", "", "app_debug"})
public abstract interface BurgerDetailsPresenter extends com.maex.shared.mvp.presenters.BasePresenter<com.zg.burgerjoint.mvp.views.BurgerDetailsView> {
    
    public abstract void onBurgerDetailsUiReady(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner, int burgerDetailsId);
}