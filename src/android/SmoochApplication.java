package io.smooch.cordova;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import io.smooch.core.Settings;
import io.smooch.core.Smooch;
import io.smooch.core.SmoochCallback;

import org.json.JSONArray;
import org.json.JSONException;

public class SmoochApplication extends Application {
    private static Application mApplication;

    @Override
    public void onCreate() {
        mApplication = this;
        Log.w("SmoochCordova", "Smooch create");
        super.onCreate();;
        Smooch.init(this);

    }

    static void init(String appId){
        Log.w("SmoochCordova init", "init function" + appId);
        try {
            Smooch.init(mApplication, new Settings(appId), null);
        } catch (Exception e) {
            Log.e("SmoochCordova init","error " +e);
        }

    }
}
