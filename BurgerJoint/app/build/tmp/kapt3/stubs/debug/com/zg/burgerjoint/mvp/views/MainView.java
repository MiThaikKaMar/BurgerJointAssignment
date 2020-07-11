package com.zg.burgerjoint.mvp.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\u0010\u001a\u00020\u0003H&\u00a8\u0006\u0011"}, d2 = {"Lcom/zg/burgerjoint/mvp/views/MainView;", "Lcom/zg/burgerjoint/mvp/views/BaseView;", "addBurgerToCart", "", "burger", "Lcom/zg/burgerjoint/data/vos/BurgerVO;", "burgerImageView", "Landroid/widget/ImageView;", "displayBurgerList", "burgerList", "", "displayCountInCart", "burgersInCartCount", "", "navigateToBurgerDetailsScreen", "burgerId", "navigatetoCartScreen", "app_debug"})
public abstract interface MainView extends com.zg.burgerjoint.mvp.views.BaseView {
    
    public abstract void displayBurgerList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.zg.burgerjoint.data.vos.BurgerVO> burgerList);
    
    public abstract void navigateToBurgerDetailsScreen(int burgerId, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView burgerImageView);
    
    public abstract void navigatetoCartScreen();
    
    public abstract void addBurgerToCart(@org.jetbrains.annotations.NotNull()
    com.zg.burgerjoint.data.vos.BurgerVO burger, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView burgerImageView);
    
    public abstract void displayCountInCart(int burgersInCartCount);
}