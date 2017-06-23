package jp.techacademy.chiku.takahiro.taskapp;

import android.app.Application;

import io.realm.Realm;

/**
 * Created by takahiro chiku on 2017/06/24.
 */

public class TaskApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}
