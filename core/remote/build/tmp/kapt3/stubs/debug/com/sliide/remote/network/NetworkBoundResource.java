package com.sliide.remote.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0007J\u0013\u0010\t\u001a\u0004\u0018\u00018\u0000H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/sliide/remote/network/NetworkBoundResource;", "T", "", "schedulerProvider", "Lcom/sliide/remote/scheduler/SchedulerProvider;", "(Lcom/sliide/remote/scheduler/SchedulerProvider;)V", "asFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/sliide/remote/utils/Resource;", "remoteFetch", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "remote_debug"})
public abstract class NetworkBoundResource<T extends java.lang.Object> {
    private final com.sliide.remote.scheduler.SchedulerProvider schedulerProvider = null;
    
    public NetworkBoundResource(@org.jetbrains.annotations.NotNull()
    com.sliide.remote.scheduler.SchedulerProvider schedulerProvider) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.sliide.remote.utils.Resource<T>> asFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object remoteFetch(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super T> continuation);
}