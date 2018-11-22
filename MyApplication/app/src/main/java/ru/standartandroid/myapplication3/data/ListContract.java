package ru.standartandroid.myapplication3.data;

import android.provider.BaseColumns;

/**
 * Created by Стас on 23.11.2016.
 */
public final class ListContract {

    private ListContract(){

    }

    public static final class GuestEntry implements BaseColumns {
        public final static String TABLE_NAME_ID = "list_id";//первая таблица
        public final static String TABLE_NAME = "list_info";//вторая

        public final static String _ID = BaseColumns._ID;
        public final static String _ID_INFO = BaseColumns._ID;

        public final static String COLUMN_STREET = "street";
        public final static String COLUMN_BUILD = "build";
        public final static String COLUMN_AREA = "area";
        public final static String COLUMN_FLAT = "flat";
        public final static String COLUMN_DESCRIPTION = "description";
        public final static String COLUMN_MONTH = "month";
        public final static String COLUMN_YEAR = "year";
        public final static String COLUMN_ADRESS = "adress";

    }
}
