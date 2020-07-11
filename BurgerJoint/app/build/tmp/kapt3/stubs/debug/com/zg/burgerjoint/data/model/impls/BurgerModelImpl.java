package com.zg.burgerjoint.data.model.impls;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0006H\u0016J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0014\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\r0\u0016H\u0016J\u0014\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\r0\u0016H\u0016J\u0010\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0006H\u0016R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR&\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\r0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001c"}, d2 = {"Lcom/zg/burgerjoint/data/model/impls/BurgerModelImpl;", "Lcom/zg/burgerjoint/data/model/BurgerModel;", "Lcom/zg/burgerjoint/data/model/BaseAppModel;", "()V", "burgersInOrder", "", "Lcom/zg/burgerjoint/data/vos/BurgerVO;", "getBurgersInOrder", "()Ljava/util/List;", "setBurgersInOrder", "(Ljava/util/List;)V", "burgersInOrderLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "getBurgersInOrderLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setBurgersInOrderLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "addItemToCart", "", "burger", "findBurgerById", "Landroidx/lifecycle/LiveData;", "burgerId", "", "getAllBurgers", "getBurgersInCart", "removeItemFromCart", "app_debug"})
public final class BurgerModelImpl extends com.zg.burgerjoint.data.model.BaseAppModel implements com.zg.burgerjoint.data.model.BurgerModel {
    @org.jetbrains.annotations.NotNull()
    private static java.util.List<com.zg.burgerjoint.data.vos.BurgerVO> burgersInOrder;
    @org.jetbrains.annotations.NotNull()
    private static androidx.lifecycle.MutableLiveData<java.util.List<com.zg.burgerjoint.data.vos.BurgerVO>> burgersInOrderLiveData;
    public static final com.zg.burgerjoint.data.model.impls.BurgerModelImpl INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.zg.burgerjoint.data.vos.BurgerVO> getBurgersInOrder() {
        return null;
    }
    
    public final void setBurgersInOrder(@org.jetbrains.annotations.NotNull()
    java.util.List<com.zg.burgerjoint.data.vos.BurgerVO> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.zg.burgerjoint.data.vos.BurgerVO>> getBurgersInOrderLiveData() {
        return null;
    }
    
    public final void setBurgersInOrderLiveData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<com.zg.burgerjoint.data.vos.BurgerVO>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<com.zg.burgerjoint.data.vos.BurgerVO> findBurgerById(int burgerId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.zg.burgerjoint.data.vos.BurgerVO>> getAllBurgers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public androidx.lifecycle.LiveData<java.util.List<com.zg.burgerjoint.data.vos.BurgerVO>> getBurgersInCart() {
        return null;
    }
    
    @java.lang.Override()
    public void removeItemFromCart(@org.jetbrains.annotations.NotNull()
    com.zg.burgerjoint.data.vos.BurgerVO burger) {
    }
    
    @java.lang.Override()
    public void addItemToCart(@org.jetbrains.annotations.NotNull()
    com.zg.burgerjoint.data.vos.BurgerVO burger) {
    }
    
    private BurgerModelImpl() {
        super();
    }
}