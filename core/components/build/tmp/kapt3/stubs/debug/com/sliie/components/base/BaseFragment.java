package com.sliie.components.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J!\u0010\n\u001a\u00020\u00072\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\f\"\u00020\tH\u0004\u00a2\u0006\u0002\u0010\rJ\u001a\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0007H\u0016J\b\u0010\u0013\u001a\u00020\u0007H\u0016J\b\u0010\u0014\u001a\u00020\u0007H\u0016J\b\u0010\u0015\u001a\u00020\u0007H\u0016J\b\u0010\u0016\u001a\u00020\u0007H\u0016\u00a8\u0006\u0017"}, d2 = {"Lcom/sliie/components/base/BaseFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View$OnClickListener;", "layout", "", "(I)V", "onClick", "", "v", "Landroid/view/View;", "onClickListeners", "views", "", "([Landroid/view/View;)V", "onViewCreated", "view", "savedInstanceState", "Landroid/os/Bundle;", "setupBackStackEntry", "setupListener", "setupObserveData", "setupToolbar", "setupViews", "components_debug"})
public abstract class BaseFragment extends androidx.fragment.app.Fragment implements android.view.View.OnClickListener {
    
    public BaseFragment(int layout) {
        super();
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public void setupViews() {
    }
    
    public void setupToolbar() {
    }
    
    public void setupBackStackEntry() {
    }
    
    public void setupObserveData() {
    }
    
    public void setupListener() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.Nullable()
    android.view.View v) {
    }
    
    protected final void onClickListeners(@org.jetbrains.annotations.NotNull()
    android.view.View... views) {
    }
}