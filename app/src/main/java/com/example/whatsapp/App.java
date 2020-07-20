package com.example.whatsapp;

import android.app.Application;


import com.parse.Parse;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("tUx6ReDcOFKroumTyj4jWmEskZIC3ELoIvnSWy3Z")
                // if defined
                .clientKey("KDWL8TCQR71hcv3MxJvHd70WDxat5zHsZMvhPI1O")
                .server("http://localhost:1337/parse/")
                .build()
        );
    }
}
