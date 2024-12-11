package com.onecat.godotfirebaseanalytics;

import android.app.Activity;
import android.view.View;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.firebase.analytics.FirebaseAnalytics;

import org.godotengine.godot.Dictionary;
import org.godotengine.godot.Godot;
import org.godotengine.godot.plugin.GodotPlugin;
import org.godotengine.godot.plugin.UsedByGodot;

@SuppressWarnings({"unused"})
public class GodotFirebaseAnalytics extends GodotPlugin {
    private FirebaseAnalytics mFirebaseAnalytics;

    public GodotFirebaseAnalytics(Godot godot) {
        super(godot);
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(getActivity());
    }

    @Nullable
    @Override
    public View onMainCreate(Activity activity) {
        return null;
    }

    @NonNull
    @Override
    public String getPluginName() {
        return "GodotFirebaseAnalytics";
    }

    @UsedByGodot
    public void logEvent(String event, Dictionary params) {
        if (params.isEmpty()){
            mFirebaseAnalytics.logEvent(event, null);
        }
        else {
            Bundle bundle = new Bundle();
            for (String key: params.get_keys()) {
                bundle.putString(key, params.get(key).toString());
            }
            mFirebaseAnalytics.logEvent(event, bundle);
        }
    }

    @UsedByGodot
    public void setUserId(String uid) {
        mFirebaseAnalytics.setUserId(uid);
    }

    public void setUserProperty(String name, String value) {
        mFirebaseAnalytics.setUserProperty(name, value);
    }

}
