// Generated by Dagger (https://dagger.dev).
package com.evgeny.goncharov.settings;

import dagger.internal.Factory;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SettingsMediatorImpl_Factory implements Factory<SettingsMediatorImpl> {
  @Override
  public SettingsMediatorImpl get() {
    return newInstance();
  }

  public static SettingsMediatorImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static SettingsMediatorImpl newInstance() {
    return new SettingsMediatorImpl();
  }

  private static final class InstanceHolder {
    private static final SettingsMediatorImpl_Factory INSTANCE = new SettingsMediatorImpl_Factory();
  }
}