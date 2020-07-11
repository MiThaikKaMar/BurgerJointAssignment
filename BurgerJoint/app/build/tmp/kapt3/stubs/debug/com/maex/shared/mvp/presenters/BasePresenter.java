package com.maex.shared.mvp.presenters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J\u0015\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\u000b"}, d2 = {"Lcom/maex/shared/mvp/presenters/BasePresenter;", "V", "Lcom/zg/burgerjoint/mvp/views/BaseView;", "", "initPresenter", "", "view", "(Lcom/zg/burgerjoint/mvp/views/BaseView;)V", "onUIReady", "owner", "Landroidx/lifecycle/LifecycleOwner;", "app_debug"})
public abstract interface BasePresenter<V extends com.zg.burgerjoint.mvp.views.BaseView> {
    
    public abstract void onUIReady(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner owner);
    
    public abstract void initPresenter(@org.jetbrains.annotations.NotNull()
    V view);
}