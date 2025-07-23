package com.yourapp;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import android.util.Log;

public class PushNotificationModule extends ReactContextBaseJavaModule {
  public PushNotificationModule(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @Override
  public String getName() {
    return "PushNotificationModule";
  }

  @ReactMethod
  public void showLog(String message) {
    Log.d("PushNotificationModule", message);
  }
}
