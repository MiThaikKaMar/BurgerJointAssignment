package com.zg.burgerjoint.viewholders;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0015\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010\nR\u001e\u0010\u0006\u001a\u0004\u0018\u00018\u0000X\u0084\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000f"}, d2 = {"Lcom/zg/burgerjoint/viewholders/BaseViewHolder;", "W", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "mData", "getMData", "()Ljava/lang/Object;", "setMData", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "bindData", "", "data", "app_debug"})
public abstract class BaseViewHolder<W extends java.lang.Object> extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    @org.jetbrains.annotations.Nullable()
    private W mData;
    
    @org.jetbrains.annotations.Nullable()
    protected final W getMData() {
        return null;
    }
    
    protected final void setMData(@org.jetbrains.annotations.Nullable()
    W p0) {
    }
    
    public abstract void bindData(W data);
    
    public BaseViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.View itemView) {
        super(null);
    }
}