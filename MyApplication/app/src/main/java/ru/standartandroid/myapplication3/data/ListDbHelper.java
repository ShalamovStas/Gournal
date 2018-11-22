package ru.standartandroid.myapplication3.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Environment;
import android.util.Log;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

import ru.standartandroid.myapplication3.Activity_create;
import ru.standartandroid.myapplication3.data.ListContract.GuestEntry;

/**
 * Created by Стас on 23.11.2016.
 */
public class ListDbHelper extends SQLiteOpenHelper {

    public static final String LOG_TAG = ListDbHelper.class.getSimpleName();
    private static final String DATABASE_NAME = "list.db";
    private static final int DATABASE_VERSION = 1;

    @Override
    public void onCreate(SQLiteDatabase db) {
// Строка для создания таблицы-------------------------------------------------------------------
        String SQL_CREATE_GUESTS_TABLE = "CREATE TABLE " + GuestEntry.TABLE_NAME_ID + " ("
                + ListContract.GuestEntry._ID + " INTEGER PRIMARY KEY, "
                + GuestEntry.COLUMN_ADRESS + " TEXT, "
                + GuestEntry.COLUMN_BUILD + " TEXT );";
// Строка для создания таблицы-------------------------------------------------------------------
        Log.d(" ListDbHelper ", "---создание таблиц в бд---");
        String SQL_CREATE_INFO_TABLE = "CREATE TABLE " + GuestEntry.TABLE_NAME + " ("
                + ListContract.GuestEntry._ID_INFO + " INTEGER , "
                + GuestEntry.COLUMN_AREA + " INTEGER, "
                + GuestEntry.COLUMN_FLAT + " TEXT , "
                + GuestEntry.COLUMN_MONTH + " TEXT, "
                + GuestEntry.COLUMN_YEAR + " TEXT, "
                + GuestEntry.COLUMN_DESCRIPTION + " TEXT, "
                + "FOREIGN KEY(" + GuestEntry.COLUMN_AREA + ") REFERENCES "
                + GuestEntry.TABLE_NAME_ID + "(" + ListContract.GuestEntry._ID + ")" +
                ", UNIQUE  (" + GuestEntry.COLUMN_AREA + ", " + GuestEntry.COLUMN_FLAT + "));";

        db.execSQL(SQL_CREATE_GUESTS_TABLE);
        db.execSQL(SQL_CREATE_INFO_TABLE);
        insertInTable(db);



    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public ListDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

    }

    private void insertInTable(SQLiteDatabase db) {
       // SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(GuestEntry._ID, "1");
        values.put(GuestEntry.COLUMN_ADRESS, "Даза данных не найдена!");
        values.put(GuestEntry.COLUMN_BUILD, "Импортируйте базу данных!");
        db.insert(GuestEntry.TABLE_NAME_ID, null, values);
        values.clear();
        values.put(ListContract.GuestEntry._ID_INFO, "1");
        values.put(ListContract.GuestEntry.COLUMN_AREA, "1");
        values.put(ListContract.GuestEntry.COLUMN_FLAT, "*");
        values.put(ListContract.GuestEntry.COLUMN_MONTH, "*");
        values.put(ListContract.GuestEntry.COLUMN_YEAR, "*");
        values.put(ListContract.GuestEntry.COLUMN_DESCRIPTION, "*");
        db.insert(GuestEntry.TABLE_NAME, null, values);
    }


}
