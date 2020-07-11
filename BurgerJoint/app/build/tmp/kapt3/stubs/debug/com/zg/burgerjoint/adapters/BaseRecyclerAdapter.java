package com.zg.burgerjoint.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\b&\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00030\u0002*\u0004\b\u0001\u0010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0013\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u0010J\u0014\u0010\u0011\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013J\u0006\u0010\u0014\u001a\u00020\u000eJ\u0015\u0010\u0015\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0016\u001a\u00020\u0017\u00a2\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u0017H\u0016J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013J\u001d\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u0017H\u0016\u00a2\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u0010J\u0013\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u0010J\u0014\u0010 \u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013R*\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00028\u00010\u0007j\b\u0012\u0004\u0012\u00028\u0001`\bX\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006!"}, d2 = {"Lcom/zg/burgerjoint/adapters/BaseRecyclerAdapter;", "T", "Lcom/zg/burgerjoint/viewholders/BaseViewHolder;", "W", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "()V", "mData", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getMData", "()Ljava/util/ArrayList;", "setMData", "(Ljava/util/ArrayList;)V", "addNewData", "", "data", "(Ljava/lang/Object;)V", "appendNewData", "newData", "", "clearData", "getItemAt", "position", "", "(I)Ljava/lang/Object;", "getItemCount", "getItems", "onBindViewHolder", "holder", "(Lcom/zg/burgerjoint/viewholders/BaseViewHolder;I)V", "removeData", "removeGently", "setNewData", "app_debug"})
public abstract class BaseRecyclerAdapter<T extends com.zg.burgerjoint.viewholders.BaseViewHolder<W>, W extends java.lang.Object> extends androidx.recyclerview.widget.RecyclerView.Adapter<T> {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<W> mData;
    
    @org.jetbrains.annotations.NotNull()
    protected final java.util.ArrayList<W> getMData() {
        return null;
    }
    
    protected final void setMData(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<W> p0) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    T holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setNewData(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends W> newData) {
    }
    
    public final void appendNewData(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends W> newData) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final W getItemAt(int position) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<W> getItems() {
        return null;
    }
    
    public final void removeData(W data) {
    }
    
    public final void removeGently(W data) {
    }
    
    public final void addNewData(W data) {
    }
    
    public final void clearData() {
    }
    
    public BaseRecyclerAdapter() {
        super();
    }
}