package com.onecat.godotfirebaseanalytics;

import android.app.Activity;
import android.view.View;
import android.os.Bundle;

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
    }

    private FirebaseAnalytics getFAInstance() {
        if (mFirebaseAnalytics == null) {
            mFirebaseAnalytics = FirebaseAnalytics.getInstance(getActivity());
        }
        return mFirebaseAnalytics;
    }

    @Override
    public View onMainCreate(Activity activity) {
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(activity);
        return null;
    }

    @Override
    public String getPluginName() {
        return "GodotFirebaseAnalytics";
    }

    @UsedByGodot
    public void logEvent(String event, Dictionary params) {
        if (params.isEmpty()){
            getFAInstance().logEvent(event, null);
        }
        else {
            Bundle bundle = new Bundle();
            for (String key: params.get_keys()) {
                bundle.putString(key, params.get(key).toString());
            }
            getFAInstance().logEvent(event, bundle);
        }
    }

    @UsedByGodot
    public void setUserId(String uid) {
        getFAInstance().setUserId(uid);
    }

    @UsedByGodot
    public void setUserProperty(String name, String value) {
        getFAInstance().setUserProperty(name, value);
    }

}
