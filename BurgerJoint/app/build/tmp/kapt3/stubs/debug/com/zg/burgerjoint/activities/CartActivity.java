package com.zg.burgerjoint.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0016\u0010\f\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016J\b\u0010\u0010\u001a\u00020\tH\u0016J\b\u0010\u0011\u001a\u00020\tH\u0016J\u0012\u0010\u0012\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\b\u0010\u0015\u001a\u00020\tH\u0002J\b\u0010\u0016\u001a\u00020\tH\u0002J\b\u0010\u0017\u001a\u00020\tH\u0002J\b\u0010\u0018\u001a\u00020\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/zg/burgerjoint/activities/CartActivity;", "Lcom/zg/burgerjoint/activities/BaseActivity;", "Lcom/zg/burgerjoint/mvp/views/CartView;", "()V", "mBurgerAdapter", "Lcom/zg/burgerjoint/adapters/CartAdapter;", "mPresenter", "Lcom/zg/burgerjoint/mvp/presenters/CartPresenter;", "animateRemoveItemFromCart", "", "adapterPosition", "", "displayItemsInCart", "burgers", "", "Lcom/zg/burgerjoint/data/vos/BurgerVO;", "displayThankYouMessage", "hideThankYouMessage", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setUpListeners", "setUpPresenter", "setUpRecycler", "setUpTransition", "Companion", "app_debug"})
public final class CartActivity extends com.zg.burgerjoint.activities.BaseActivity implements com.zg.burgerjoint.mvp.views.CartView {
    private com.zg.burgerjoint.adapters.CartAdapter mBurgerAdapter;
    private com.zg.burgerjoint.mvp.presenters.CartPresenter mPresenter;
    public static final com.zg.burgerjoint.activities.CartActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUpTransition() {
    }
    
    private final void setUpListeners() {
    }
    
    private final void setUpPresenter() {
    }
    
    private final void setUpRecycler() {
    }
    
    @java.lang.Override()
    public void displayItemsInCart(@org.jetbrains.annotations.NotNull()
    java.util.List<com.zg.burgerjoint.data.vos.BurgerVO> burgers) {
    }
    
    @java.lang.Override()
    public void animateRemoveItemFromCart(int adapterPosition) {
    }
    
    @java.lang.Override()
    public void displayThankYouMessage() {
    }
    
    @java.lang.Override()
    public void hideThankYouMessage() {
    }
    
    public CartActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/zg/burgerjoint/activities/CartActivity$Companion;", "", "()V", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}