package com.sliie.components.components.edittext;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 >2\u00020\u00012\u00020\u0002:\u0001>B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u000e\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0002J\u0012\u0010$\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J*\u0010\'\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020\bH\u0016J\b\u0010,\u001a\u00020\"H\u0002J\b\u0010-\u001a\u00020\"H\u0002J\b\u0010.\u001a\u00020\"H\u0002J\b\u0010/\u001a\u00020\"H\u0002J\u0006\u00100\u001a\u00020\u000fJ*\u00101\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020\b2\u0006\u00102\u001a\u00020\b2\u0006\u0010*\u001a\u00020\bH\u0016J\u000e\u00103\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0002J\u0016\u00104\u001a\u00020\u00112\u0006\u00105\u001a\u00020\u00112\u0006\u00106\u001a\u00020\u0011J\u0010\u00107\u001a\u00020\"2\u0006\u00108\u001a\u00020\u000fH\u0016J\u0010\u00109\u001a\u00020\"2\b\u0010:\u001a\u0004\u0018\u00010\u0011J\u000e\u0010;\u001a\u00020\"2\u0006\u0010<\u001a\u00020=R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\b@BX\u0082\u000e\u00a2\u0006\b\n\u0000\"\u0004\b\u0016\u0010\u0017R(\u0010\u0018\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR*\u0010\u001d\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00118F@FX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u000e\u0010 \u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006?"}, d2 = {"Lcom/sliie/components/components/edittext/EditTextComponent;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/text/TextWatcher;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lcom/sliide/components/databinding/ComponentEditTextBinding;", "drawableStart", "Ljava/lang/Integer;", "enabled", "", "hint", "", "imeOptions", "inputType", "value", "maxLength", "setMaxLength", "(I)V", "tag", "getTag", "()Ljava/lang/String;", "setTag", "(Ljava/lang/String;)V", "text", "getText", "setText", "type", "addTextChangedListener", "", "watcher", "afterTextChanged", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "count", "after", "initEditText", "initInputText", "initKind", "initView", "isEmpty", "onTextChanged", "before", "removeTextChangedListener", "replace", "oldValue", "newValue", "setEnabled", "isEnabled", "setError", "error", "setOnEditorActionListener", "editTextListener", "Landroid/widget/TextView$OnEditorActionListener;", "Companion", "components_debug"})
public final class EditTextComponent extends androidx.constraintlayout.widget.ConstraintLayout implements android.text.TextWatcher {
    @org.jetbrains.annotations.NotNull()
    public static final com.sliie.components.components.edittext.EditTextComponent.Companion Companion = null;
    public static final int DEFAULT = -1;
    public static final int PASSWORD = 1;
    public static final int SEARCH = 2;
    public static final int COPY = 3;
    private com.sliide.components.databinding.ComponentEditTextBinding binding;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String text = "";
    @org.jetbrains.annotations.Nullable()
    private java.lang.String tag = "";
    private int maxLength = 100;
    private java.lang.String hint = "";
    private boolean enabled = true;
    private int imeOptions = android.view.inputmethod.EditorInfo.IME_ACTION_NEXT;
    private int inputType = android.text.InputType.TYPE_CLASS_TEXT;
    private int type = -1;
    private java.lang.Integer drawableStart;
    
    @kotlin.jvm.JvmOverloads()
    public EditTextComponent(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public EditTextComponent(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public EditTextComponent(@org.jetbrains.annotations.NotNull()
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
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTag() {
        return null;
    }
    
    public final void setTag(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    private final void setMaxLength(int value) {
    }
    
    private final void initView() {
    }
    
    private final void initKind() {
    }
    
    private final void initInputText() {
    }
    
    private final void initEditText() {
    }
    
    @java.lang.Override()
    public void beforeTextChanged(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence s, int start, int count, int after) {
    }
    
    @java.lang.Override()
    public void onTextChanged(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence s, int start, int before, int count) {
    }
    
    @java.lang.Override()
    public void afterTextChanged(@org.jetbrains.annotations.Nullable()
    android.text.Editable s) {
    }
    
    public final void setError(@org.jetbrains.annotations.Nullable()
    java.lang.String error) {
    }
    
    @java.lang.Override()
    public void setEnabled(boolean isEnabled) {
    }
    
    public final boolean isEmpty() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String replace(@org.jetbrains.annotations.NotNull()
    java.lang.String oldValue, @org.jetbrains.annotations.NotNull()
    java.lang.String newValue) {
        return null;
    }
    
    public final void setOnEditorActionListener(@org.jetbrains.annotations.NotNull()
    android.widget.TextView.OnEditorActionListener editTextListener) {
    }
    
    public final void addTextChangedListener(@org.jetbrains.annotations.NotNull()
    android.text.TextWatcher watcher) {
    }
    
    public final void removeTextChangedListener(@org.jetbrains.annotations.NotNull()
    android.text.TextWatcher watcher) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/sliie/components/components/edittext/EditTextComponent$Companion;", "", "()V", "COPY", "", "DEFAULT", "PASSWORD", "SEARCH", "components_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}