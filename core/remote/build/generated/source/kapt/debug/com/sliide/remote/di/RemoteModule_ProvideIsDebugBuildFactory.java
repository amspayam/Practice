// Generated by Dagger (https://dagger.dev).
package com.sliide.remote.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RemoteModule_ProvideIsDebugBuildFactory implements Factory<Boolean> {
  @Override
  public Boolean get() {
    return provideIsDebugBuild();
  }

  public static RemoteModule_ProvideIsDebugBuildFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static boolean provideIsDebugBuild() {
    return RemoteModule.INSTANCE.provideIsDebugBuild();
  }

  private static final class InstanceHolder {
    private static final RemoteModule_ProvideIsDebugBuildFactory INSTANCE = new RemoteModule_ProvideIsDebugBuildFactory();
  }
}
