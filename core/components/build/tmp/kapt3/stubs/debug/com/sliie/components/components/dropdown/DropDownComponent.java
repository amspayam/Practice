package com.sliie.components.components.dropdown;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0019\u001a\u0004\u0018\u00010\u0010J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u001bH\u0002J\b\u0010\u001d\u001a\u00020\u001bH\u0002J\u0006\u0010\u001e\u001a\u00020\u001fJ\u0010\u0010 \u001a\u00020\u001b2\b\u0010!\u001a\u0004\u0018\u00010\u000eJ\u0014\u0010\"\u001a\u00020\u001b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100#J\u0010\u0010$\u001a\u00020\u001b2\b\u0010%\u001a\u0004\u0018\u00010\u000eR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R*\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e8F@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006&"}, d2 = {"Lcom/sliie/components/components/dropdown/DropDownComponent;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/sliide/components/databinding/ComponentDropDownBinding;", "drawableStart", "Ljava/lang/Integer;", "hint", "", "itemSelected", "Lcom/sliie/components/components/dropdown/model/DropDownModel;", "list", "", "value", "text", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "getItemSelect", "initEditText", "", "initInputText", "initView", "isEmpty", "", "select", "id", "setData", "", "setError", "error", "components_debug"})
public final class DropDownComponent extends androidx.constraintlayout.widget.ConstraintLayout {
    private com.sliide.components.databinding.ComponentDropDownBinding binding;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String text = "";
    private java.lang.String hint;
    private java.lang.Integer drawableStart;
    private com.sliie.components.components.dropdown.model.DropDownModel itemSelected;
    private java.util.List<com.sliie.components.components.dropdown.model.DropDownModel> list;
    
    @kotlin.jvm.JvmOverloads()
    public DropDownComponent(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public DropDownComponent(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public DropDownComponent(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getText() {
        return null;
    }
    
    public final void setText(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    private final void initView() {
    }
    
    private final void initInputText() {
    }
    
    private final void initEditText() {
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.sliie.components.components.dropdown.model.DropDownModel> list) {
    }
    
    public final void select(@org.jetbrains.annotations.Nullable()
    java.lang.String id) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.sliie.components.components.dropdown.model.DropDownModel getItemSelect() {
        return null;
    }
    
    public final void setError(@org.jetbrains.annotations.Nullable()
    java.lang.String error) {
    }
    
    public final boolean isEmpty() {
        return false;
    }
}