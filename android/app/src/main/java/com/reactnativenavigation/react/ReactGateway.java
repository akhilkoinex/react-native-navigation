package com.reactnativenavigation.react;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

import com.facebook.react.ReactInstanceManager;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.reactnativenavigation.bridge.NavigationReactEventEmitter;

public interface ReactGateway {

    void startReactContextOnceInBackgroundAndExecuteJS();

    boolean isInitialized();

    ReactContext getReactContext();

    NavigationReactEventEmitter getReactEventEmitter();

    ReactInstanceManager getReactInstanceManager();

    void onResumeActivity(Activity activity, DefaultHardwareBackBtnHandler defaultHardwareBackBtnHandler);

    void onPauseActivity(Activity activity);

    void onDestroyApp(Activity activity);

    void onBackPressed();

    void onActivityResult(int requestCode, int resultCode, Intent data);

    boolean hasStartedCreatingContext();

    void onNewIntent(Intent intent);

    boolean onKeyUp(View currentFocus, int keyCode);
}
