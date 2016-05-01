package com.example.shubham.demo;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.PushService;

public class DemoApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(this, "nzxf3oE7kOIHYd1S2gdSTStSTMWHFm5XF6tBLaOc", "I1NoqIDYSeB75BmzvtQkUFUdW82jvuegkxcPamnp");
        ParseInstallation.getCurrentInstallation().saveInBackground();
        PushService.setDefaultPushCallback(this, NewActivity.class);
    }
}
    