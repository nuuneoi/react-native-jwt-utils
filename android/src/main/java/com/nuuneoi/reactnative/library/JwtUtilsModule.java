
package com.nuuneoi.reactnative.library;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class JwtUtilsModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public JwtUtilsModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "JwtUtils";
  }
}