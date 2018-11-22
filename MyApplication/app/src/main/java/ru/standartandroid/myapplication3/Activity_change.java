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
import android.widget.TextView;
import android.widget.Toast;

import ru.standartandroid.myapplication3.data.ListContract;
import ru.standartandroid.myapplication3.data.ListDbHelper;


public class Activity_change extends AppCompatActivity implements View.OnClickListener {

    private Button btn_no, btn_ok_change, btn_delete;
    private EditText edit_year, edit_info;
    private TextView number_area, number_flat;
    private Spinner spinner;
    String currentFlat, currentMonth, currentYear, currentDesc, text_number, selectedSpinner;
    ListDbHelper listDbHelper; //Переменная класса, где создается таблицы базы данных


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toolbar_change);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getIntentInfo();
        initialize();
        setListener();
        setDataInView();

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Участок № " + text_number);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_ok_change:
                if (edit_year.getEditableText().toString().length() == 0 ||
                        edit_info.getEditableText().toString().length() == 0) {
                    showToast("Ошибка заполнения");
                    break;
                } else
                    changeRecord();
                finish();
                break;
            case R.id.btn_no:
                finish();
                break;
            case R.id.btn_delete:
                deleteRecord();
                finish();
                break;
        }

    }

    private void changeRecord() {
        //чтение полей

        SQLiteDatabase db = listDbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        try {
            values.put(ListContract.GuestEntry._ID_INFO, text_number);
            values.put(ListContract.GuestEntry.COLUMN_AREA, text_number);
            values.put(ListContract.GuestEntry.COLUMN_FLAT, currentFlat);
            values.put(ListContract.GuestEntry.COLUMN_MONTH, this.changeSpinner());
            values.put(ListContract.GuestEntry.COLUMN_YEAR, edit_year.getText().toString().trim());
            values.put(ListContract.GuestEntry.COLUMN_DESCRIPTION, edit_info.getText().toString().trim());
            long newRowId = db.update(ListContract.GuestEntry.TABLE_NAME, values,
                    ListContract.GuestEntry.COLUMN_FLAT + "=? and " +
                            ListContract.GuestEntry.COLUMN_AREA + "=? "
                    , new String[]{currentFlat, text_number});
            if (newRowId == -1) {
                showToast("Не удалось");
            }
        } finally {
            db.close();
        }

    }


    private void deleteRecord() {
        SQLiteDatabase db = listDbHelper.getWritableDatabase();
        try {
            long newRowId = db.delete(ListContract.GuestEntry.TABLE_NAME,
                    ListContract.GuestEntry.COLUMN_FLAT + "=? and " +
                            ListContract.GuestEntry.COLUMN_AREA + "=? "
                    , new String[]{currentFlat, text_number});
            if (newRowId == -1) {
                showToast("Не удалось");
            } else {
                showToast("Запись удалена");
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

    private void setSpinner() {
        switch (currentMonth) {
            case "01":
                spinner.setSelection(0);
                break;
            case "02":
                spinner.setSelection(1);
                break;
            case "03":
                spinner.setSelection(2);
                break;
            case "04":
                spinner.setSelection(3);
                break;
            case "05":
                spinner.setSelection(4);
                break;
            case "06":
                spinner.setSelection(5);
                break;
            case "07":
                spinner.setSelection(6);
                break;
            case "08":
                spinner.setSelection(7);
                break;
            case "09":
                spinner.setSelection(8);
                break;
            case "10":
                spinner.setSelection(9);
                break;
            case "11":
                spinner.setSelection(10);
                break;
            case "12":
                spinner.setSelection(11);
                break;
        }

    }

    private String changeSpinner() {
        selectedSpinner = spinner.getSelectedItem().toString();
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

    private void initialize() {
        btn_no = (Button) findViewById(R.id.btn_no);
        btn_ok_change = (Button) findViewById(R.id.btn_ok_change);
        btn_delete = (Button) findViewById(R.id.btn_delete);
        number_flat = (TextView) findViewById(R.id.number_flat);


        edit_info = (EditText) findViewById(R.id.edit_info);
        edit_year = (EditText) findViewById(R.id.edit_year);
        spinner = (Spinner) findViewById(R.id.spinner);
        listDbHelper = MyApplication.getInstance().getListDbHelper(); //Экземпляр класса для создания таблиц бд
    }

    private void getIntentInfo() {
        currentFlat = getIntent().getStringExtra("currentFlat");
        currentMonth = getIntent().getStringExtra("currentMonth");
        currentYear = getIntent().getStringExtra("currentYear");
        currentDesc = getIntent().getStringExtra("currentDesc");
        text_number = getIntent().getStringExtra("text_number");
    }

    private void setListener() {
        btn_no.setOnClickListener(this);
        btn_ok_change.setOnClickListener(this);
        btn_delete.setOnClickListener(this);
    }

    private void setDataInView() {
        number_flat.setText(currentFlat);
        edit_info.setText(currentDesc);
        edit_year.setText(currentYear);
        setSpinner();
    }
}
