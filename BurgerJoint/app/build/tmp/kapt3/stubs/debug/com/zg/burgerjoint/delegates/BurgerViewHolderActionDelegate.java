package com.zg.burgerjoint.delegates;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\t"}, d2 = {"Lcom/zg/burgerjoint/delegates/BurgerViewHolderActionDelegate;", "", "onTapAddToCart", "", "burger", "Lcom/zg/burgerjoint/data/vos/BurgerVO;", "burgerImageView", "Landroid/widget/ImageView;", "onTapBurger", "app_debug"})
public abstract interface BurgerViewHolderActionDelegate {
    
    public abstract void onTapBurger(@org.jetbrains.annotations.NotNull()
    com.zg.burgerjoint.data.vos.BurgerVO burger, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView burgerImageView);
    
    public abstract void onTapAddToCart(@org.jetbrains.annotations.NotNull()
    com.zg.burgerjoint.data.vos.BurgerVO burger, @org.jetbrains.annotations.NotNull()
    android.widget.ImageView burgerImageView);
}