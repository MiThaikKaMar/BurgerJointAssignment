package com.zg.burgerjoint.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0001&B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0016\u0010\u000e\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\u0018\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u001a\u001a\u00020\tH\u0016J\u0012\u0010\u001b\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\b\u0010\u001e\u001a\u00020\tH\u0002J\b\u0010\u001f\u001a\u00020\tH\u0002J\b\u0010 \u001a\u00020\tH\u0002J\b\u0010!\u001a\u00020\tH\u0002J \u0010\"\u001a\u00020\r2\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00020\u0013H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/zg/burgerjoint/activities/MainActivity;", "Lcom/zg/burgerjoint/activities/BaseActivity;", "Lcom/zg/burgerjoint/mvp/views/MainView;", "()V", "mBurgerAdapter", "Lcom/zg/burgerjoint/adapters/BurgerAdapter;", "mPresenter", "Lcom/zg/burgerjoint/mvp/presenters/MainPresenter;", "addBurgerToCart", "", "burger", "Lcom/zg/burgerjoint/data/vos/BurgerVO;", "burgerImageView", "Landroid/widget/ImageView;", "displayBurgerList", "burgerList", "", "displayCountInCart", "burgersInCartCount", "", "getPositionOf", "", "view", "Landroid/view/View;", "navigateToBurgerDetailsScreen", "burgerId", "navigatetoCartScreen", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setUpListeners", "setUpPresenter", "setUpRecycler", "setUpTransitions", "setUpViewToAnimate", "item", "imageView", "imageSize", "Companion", "app_debug"})
public final class MainActivity extends com.zg.burgerjoint.activities.BaseActivity implements com.zg.burgerjoint.mvp.views.MainView {
    private com.zg.burgerjoint.adapters.BurgerAdapter mBurgerAdapter;
    private com.zg.burgerjoint.mvp.presenters.MainPresenter mPresenter;
    public static final com.zg.burgerjoint.activities.MainActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUpTransitions() {
    }
    
    private final void setUpListeners() {
    }
    
    private final void setUpPresenter() {
    }
    
    private final void setUpRecycler() {
    }
    
    @java.lang.Override()
    public void navigateToBurgerDetailsScreen(int burgerId, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView burgerImageView) {
    }
    
    @java.lang.Override()
    public void navigatetoCartScreen() {
    }
    
    @java.lang.Override()
    public void displayBurgerList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.zg.burgerjoint.data.vos.BurgerVO> burgerList) {
    }
    
    @java.lang.Override()
    public void displayCountInCart(int burgersInCartCount) {
    }
    
    @java.lang.Override()
    public void addBurgerToCart(@org.jetbrains.annotations.NotNull()
    com.zg.burgerjoint.data.vos.BurgerVO burger, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView burgerImageView) {
    }
    
    private final int[] getPositionOf(android.view.View view) {
        return null;
    }
    
    private final android.widget.ImageView setUpViewToAnimate(com.zg.burgerjoint.data.vos.BurgerVO item, android.widget.ImageView imageView, int imageSize) {
        return null;
    }
    
    public MainActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/zg/burgerjoint/activities/MainActivity$Companion;", "", "()V", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "app_debug"})
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