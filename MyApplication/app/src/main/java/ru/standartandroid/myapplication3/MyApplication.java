package ru.standartandroid.myapplication3;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

import ru.standartandroid.myapplication3.data.ListDbHelper;

/**
 * Created by Стас on 22.12.2016.
 */
public class MyApplication extends Application{
    private static MyApplication singleton;
private ListDbHelper listDbHelper = new ListDbHelper(this);

    @Override
    public final void onCreate() {
        super.onCreate();
        singleton = this;
    }
    public static MyApplication getInstance() {
        return singleton;
    }


    public ListDbHelper getListDbHelper (){
        return listDbHelper;
    }


}
