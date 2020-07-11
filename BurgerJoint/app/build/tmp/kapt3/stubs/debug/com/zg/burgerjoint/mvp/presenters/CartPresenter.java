package com.zg.burgerjoint.mvp.presenters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/zg/burgerjoint/mvp/presenters/CartPresenter;", "Lcom/maex/shared/mvp/presenters/BasePresenter;", "Lcom/zg/burgerjoint/mvp/views/CartView;", "Lcom/zg/burgerjoint/delegates/CartViewHolderActionDelegate;", "onTapCancelThankYouMessage", "", "onTapCheckout", "app_debug"})
public abstract interface CartPresenter extends com.maex.shared.mvp.presenters.BasePresenter<com.zg.burgerjoint.mvp.views.CartView>, com.zg.burgerjoint.delegates.CartViewHolderActionDelegate {
    
    public abstract void onTapCheckout();
    
    public abstract void onTapCancelThankYouMessage();
}