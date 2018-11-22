package ru.standartandroid.myapplication3;

import android.app.ActionBar;
import android.content.ContentValues;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Layout;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.Scroller;
import android.widget.TextView;
import android.widget.EditText;

import android.widget.Toast;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

import java.util.ArrayList;
import java.util.List;


import ru.standartandroid.myapplication3.data.ListContract;
import ru.standartandroid.myapplication3.data.ListDbHelper;
import ru.standartandroid.myapplication3.data.ListContract.GuestEntry;


public class Activity_find extends AppCompatActivity implements View.OnClickListener {

    final String TAG = "life";


    private LinearLayout layout1, custom, customInner;
    private ScrollView scroll;
    private TextView textVievNumber, text_address, text_build, text_scroll;
    private View line;
    private int idLine = 5;
    private String intent_id;
    private FloatingActionButton fab;
    private Animation btn, textDrive;

    private int counter = 0;
    private ListDbHelper mDbHelper;
    private List<Integer> listItem;

    private String[] table_1;

    private String[] table_2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toolbar2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        initialize();

        actionBar.setTitle("Участок № " + intent_id);
        fab = (FloatingActionButton) findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Activity_create.class);
                intent.putExtra("_id", intent_id);
                startActivity(intent);
            }
        });

        showDB();
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.scroll:
                showToast("TAP");
                break;
            default:
                for (int i = 0; i < listItem.size(); i++) {
                    if (i == view.getId()) {
                        //Do something
                        Toast.makeText(getApplicationContext(), listItem.get(i).toString(), Toast.LENGTH_SHORT).show();
                    }
                }
                break;
        }
    }

    private void showDB() {
        SQLiteDatabase db = mDbHelper.getReadableDatabase();
        Cursor cursorTable1 = db.query(
                GuestEntry.TABLE_NAME_ID,   // таблица
                table_1,            // столбцы
                GuestEntry._ID + "= ?",                  // столбцы для условия WHERE
                new String[]{intent_id},                  // значения для условия WHERE
                null,                  // Don't group the rows
                null,                  // Don't filter by row groups
                null);

        Cursor cursorTable2 = db.query(
                GuestEntry.TABLE_NAME,   // таблица
                table_2,            // столбцы
                GuestEntry._ID_INFO + "= ?",   // столбцы для условия WHERE
                new String[]{intent_id},                  // значения для условия WHERE
                null,                  // Don't group the rows
                null,                  // Don't filter by row groups
                null);

        if (cursorTable2.getCount() == 0) {
            showToast("Нет записей");
            fab.show();
        }
        try {
            // Узнаем индекс каждого столбца
            int idCoiumnID = cursorTable1.getColumnIndex(GuestEntry._ID);
            int addressColumnIndex = cursorTable1.getColumnIndex(GuestEntry.COLUMN_ADRESS);
            int buildColumnIndex = cursorTable1.getColumnIndex(GuestEntry.COLUMN_BUILD);

            int idColumnIndex2 = cursorTable2.getColumnIndex(GuestEntry._ID_INFO);
            int areaColumnIndex = cursorTable2.getColumnIndex(GuestEntry.COLUMN_AREA);

            int flatColumnIndex = cursorTable2.getColumnIndex(GuestEntry.COLUMN_FLAT);
            int monthColumnIndex = cursorTable2.getColumnIndex(GuestEntry.COLUMN_MONTH);
            int yearColumnIndex = cursorTable2.getColumnIndex(GuestEntry.COLUMN_YEAR);
            int descColumnIndex = cursorTable2.getColumnIndex(GuestEntry.COLUMN_DESCRIPTION);

            while (cursorTable1.moveToNext()) {
                int currentID1 = cursorTable1.getInt(idCoiumnID);
                String currentAddress = cursorTable1.getString(addressColumnIndex);
                String currentBuild = cursorTable1.getString(buildColumnIndex);

                text_address.setText(currentAddress);
                text_build.setText(currentBuild);
            }
            // Проходим через все ряды
            while (cursorTable2.moveToNext()) {
                // Используем индекс для получения строки или числа
                int currentID = cursorTable2.getInt(idColumnIndex2);
                String currentArea = cursorTable2.getString(areaColumnIndex);
                String currentFlat = cursorTable2.getString(flatColumnIndex);
                final String currentMonth = cursorTable2.getString(monthColumnIndex);
                final String currentYear = cursorTable2.getString(yearColumnIndex);
                String currentDesc = cursorTable2.getString(descColumnIndex);
//
                final View view = getLayoutInflater().inflate(R.layout.custom, null);
                final ImageView deleteField = (ImageView) view.findViewById(R.id.imageView);
                customInner = (LinearLayout) findViewById(R.id.custom1);
                final TextView column1 = (TextView) view.findViewById(R.id.column1);
                final TextView column2 = (TextView) view.findViewById(R.id.column2);
                final TextView column3 = (TextView) view.findViewById(R.id.column3);
                deleteField.setId(counter);
                column1.setText(currentFlat);
                column2.setText(currentMonth + "." + currentYear);
                column3.setText(currentDesc);
                listItem.add(counter);




                counter ++;
                deleteField.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent2 = new Intent(v.getContext(), Activity_change.class);
                        intent2.putExtra("currentFlat", column1.getText());
                        intent2.putExtra("currentMonth", currentMonth);
                        intent2.putExtra("currentYear", currentYear);
                        intent2.putExtra("currentDesc", column3.getText());
                        intent2.putExtra("text_number", intent_id);
                        startActivity(intent2);
                    }
                });
                textDrive = AnimationUtils.loadAnimation(this, R.anim.anim_text);

                layout1.addView(view);
                textDrive.setStartOffset(20 + counter*400);
                view.startAnimation(textDrive);

            }
        } finally {
            cursorTable1.close();
            cursorTable2.close();
            db.close();
        }
    }


    private void showToast(String Message) {
        Toast toast = Toast.makeText(getApplicationContext(), Message, Toast.LENGTH_SHORT);
        toast.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        //getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        layout1.removeAllViews();
        counter = 0;
        showDB();
    }

    private void initialize(){
        table_1 = new String[]{
                ListContract.GuestEntry._ID,
                ListContract.GuestEntry.COLUMN_BUILD,
                ListContract.GuestEntry.COLUMN_ADRESS
        };
        table_2 = new String[]{
                ListContract.GuestEntry._ID_INFO,
                ListContract.GuestEntry.COLUMN_AREA,
                ListContract.GuestEntry.COLUMN_FLAT,
                ListContract.GuestEntry.COLUMN_MONTH,
                ListContract.GuestEntry.COLUMN_YEAR,
                ListContract.GuestEntry.COLUMN_DESCRIPTION,
        };
        listItem = new ArrayList<>();
        intent_id = getIntent().getStringExtra("_id");
        layout1 = (LinearLayout) findViewById(R.id.layout1);
        scroll = (ScrollView) findViewById(R.id.scroll);

        custom = (LinearLayout) findViewById(R.id.customInsert);


        text_address = (TextView) findViewById(R.id.text_address);
        text_build = (TextView) findViewById(R.id.text_build);
        mDbHelper = new ListDbHelper(this);
        btn = AnimationUtils.loadAnimation(this, R.anim.anim_btn_import);
        //textDrive = AnimationUtils.loadAnimation(this, R.anim.anim_text);
    }




    }