package com.sliide.remote.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/sliide/remote/utils/NetworkCodes;", "", "()V", "CONNECTION_ERROR", "", "GENERIC_ERROR", "GENERIC_ERROR_MESSAGE", "", "TIMEOUT_ERROR", "remote_debug"})
public final class NetworkCodes {
    @org.jetbrains.annotations.NotNull()
    public static final com.sliide.remote.utils.NetworkCodes INSTANCE = null;
    public static final int CONNECTION_ERROR = 400;
    public static final int TIMEOUT_ERROR = 408;
    public static final int GENERIC_ERROR = 999;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GENERIC_ERROR_MESSAGE = "We are facing an unknown error";
    
    private NetworkCodes() {
        super();
    }
}