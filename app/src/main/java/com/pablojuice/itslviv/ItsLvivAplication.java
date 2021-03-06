package com.pablojuice.itslviv;

import com.pablojuice.itslviv.db.*;
import android.app.Application;

public class ItsLvivAplication extends Application {

    private DataBaseHelper dataBaseHelper;

    @Override
    public void onCreate() {
        super.onCreate();
        this.dataBaseHelper = new DataBaseHelper(this);
    }

    public DataBaseHelper getDataBaseHelper() {
        return dataBaseHelper;
    }
}
