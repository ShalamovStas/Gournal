package ru.standartandroid.myapplication3;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import ru.standartandroid.myapplication3.data.ListContract;
import ru.standartandroid.myapplication3.data.ListDbHelper;


public class Activity_create extends AppCompatActivity implements View.OnClickListener {

    final String TAG = "life";

    private Button btn_no, btn_ok;
    private EditText editTextFlat, editTextYear, editTextDescription;
    private Spinner spinner;
    private String intent_id;

    private ListDbHelper listDbHelper; //Переменная класса, где создается таблицы базы данных


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toolbar_create);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        intent_id = getIntent().getStringExtra("_id");

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Участок № " + intent_id);

        spinner = (Spinner) findViewById(R.id.spinner);

        editTextFlat = (EditText) findViewById(R.id.editTextFlat);
        editTextYear = (EditText) findViewById(R.id.editTextYear);
        editTextDescription = (EditText) findViewById(R.id.editTextDescription);

        btn_no = (Button) findViewById(R.id.btn_no);
        btn_ok = (Button) findViewById(R.id.btn_ok);
        btn_ok.setOnClickListener(this);
        btn_no.setOnClickListener(this);
        listDbHelper = MyApplication.getInstance().getListDbHelper();
        }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_ok:
                if (editTextYear.getEditableText().toString().length() == 0 ||
                        editTextFlat.getEditableText().toString().length() == 0 ||
                        editTextDescription.getEditableText().toString().length() == 0) {
                        showToast("Ошибка заполнения");
                     break;
                    } else
                    insertData();
                break;
            case R.id.btn_no:
                showToast("Запись не сохранена!");
                finish();
                break;
        }
    }

    private void insertData() {

        // создание объекта SQLiteDatabase для управления базой данных
        //! Этот метод вернет либо только что созданную базу данных или иже существующую
        //Если бд не е, вспомогательный класс listDbHelper создаст ее с пом onCreate
         SQLiteDatabase db = listDbHelper.getWritableDatabase();

        try {
            String FK_ON = "PRAGMA foreign_keys=ON;";
            db.execSQL(FK_ON);
            //ContentValues Используется для добавления новых строк в таблицу
            //Объект класса представляет собой одну строку таблицы и выглядит как массив с именами
            //столбцов и значениями которые им соответствуют
            ContentValues values = new ContentValues();
            values.put(ListContract.GuestEntry._ID_INFO, intent_id);
            values.put(ListContract.GuestEntry.COLUMN_AREA, intent_id);
            values.put(ListContract.GuestEntry.COLUMN_FLAT, editTextFlat.getText().toString().trim());
            values.put(ListContract.GuestEntry.COLUMN_MONTH, this.getSpinnerSelect());
            values.put(ListContract.GuestEntry.COLUMN_YEAR, editTextYear.getText().toString().trim());
            values.put(ListContract.GuestEntry.COLUMN_DESCRIPTION, editTextDescription.getText().toString().trim());
            long newRowId = db.insert(ListContract.GuestEntry.TABLE_NAME, null, values);

            if (newRowId == -1) {
                showToast("Запись уже существует");
            } else {
                finish();
            }
        } finally {
            db.close();
        }
    }

    private void showToast(String Message) {

        Toast toast = Toast.makeText(getApplicationContext(), Message, Toast.LENGTH_SHORT);
        toast.show();
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

    private String getSpinnerSelect() {
        String selectedSpinner = spinner.getSelectedItem().toString();
        String month = "";
        switch (selectedSpinner) {
            case "Январь":
                month = "01";
                break;
            case "Февраль":
                month = "02";
                break;
            case "Март":
                month = "03";
                break;
            case "Апрель":
                month = "04";
                break;
            case "Май":
                month = "05";
                break;
            case "Июнь":
                month = "06";
                break;
            case "Июль":
                month = "07";
                break;
            case "Август":
                month = "08";
                break;
            case "Сентябрь":
                month = "09";
                break;
            case "Октябрь":
                month = "10";
                break;
            case "Ноябрь":
                month = "11";
                break;
            case "Декабрь":
                month = "12";
                break;
            default:
                month = "??";
                break;
        }
        return month;
    }
}