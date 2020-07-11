package com.zg.burgerjoint.mvp.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&\u00a8\u0006\f"}, d2 = {"Lcom/zg/burgerjoint/mvp/views/CartView;", "Lcom/zg/burgerjoint/mvp/views/BaseView;", "animateRemoveItemFromCart", "", "adapterPosition", "", "displayItemsInCart", "burgers", "", "Lcom/zg/burgerjoint/data/vos/BurgerVO;", "displayThankYouMessage", "hideThankYouMessage", "app_debug"})
public abstract interface CartView extends com.zg.burgerjoint.mvp.views.BaseView {
    
    public abstract void displayItemsInCart(@org.jetbrains.annotations.NotNull()
    java.util.List<com.zg.burgerjoint.data.vos.BurgerVO> burgers);
    
    public abstract void displayThankYouMessage();
    
    public abstract void hideThankYouMessage();
    
    public abstract void animateRemoveItemFromCart(int adapterPosition);
}