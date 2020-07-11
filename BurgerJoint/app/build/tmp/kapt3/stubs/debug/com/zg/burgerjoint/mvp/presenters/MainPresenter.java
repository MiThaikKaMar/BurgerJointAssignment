package com.zg.burgerjoint.mvp.presenters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/zg/burgerjoint/mvp/presenters/MainPresenter;", "Lcom/maex/shared/mvp/presenters/BasePresenter;", "Lcom/zg/burgerjoint/mvp/views/MainView;", "Lcom/zg/burgerjoint/delegates/BurgerViewHolderActionDelegate;", "onTapCart", "", "app_debug"})
public abstract interface MainPresenter extends com.maex.shared.mvp.presenters.BasePresenter<com.zg.burgerjoint.mvp.views.MainView>, com.zg.burgerjoint.delegates.BurgerViewHolderActionDelegate {
    
    public abstract void onTapCart();
}