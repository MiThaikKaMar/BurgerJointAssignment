package com.zg.burgerjoint.persistence.daos;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\'J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\'J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000b0\u0005H\'J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0006H\'J\u0016\u0010\u000e\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\'\u00a8\u0006\u0010"}, d2 = {"Lcom/zg/burgerjoint/persistence/daos/BurgerDao;", "", "deleteAllBurgers", "", "findBurgerById", "Landroidx/lifecycle/LiveData;", "Lcom/zg/burgerjoint/data/vos/BurgerVO;", "id", "", "findBurgerByIdOneShot", "getAllBurgers", "", "insert", "burger", "insertBurgers", "burgers", "app_debug"})
public abstract interface BurgerDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertBurgers(@org.jetbrains.annotations.NotNull()
    java.util.List<com.zg.burgerjoint.data.vos.BurgerVO> burgers);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.zg.burgerjoint.data.vos.BurgerVO burger);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM burgers")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.zg.burgerjoint.data.vos.BurgerVO>> getAllBurgers();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM burgers WHERE burger_id_pk = :id")
    public abstract androidx.lifecycle.LiveData<com.zg.burgerjoint.data.vos.BurgerVO> findBurgerById(int id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM burgers WHERE burger_id_pk = :id")
    public abstract com.zg.burgerjoint.data.vos.BurgerVO findBurgerByIdOneShot(int id);
    
    @androidx.room.Query(value = "DELETE FROM burgers")
    public abstract void deleteAllBurgers();
}