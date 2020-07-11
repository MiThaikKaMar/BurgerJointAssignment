package com.zg.burgerjoint.data.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b0\u0007H&J\u0014\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b0\u0007H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u000e"}, d2 = {"Lcom/zg/burgerjoint/data/model/BurgerModel;", "", "addItemToCart", "", "burger", "Lcom/zg/burgerjoint/data/vos/BurgerVO;", "findBurgerById", "Landroidx/lifecycle/LiveData;", "burgerId", "", "getAllBurgers", "", "getBurgersInCart", "removeItemFromCart", "app_debug"})
public abstract interface BurgerModel {
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.zg.burgerjoint.data.vos.BurgerVO>> getAllBurgers();
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<com.zg.burgerjoint.data.vos.BurgerVO> findBurgerById(int burgerId);
    
    @org.jetbrains.annotations.NotNull()
    public abstract androidx.lifecycle.LiveData<java.util.List<com.zg.burgerjoint.data.vos.BurgerVO>> getBurgersInCart();
    
    public abstract void removeItemFromCart(@org.jetbrains.annotations.NotNull()
    com.zg.burgerjoint.data.vos.BurgerVO burger);
    
    public abstract void addItemToCart(@org.jetbrains.annotations.NotNull()
    com.zg.burgerjoint.data.vos.BurgerVO burger);
}