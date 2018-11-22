package ru.standartandroid.myapplication3;

import android.content.Context;
import android.content.ContextWrapper;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.Matrix;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import ru.standartandroid.myapplication3.data.ListContract;
import ru.standartandroid.myapplication3.data.ListDbHelper;
import ru.standartandroid.myapplication3.data.ListContract.GuestEntry;

public class Activity_Create_file extends ActionBarActivity implements View.OnClickListener {

    private ImageButton importDB, exportDB, export_txt;
    private TextView text_info_import;

    private static final String STATE_ACTIVITY = "activity";


    private String[] table_2;
    private ListDbHelper mDbHelper;
    private Animation btn, textDrive;
    private static String DB_PATH;
    private static String DB_NAME;
    public String pathImport;
    public String pathExport;


    final String TAG = "life";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toolbar_file);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        initialize();
        createFolder();

        mDbHelper = MyApplication.getInstance().getListDbHelper();

        if (savedInstanceState != null) {
            text_info_import.setText(savedInstanceState.getString(STATE_ACTIVITY));
        } else {
            text_info_import.setText("");
        }
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


    private void showToast(String Message) {

        Toast toast = Toast.makeText(getApplicationContext(), Message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public static void Save(File file, String[] data) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            try {
                for (int i = 0; i < data.length; i++) {
                    fos.write(data[i].getBytes());
                    if (i < data.length - 1) {
                        fos.write("\n".getBytes());
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.importDB:
                try {
                    importDataBase();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case R.id.exportDB:

                exportDB.setBackgroundResource(R.drawable.ok);
                exportDB.startAnimation(btn);
                text_info_import.setText("База данных сохранена");
                text_info_import.setTextColor(Color.BLACK);
                text_info_import.startAnimation(textDrive);
                try {
                    exportDataBase();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case R.id.export_txt:


                File file = new File(pathExport + "/Журнал.txt");
                text_info_import.setText("Записи базы данных сохранены\n");
                showDB();
                String[] saveText = String.valueOf(text_info_import.getText()).split(System.getProperty("line.separator"));
                Save(file, saveText);

//                text_info_import.startAnimation(textDrive);
                export_txt.setBackgroundResource(R.drawable.ok);
                export_txt.startAnimation(btn);

                break;

        }
    }

    public class ViewAnimation extends Animation {

        int centerX, centerY;

        @Override
        public void initialize(int width, int height, int parentWidth,
                               int parentHeight) {
            super.initialize(width, height, parentWidth, parentHeight);
            setDuration(100);
            setFillAfter(true);

            setInterpolator(new LinearInterpolator());
            centerX = width;
            centerY = height;
        }

        @Override
        protected void applyTransformation(float interpolatedTime,
                                           Transformation transformation) {
            final Matrix matrix = transformation.getMatrix();
            matrix.setScale(interpolatedTime, interpolatedTime);
        }
    }

    private void showDB() {
        SQLiteDatabase db = mDbHelper.getWritableDatabase();

        Cursor cursorTable2 = db.query(
                ListContract.GuestEntry.TABLE_NAME,   // таблица
                table_2,            // столбцы
                null,   // столбцы для условия WHERE
                null,                  // значения для условия WHERE
                null,                  // Don't group the rows
                null,                  // Don't filter by row groups
                GuestEntry._ID_INFO);

        if (cursorTable2.getCount() == 0) {
            showToast("Нет записей");
        }
        try {
            // Узнаем индекс каждого столбца
            int idColumnIndex2 = cursorTable2.getColumnIndex(ListContract.GuestEntry._ID_INFO);
            int areaColumnIndex = cursorTable2.getColumnIndex(ListContract.GuestEntry.COLUMN_AREA);

            int flatColumnIndex = cursorTable2.getColumnIndex(ListContract.GuestEntry.COLUMN_FLAT);
            int monthColumnIndex = cursorTable2.getColumnIndex(ListContract.GuestEntry.COLUMN_MONTH);
            int yearColumnIndex = cursorTable2.getColumnIndex(ListContract.GuestEntry.COLUMN_YEAR);
            int descColumnIndex = cursorTable2.getColumnIndex(ListContract.GuestEntry.COLUMN_DESCRIPTION);
            // Проходим через все ряды
            while (cursorTable2.moveToNext()) {
                // Используем индекс для получения строки или числа
                int currentID = cursorTable2.getInt(idColumnIndex2);
                String currentArea = cursorTable2.getString(areaColumnIndex);
                String currentFlat = cursorTable2.getString(flatColumnIndex);
                String currentMonth = cursorTable2.getString(monthColumnIndex);
                String currentYear = cursorTable2.getString(yearColumnIndex);
                String currentDesc = cursorTable2.getString(descColumnIndex);
                text_info_import.append(
                        "" + Integer.toString(currentID) +
                                " " + currentFlat +
                                " " + currentMonth + " " +
                                currentYear +
                                " " + currentDesc + "\n");

            }
        } finally {

            cursorTable2.close();
            db.close();
        }
    }


    public void exportDataBase() throws IOException {

        File db = new File(pathExport, DB_NAME);
        db.createNewFile();
        try {
            copyFromZipFile();

        } catch (IOException e) {
            throw new Error("Error copying database " + e);
        }


    }

    private void copyFromZipFile() throws IOException {

        File database = getApplicationContext().getDatabasePath(DB_NAME);
        FileInputStream is;
        is = new FileInputStream(database);
        File outFile = new File(pathExport, DB_NAME);
        ContextWrapper cw = new ContextWrapper(getApplicationContext());
        DB_PATH = cw.getFilesDir().getAbsolutePath() + "/databases/";

        FileOutputStream myOutput = new FileOutputStream(outFile);
        int length;
        byte[] buffer = new byte[1024];

        try {
            while ((length = is.read(buffer)) > 0) {
                myOutput.write(buffer, 0, length);
            }

        } finally {

            myOutput.flush();
            myOutput.close();

            is.close();
        }
    }


    public void importDataBase() throws IOException {


        //проверяем есть ли уже файл БД на карте
        File db = new File(pathImport, DB_NAME);

        if (db.exists()) {
            //если файла нет, то попытаемся его создать
            db.createNewFile();
            text_info_import.setText("База данных импортирована");
            text_info_import.startAnimation(textDrive);
            importDB.setBackgroundResource(R.drawable.ok);
            importDB.startAnimation(btn);

            try {
                importFromDirectory(db);

            } catch (IOException e) {
                throw new Error("Error copying database", e);
            }
        } else {
            text_info_import.setText("Ошибка!\nФайл базы данных в папке " +
                    "Journal_Import не найден!");

            text_info_import.startAnimation(textDrive);
        }
    }

    private void importFromDirectory(File db) throws IOException {

        File database = getApplicationContext().getDatabasePath(DB_NAME);

        FileOutputStream is;
        is = new FileOutputStream(database);

        // File database=getApplicationContext().getDatabasePath(path);
        //File outFileApp = new File(pathImport, DB_NAME);
        FileInputStream isApp = new FileInputStream(db);


        int length;
        byte[] buffer = new byte[1024];
        //ZipInputStream zis = new ZipInputStream(new BufferedInputStream(is));
        try {
            while ((length = isApp.read(buffer)) > 0) {
                is.write(buffer, 0, length);
            }

        } finally {

            is.flush();
            isApp.close();
            is.close();
        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        // Save the user's current game state
        savedInstanceState.putString(STATE_ACTIVITY, text_info_import.getText().toString());


        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);
    }

    private void createFolder() {
        File importFolder = new File(pathImport);
        File exportFolder = new File(pathExport);
        if (!importFolder.exists()) {
            importFolder.mkdirs();
        }
        if (!exportFolder.exists()) {
            exportFolder.mkdirs();
        }

    }

    private void initialize() {
        importDB = (ImageButton) findViewById(R.id.importDB);
        exportDB = (ImageButton) findViewById(R.id.exportDB);
        export_txt = (ImageButton) findViewById(R.id.export_txt);
        text_info_import = (TextView) findViewById(R.id.text_info_import);
        importDB.setOnClickListener(this);
        exportDB.setOnClickListener(this);
        export_txt.setOnClickListener(this);

        table_2 = new String[]{
                GuestEntry._ID_INFO,
                GuestEntry.COLUMN_AREA,
                GuestEntry.COLUMN_FLAT,
                GuestEntry.COLUMN_MONTH,
                GuestEntry.COLUMN_YEAR,
                GuestEntry.COLUMN_DESCRIPTION,
        };
        DB_PATH = "/data/data/myapplication3/databases/";
        DB_NAME = "list.db";
        pathImport = Environment.getExternalStorageDirectory().getAbsolutePath() + "/JournalImport";
        pathExport = Environment.getExternalStorageDirectory().getAbsolutePath() + "/JournalExport";
        btn = AnimationUtils.loadAnimation(this, R.anim.anim_btn_import);
        textDrive = AnimationUtils.loadAnimation(this, R.anim.anim_text);
    }

}
