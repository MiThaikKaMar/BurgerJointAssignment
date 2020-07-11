package com.zg.burgerjoint.data.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u000e"}, d2 = {"Lcom/zg/burgerjoint/data/model/BaseAppModel;", "Lcom/zg/burgerjoint/data/model/BaseModel;", "()V", "mDatabase", "Lcom/zg/burgerjoint/persistence/BurgerJointDatabase;", "getMDatabase", "()Lcom/zg/burgerjoint/persistence/BurgerJointDatabase;", "setMDatabase", "(Lcom/zg/burgerjoint/persistence/BurgerJointDatabase;)V", "init", "", "context", "Landroid/content/Context;", "initDatabase", "app_debug"})
public abstract class BaseAppModel extends com.zg.burgerjoint.data.model.BaseModel {
    @org.jetbrains.annotations.NotNull()
    protected com.zg.burgerjoint.persistence.BurgerJointDatabase mDatabase;
    
    @org.jetbrains.annotations.NotNull()
    protected final com.zg.burgerjoint.persistence.BurgerJointDatabase getMDatabase() {
        return null;
    }
    
    protected final void setMDatabase(@org.jetbrains.annotations.NotNull()
    com.zg.burgerjoint.persistence.BurgerJointDatabase p0) {
    }
    
    @java.lang.Override()
    public void init(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    private final void initDatabase(android.content.Context context) {
    }
    
    public BaseAppModel() {
        super();
    }
}