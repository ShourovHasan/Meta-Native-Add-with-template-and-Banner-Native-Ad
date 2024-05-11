package com.esbd.a2102;

import android.app.Application;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AudienceNetworkAds;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AudienceNetworkAds.initialize(this);
        AdSettings.addTestDevice("63cbe9bd-cb04-44b6-9b2a-2d8b18a0766a");    }
}
