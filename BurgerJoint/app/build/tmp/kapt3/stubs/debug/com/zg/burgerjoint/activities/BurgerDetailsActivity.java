package com.zg.burgerjoint.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0012\u0010\u000f\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\b\u0010\u0012\u001a\u00020\fH\u0002J\b\u0010\u0013\u001a\u00020\fH\u0002J\b\u0010\u0014\u001a\u00020\fH\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/zg/burgerjoint/activities/BurgerDetailsActivity;", "Lcom/zg/burgerjoint/activities/BaseActivity;", "Lcom/zg/burgerjoint/mvp/views/BurgerDetailsView;", "()V", "isFavorite", "", "()Z", "setFavorite", "(Z)V", "mPresenter", "Lcom/zg/burgerjoint/mvp/presenters/BurgerDetailsPresenter;", "displayBurgerDetails", "", "burger", "Lcom/zg/burgerjoint/data/vos/BurgerVO;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setUpListeners", "setUpPresenter", "setUpTransitions", "Companion", "app_debug"})
public final class BurgerDetailsActivity extends com.zg.burgerjoint.activities.BaseActivity implements com.zg.burgerjoint.mvp.views.BurgerDetailsView {
    private com.zg.burgerjoint.mvp.presenters.BurgerDetailsPresenter mPresenter;
    private boolean isFavorite;
    private static final java.lang.String EXTRA_BURGER_ID = "Burger Id Extra";
    public static final com.zg.burgerjoint.activities.BurgerDetailsActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    public final boolean isFavorite() {
        return false;
    }
    
    public final void setFavorite(boolean p0) {
    }
    
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
    
    @java.lang.Override()
    public void displayBurgerDetails(@org.jetbrains.annotations.NotNull()
    com.zg.burgerjoint.data.vos.BurgerVO burger) {
    }
    
    public BurgerDetailsActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/zg/burgerjoint/activities/BurgerDetailsActivity$Companion;", "", "()V", "EXTRA_BURGER_ID", "", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "burgerId", "", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, int burgerId) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}