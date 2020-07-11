package com.zg.burgerjoint.data.vos;

import java.lang.System;

@androidx.room.Entity(tableName = "burgers")
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0018\u001a\u00020\nH\u0016R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001e\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\b\u00a8\u0006\u0019"}, d2 = {"Lcom/zg/burgerjoint/data/vos/BurgerVO;", "", "()V", "burgerDescription", "", "getBurgerDescription", "()Ljava/lang/String;", "setBurgerDescription", "(Ljava/lang/String;)V", "burgerId", "", "getBurgerId", "()I", "setBurgerId", "(I)V", "burgerImageUrl", "getBurgerImageUrl", "setBurgerImageUrl", "burgerName", "getBurgerName", "setBurgerName", "equals", "", "other", "hashCode", "app_debug"})
public final class BurgerVO {
    @androidx.room.ColumnInfo(name = "burger_id_pk")
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int burgerId;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "burger_name")
    private java.lang.String burgerName;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "burger_description")
    private java.lang.String burgerDescription;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "burger_image_url")
    private java.lang.String burgerImageUrl;
    
    public final int getBurgerId() {
        return 0;
    }
    
    public final void setBurgerId(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBurgerName() {
        return null;
    }
    
    public final void setBurgerName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBurgerDescription() {
        return null;
    }
    
    public final void setBurgerDescription(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBurgerImageUrl() {
        return null;
    }
    
    public final void setBurgerImageUrl(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    public BurgerVO() {
        super();
    }
}