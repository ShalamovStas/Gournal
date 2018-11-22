package ru.standartandroid.myapplication3;

import android.content.Intent;
//import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import ru.standartandroid.myapplication3.data.ListDbHelper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView text_View1, text_View2, text_View3, text_View4, text_View5,
            text_View6, text_View7, text_View8, text_View9, text_View10,
            text_View11, text_View12, text_View13, text_View14, text_View15,
            text_View16, text_View17, text_View18, text_View19, text_View20,
            text_View21, text_View22, text_View23, text_View24, text_View25,
            text_View26, text_View27, text_View28, text_View29, text_View30,
            text_View31, text_View32, text_View33, text_View34, text_View35,
            text_View36, text_View37, text_View38, text_View39, text_View40,
            text_View41, text_View42, text_View43, text_View44, text_View45,
            text_View46, text_View47, text_View48, text_View49, text_View50,
            text_View51, text_View52, text_View53, text_View54, text_View55,
            text_View56, text_View57, text_View58, text_View59, text_View60,
            text_View61, text_View62, text_View63, text_View64, text_View65,
            text_View66, text_View67, text_View68, text_View69, text_View70,
            text_View71, text_View72, text_View73, text_View74, text_View75,
            text_View76, text_View77, text_View78, text_View79, text_View80,
            text_View81, text_View82, text_View83, text_View84, text_View85,
            text_View86, text_View87, text_View88, text_View89, text_View90,
            text_View91, text_View92, text_View93, text_View94, text_View95,
            text_View96, text_View97, text_View98, text_View99, text_View100,
            text_View101, text_View102, text_View103,text_View104, text_View105,
            text_View106, text_View107, text_View108, text_View109, text_View110,
            text_View111, text_View112, text_View113, text_View114, text_View115,
            text_View116, text_View117, text_View118, text_View119, text_View120,
            text_View121, text_View122, text_View123, text_View124, text_View125,
            text_View126, text_View127, text_View128, text_View129, text_View130,
            text_View131, text_View132, text_View133, text_View134, text_View135,
            text_View136, text_View137, text_View138, text_View139, text_View140,
            text_View141, text_View142, text_View143, text_View144, text_View145,
            text_View146, text_View147, text_View148, text_View149, text_View150,
            text_View151, text_View152, text_View153, text_View154, text_View155,
            text_View156, text_View157, text_View158, text_View159, text_View160,
            text_View161, text_View162, text_View163, text_View164, text_View165,
            text_View166, text_View167, text_View168, text_View169, text_View170,
            text_View171, text_View172, text_View173, text_View174, text_View175,
            text_View176, text_View177, text_View178, text_View179, text_View180,
            text_View181, text_View182, text_View183, text_View184, text_View185,
            text_View186, text_View187, text_View188, text_View189, text_View190,
            text_View191, text_View192, text_View193, text_View194, text_View195,
            text_View196, text_View197, text_View198, text_View199, text_View200,
            text_View201, text_View202, text_View203, text_View204, text_View205,
            text_View206, text_View207, text_View208, text_View209, text_View210,
            text_View211, text_View212, text_View213, text_View214, text_View215,
            text_View216, text_View217, text_View218, text_View219, text_View220,
            text_View221, text_View222, text_View223, text_View224, text_View225,
            text_View226, text_View227, text_View228, text_View229, text_View230,
            text_View231, text_View232, text_View233, text_View234, text_View235,
            text_View236, text_View237, text_View238, text_View239, text_View240,
            text_View241, text_View242, text_View243, text_View244, text_View245;

   private ListDbHelper listDbHelper;

    final String TAG = "life";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//        listDbHelper = new ListDbHelper(this);
//        SQLiteDatabase db = listDbHelper.getReadableDatabase();
//        db.close();


        text_View1 = (TextView) findViewById(R.id.text_View1);
        text_View2 = (TextView) findViewById(R.id.text_View2);
        text_View3 = (TextView) findViewById(R.id.text_View3);
        text_View4 = (TextView) findViewById(R.id.text_View4);
        text_View5 = (TextView) findViewById(R.id.text_View5);
        text_View6 = (TextView) findViewById(R.id.text_View6);
        text_View7 = (TextView) findViewById(R.id.text_View7);
        text_View8 = (TextView) findViewById(R.id.text_View8);
        text_View9 = (TextView) findViewById(R.id.text_View9);
        text_View10 = (TextView) findViewById(R.id.text_View10);
        text_View11 = (TextView) findViewById(R.id.text_View11);
        text_View12 = (TextView) findViewById(R.id.text_View12);
        text_View13 = (TextView) findViewById(R.id.text_View13);
        text_View14 = (TextView) findViewById(R.id.text_View14);
        text_View15 = (TextView) findViewById(R.id.text_View15);
        text_View16 = (TextView) findViewById(R.id.text_View16);
        text_View17 = (TextView) findViewById(R.id.text_View17);
        text_View18 = (TextView) findViewById(R.id.text_View18);
        text_View19 = (TextView) findViewById(R.id.text_View19);
        text_View20 = (TextView) findViewById(R.id.text_View20);
        text_View21 = (TextView) findViewById(R.id.text_View21);
        text_View22 = (TextView) findViewById(R.id.text_View22);
        text_View23 = (TextView) findViewById(R.id.text_View23);
        text_View24 = (TextView) findViewById(R.id.text_View24);
        text_View25 = (TextView) findViewById(R.id.text_View25);
        text_View26 = (TextView) findViewById(R.id.text_View26);
        text_View27 = (TextView) findViewById(R.id.text_View27);
        text_View28 = (TextView) findViewById(R.id.text_View28);
        text_View29 = (TextView) findViewById(R.id.text_View29);
        text_View30 = (TextView) findViewById(R.id.text_View30);
        text_View31 = (TextView) findViewById(R.id.text_View31);
        text_View32 = (TextView) findViewById(R.id.text_View32);
        text_View33 = (TextView) findViewById(R.id.text_View33);
        text_View34 = (TextView) findViewById(R.id.text_View34);
        text_View35 = (TextView) findViewById(R.id.text_View35);
        text_View36 = (TextView) findViewById(R.id.text_View36);
        text_View37 = (TextView) findViewById(R.id.text_View37);
        text_View38 = (TextView) findViewById(R.id.text_View38);
        text_View39 = (TextView) findViewById(R.id.text_View39);
        text_View40 = (TextView) findViewById(R.id.text_View40);
        text_View41 = (TextView) findViewById(R.id.text_View41);
        text_View42 = (TextView) findViewById(R.id.text_View42);
        text_View43 = (TextView) findViewById(R.id.text_View43);
        text_View44 = (TextView) findViewById(R.id.text_View44);
        text_View45 = (TextView) findViewById(R.id.text_View45);
        text_View46 = (TextView) findViewById(R.id.text_View46);
        text_View47 = (TextView) findViewById(R.id.text_View47);
        text_View48 = (TextView) findViewById(R.id.text_View48);
        text_View49 = (TextView) findViewById(R.id.text_View49);
        text_View50 = (TextView) findViewById(R.id.text_View50);
        text_View51 = (TextView) findViewById(R.id.text_View51);
        text_View52 = (TextView) findViewById(R.id.text_View52);
        text_View53 = (TextView) findViewById(R.id.text_View53);
        text_View54 = (TextView) findViewById(R.id.text_View54);
        text_View55 = (TextView) findViewById(R.id.text_View55);
        text_View56 = (TextView) findViewById(R.id.text_View56);
        text_View57 = (TextView) findViewById(R.id.text_View57);
        text_View58 = (TextView) findViewById(R.id.text_View58);
        text_View59 = (TextView) findViewById(R.id.text_View59);
        text_View60 = (TextView) findViewById(R.id.text_View60);
        text_View61 = (TextView) findViewById(R.id.text_View61);
        text_View62 = (TextView) findViewById(R.id.text_View62);
        text_View63 = (TextView) findViewById(R.id.text_View63);
        text_View64 = (TextView) findViewById(R.id.text_View64);
        text_View65 = (TextView) findViewById(R.id.text_View65);
        text_View66 = (TextView) findViewById(R.id.text_View66);
        text_View67 = (TextView) findViewById(R.id.text_View67);
        text_View68 = (TextView) findViewById(R.id.text_View68);
        text_View69 = (TextView) findViewById(R.id.text_View69);
        text_View70 = (TextView) findViewById(R.id.text_View70);
        text_View71 = (TextView) findViewById(R.id.text_View71);
        text_View72 = (TextView) findViewById(R.id.text_View72);
        text_View73 = (TextView) findViewById(R.id.text_View73);
        text_View74 = (TextView) findViewById(R.id.text_View74);
        text_View75 = (TextView) findViewById(R.id.text_View75);
        text_View76 = (TextView) findViewById(R.id.text_View76);
        text_View77 = (TextView) findViewById(R.id.text_View77);
        text_View78 = (TextView) findViewById(R.id.text_View78);
        text_View79 = (TextView) findViewById(R.id.text_View79);
        text_View80 = (TextView) findViewById(R.id.text_View80);
        text_View81 = (TextView) findViewById(R.id.text_View81);
        text_View82 = (TextView) findViewById(R.id.text_View82);
        text_View83 = (TextView) findViewById(R.id.text_View83);
        text_View84 = (TextView) findViewById(R.id.text_View84);
        text_View85 = (TextView) findViewById(R.id.text_View85);
        text_View86 = (TextView) findViewById(R.id.text_View86);
        text_View87 = (TextView) findViewById(R.id.text_View87);
        text_View88 = (TextView) findViewById(R.id.text_View88);
        text_View89 = (TextView) findViewById(R.id.text_View89);
        text_View90 = (TextView) findViewById(R.id.text_View90);
        text_View91 = (TextView) findViewById(R.id.text_View91);
        text_View92 = (TextView) findViewById(R.id.text_View92);
        text_View93 = (TextView) findViewById(R.id.text_View93);
        text_View94 = (TextView) findViewById(R.id.text_View94);
        text_View95 = (TextView) findViewById(R.id.text_View95);
        text_View96 = (TextView) findViewById(R.id.text_View96);
        text_View97 = (TextView) findViewById(R.id.text_View97);
        text_View98 = (TextView) findViewById(R.id.text_View98);
        text_View99 = (TextView) findViewById(R.id.text_View99);
        text_View100 = (TextView) findViewById(R.id.text_View100);
        text_View101 = (TextView) findViewById(R.id.text_View101);
        text_View102 = (TextView) findViewById(R.id.text_View102);
        text_View103 = (TextView) findViewById(R.id.text_View103);
        text_View104 = (TextView) findViewById(R.id.text_View104);
        text_View105 = (TextView) findViewById(R.id.text_View105);
        text_View106 = (TextView) findViewById(R.id.text_View106);
        text_View107 = (TextView) findViewById(R.id.text_View107);
        text_View108 = (TextView) findViewById(R.id.text_View108);
        text_View109 = (TextView) findViewById(R.id.text_View109);
        text_View110 = (TextView) findViewById(R.id.text_View110);
        text_View111 = (TextView) findViewById(R.id.text_View111);
        text_View112 = (TextView) findViewById(R.id.text_View112);
        text_View113 = (TextView) findViewById(R.id.text_View113);
        text_View114 = (TextView) findViewById(R.id.text_View114);
        text_View115 = (TextView) findViewById(R.id.text_View115);
        text_View116 = (TextView) findViewById(R.id.text_View116);
        text_View117 = (TextView) findViewById(R.id.text_View117);
        text_View118 = (TextView) findViewById(R.id.text_View118);
        text_View119 = (TextView) findViewById(R.id.text_View119);
        text_View120 = (TextView) findViewById(R.id.text_View120);
        text_View121 = (TextView) findViewById(R.id.text_View121);
        text_View122 = (TextView) findViewById(R.id.text_View122);
        text_View123 = (TextView) findViewById(R.id.text_View123);
        text_View124 = (TextView) findViewById(R.id.text_View124);
        text_View125 = (TextView) findViewById(R.id.text_View125);
        text_View126 = (TextView) findViewById(R.id.text_View126);
        text_View127 = (TextView) findViewById(R.id.text_View127);
        text_View128 = (TextView) findViewById(R.id.text_View128);
        text_View129 = (TextView) findViewById(R.id.text_View129);
        text_View130 = (TextView) findViewById(R.id.text_View130);
        text_View131 = (TextView) findViewById(R.id.text_View131);
        text_View132 = (TextView) findViewById(R.id.text_View132);
        text_View133 = (TextView) findViewById(R.id.text_View133);
        text_View134 = (TextView) findViewById(R.id.text_View134);
        text_View135 = (TextView) findViewById(R.id.text_View135);
        text_View136 = (TextView) findViewById(R.id.text_View136);
        text_View137 = (TextView) findViewById(R.id.text_View137);
        text_View138 = (TextView) findViewById(R.id.text_View138);
        text_View139 = (TextView) findViewById(R.id.text_View139);
        text_View140 = (TextView) findViewById(R.id.text_View140);
        text_View141 = (TextView) findViewById(R.id.text_View141);
        text_View142 = (TextView) findViewById(R.id.text_View142);
        text_View143 = (TextView) findViewById(R.id.text_View143);
        text_View144 = (TextView) findViewById(R.id.text_View144);
        text_View145 = (TextView) findViewById(R.id.text_View145);
        text_View146 = (TextView) findViewById(R.id.text_View146);
        text_View147 = (TextView) findViewById(R.id.text_View147);
        text_View148 = (TextView) findViewById(R.id.text_View148);
        text_View149 = (TextView) findViewById(R.id.text_View149);
        text_View150 = (TextView) findViewById(R.id.text_View150);
        text_View151 = (TextView) findViewById(R.id.text_View151);
        text_View152 = (TextView) findViewById(R.id.text_View152);
        text_View153 = (TextView) findViewById(R.id.text_View153);
        text_View154 = (TextView) findViewById(R.id.text_View154);
        text_View155 = (TextView) findViewById(R.id.text_View155);
        text_View156 = (TextView) findViewById(R.id.text_View156);
        text_View157 = (TextView) findViewById(R.id.text_View157);
        text_View158 = (TextView) findViewById(R.id.text_View158);
        text_View159 = (TextView) findViewById(R.id.text_View159);
        text_View160 = (TextView) findViewById(R.id.text_View160);
        text_View161 = (TextView) findViewById(R.id.text_View161);
        text_View162 = (TextView) findViewById(R.id.text_View162);
        text_View163 = (TextView) findViewById(R.id.text_View163);
        text_View164 = (TextView) findViewById(R.id.text_View164);
        text_View165 = (TextView) findViewById(R.id.text_View165);
        text_View166 = (TextView) findViewById(R.id.text_View166);
        text_View167 = (TextView) findViewById(R.id.text_View167);
        text_View168 = (TextView) findViewById(R.id.text_View168);
        text_View169 = (TextView) findViewById(R.id.text_View169);
        text_View170 = (TextView) findViewById(R.id.text_View170);
        text_View171 = (TextView) findViewById(R.id.text_View171);
        text_View172 = (TextView) findViewById(R.id.text_View172);
        text_View173 = (TextView) findViewById(R.id.text_View173);
        text_View174 = (TextView) findViewById(R.id.text_View174);
        text_View175 = (TextView) findViewById(R.id.text_View175);
        text_View176 = (TextView) findViewById(R.id.text_View176);
        text_View177 = (TextView) findViewById(R.id.text_View177);
        text_View178 = (TextView) findViewById(R.id.text_View178);
        text_View179 = (TextView) findViewById(R.id.text_View179);
        text_View180 = (TextView) findViewById(R.id.text_View180);
        text_View181 = (TextView) findViewById(R.id.text_View181);
        text_View182 = (TextView) findViewById(R.id.text_View182);
        text_View183 = (TextView) findViewById(R.id.text_View183);
        text_View184 = (TextView) findViewById(R.id.text_View184);
        text_View185 = (TextView) findViewById(R.id.text_View185);
        text_View186 = (TextView) findViewById(R.id.text_View186);
        text_View187 = (TextView) findViewById(R.id.text_View187);
        text_View188 = (TextView) findViewById(R.id.text_View188);
        text_View189 = (TextView) findViewById(R.id.text_View189);
        text_View190 = (TextView) findViewById(R.id.text_View190);
        text_View191 = (TextView) findViewById(R.id.text_View191);
        text_View192 = (TextView) findViewById(R.id.text_View192);
        text_View193 = (TextView) findViewById(R.id.text_View193);
        text_View194 = (TextView) findViewById(R.id.text_View194);
        text_View195 = (TextView) findViewById(R.id.text_View195);
        text_View196 = (TextView) findViewById(R.id.text_View196);
        text_View197 = (TextView) findViewById(R.id.text_View197);
        text_View198 = (TextView) findViewById(R.id.text_View198);
        text_View199 = (TextView) findViewById(R.id.text_View199);
        text_View200 = (TextView) findViewById(R.id.text_View200);
        text_View201 = (TextView) findViewById(R.id.text_View201);
        text_View202 = (TextView) findViewById(R.id.text_View202);
        text_View203 = (TextView) findViewById(R.id.text_View203);
        text_View204 = (TextView) findViewById(R.id.text_View204);
        text_View205 = (TextView) findViewById(R.id.text_View205);
        text_View206 = (TextView) findViewById(R.id.text_View206);
        text_View207 = (TextView) findViewById(R.id.text_View207);
        text_View208 = (TextView) findViewById(R.id.text_View208);
        text_View209 = (TextView) findViewById(R.id.text_View209);
        text_View210 = (TextView) findViewById(R.id.text_View210);
        text_View211 = (TextView) findViewById(R.id.text_View211);
        text_View212 = (TextView) findViewById(R.id.text_View212);
        text_View213 = (TextView) findViewById(R.id.text_View213);
        text_View214 = (TextView) findViewById(R.id.text_View214);
        text_View215 = (TextView) findViewById(R.id.text_View215);
        text_View216 = (TextView) findViewById(R.id.text_View216);
        text_View217 = (TextView) findViewById(R.id.text_View217);
        text_View218 = (TextView) findViewById(R.id.text_View218);
        text_View219 = (TextView) findViewById(R.id.text_View219);
        text_View220 = (TextView) findViewById(R.id.text_View220);
        text_View221 = (TextView) findViewById(R.id.text_View221);
        text_View222 = (TextView) findViewById(R.id.text_View222);
        text_View223 = (TextView) findViewById(R.id.text_View223);
        text_View224 = (TextView) findViewById(R.id.text_View224);
        text_View225 = (TextView) findViewById(R.id.text_View225);
        text_View226 = (TextView) findViewById(R.id.text_View226);
        text_View227 = (TextView) findViewById(R.id.text_View227);
        text_View228 = (TextView) findViewById(R.id.text_View228);
        text_View229 = (TextView) findViewById(R.id.text_View229);
        text_View230 = (TextView) findViewById(R.id.text_View230);
        text_View231 = (TextView) findViewById(R.id.text_View231);
        text_View232 = (TextView) findViewById(R.id.text_View232);
        text_View233 = (TextView) findViewById(R.id.text_View233);
        text_View234 = (TextView) findViewById(R.id.text_View234);
        text_View235 = (TextView) findViewById(R.id.text_View235);
        text_View236 = (TextView) findViewById(R.id.text_View236);
        text_View237 = (TextView) findViewById(R.id.text_View237);
        text_View238 = (TextView) findViewById(R.id.text_View238);
        text_View239 = (TextView) findViewById(R.id.text_View239);
        text_View240 = (TextView) findViewById(R.id.text_View240);
        text_View241 = (TextView) findViewById(R.id.text_View241);
        text_View242 = (TextView) findViewById(R.id.text_View242);
        text_View243 = (TextView) findViewById(R.id.text_View243);
        text_View244 = (TextView) findViewById(R.id.text_View244);
        text_View245 = (TextView) findViewById(R.id.text_View245);

//
//
//
        text_View1.setOnClickListener(this);
        text_View2.setOnClickListener(this);
        text_View3.setOnClickListener(this);
        text_View4.setOnClickListener(this);
        text_View5.setOnClickListener(this);
        text_View6.setOnClickListener(this);
        text_View7.setOnClickListener(this);
        text_View8.setOnClickListener(this);
        text_View9.setOnClickListener(this);
        text_View10.setOnClickListener(this);
        text_View11.setOnClickListener(this);
        text_View12.setOnClickListener(this);
        text_View13.setOnClickListener(this);
        text_View14.setOnClickListener(this);
        text_View15.setOnClickListener(this);
        text_View16.setOnClickListener(this);
        text_View17.setOnClickListener(this);
        text_View18.setOnClickListener(this);
        text_View19.setOnClickListener(this);
        text_View20.setOnClickListener(this);
        text_View21.setOnClickListener(this);
        text_View22.setOnClickListener(this);
        text_View23.setOnClickListener(this);
        text_View24.setOnClickListener(this);
        text_View25.setOnClickListener(this);
        text_View26.setOnClickListener(this);
        text_View27.setOnClickListener(this);
        text_View28.setOnClickListener(this);
        text_View29.setOnClickListener(this);
        text_View30.setOnClickListener(this);
        text_View31.setOnClickListener(this);
        text_View32.setOnClickListener(this);
        text_View33.setOnClickListener(this);
        text_View34.setOnClickListener(this);
        text_View35.setOnClickListener(this);
        text_View36.setOnClickListener(this);
        text_View37.setOnClickListener(this);
        text_View38.setOnClickListener(this);
        text_View39.setOnClickListener(this);
        text_View40.setOnClickListener(this);
        text_View41.setOnClickListener(this);
        text_View42.setOnClickListener(this);
        text_View43.setOnClickListener(this);
        text_View44.setOnClickListener(this);
        text_View45.setOnClickListener(this);
        text_View46.setOnClickListener(this);
        text_View47.setOnClickListener(this);
        text_View48.setOnClickListener(this);
        text_View49.setOnClickListener(this);
        text_View50.setOnClickListener(this);
        text_View51.setOnClickListener(this);
        text_View52.setOnClickListener(this);
        text_View53.setOnClickListener(this);
        text_View54.setOnClickListener(this);
        text_View55.setOnClickListener(this);
        text_View56.setOnClickListener(this);
        text_View57.setOnClickListener(this);
        text_View58.setOnClickListener(this);
        text_View59.setOnClickListener(this);
        text_View60.setOnClickListener(this);
        text_View61.setOnClickListener(this);
        text_View62.setOnClickListener(this);
        text_View63.setOnClickListener(this);
        text_View64.setOnClickListener(this);
        text_View65.setOnClickListener(this);
        text_View66.setOnClickListener(this);
        text_View67.setOnClickListener(this);
        text_View68.setOnClickListener(this);
        text_View69.setOnClickListener(this);
        text_View70.setOnClickListener(this);
        text_View71.setOnClickListener(this);
        text_View72.setOnClickListener(this);
        text_View73.setOnClickListener(this);
        text_View74.setOnClickListener(this);
        text_View75.setOnClickListener(this);
        text_View76.setOnClickListener(this);
        text_View77.setOnClickListener(this);
        text_View78.setOnClickListener(this);
        text_View79.setOnClickListener(this);
        text_View80.setOnClickListener(this);
        text_View81.setOnClickListener(this);
        text_View82.setOnClickListener(this);
        text_View83.setOnClickListener(this);
        text_View84.setOnClickListener(this);
        text_View85.setOnClickListener(this);
        text_View86.setOnClickListener(this);
        text_View87.setOnClickListener(this);
        text_View88.setOnClickListener(this);
        text_View89.setOnClickListener(this);
        text_View90.setOnClickListener(this);
        text_View91.setOnClickListener(this);
        text_View92.setOnClickListener(this);
        text_View93.setOnClickListener(this);
        text_View94.setOnClickListener(this);
        text_View95.setOnClickListener(this);
        text_View96.setOnClickListener(this);
        text_View97.setOnClickListener(this);
        text_View98.setOnClickListener(this);
        text_View99.setOnClickListener(this);
        text_View100.setOnClickListener(this);
        text_View101.setOnClickListener(this);
        text_View102.setOnClickListener(this);
        text_View103.setOnClickListener(this);
        text_View104.setOnClickListener(this);
        text_View105.setOnClickListener(this);
        text_View106.setOnClickListener(this);
        text_View107.setOnClickListener(this);
        text_View108.setOnClickListener(this);
        text_View109.setOnClickListener(this);
        text_View110.setOnClickListener(this);
        text_View111.setOnClickListener(this);
        text_View112.setOnClickListener(this);
        text_View113.setOnClickListener(this);
        text_View114.setOnClickListener(this);
        text_View115.setOnClickListener(this);
        text_View116.setOnClickListener(this);
        text_View117.setOnClickListener(this);
        text_View118.setOnClickListener(this);
        text_View119.setOnClickListener(this);
        text_View120.setOnClickListener(this);
        text_View121.setOnClickListener(this);
        text_View122.setOnClickListener(this);
        text_View123.setOnClickListener(this);
        text_View124.setOnClickListener(this);
        text_View125.setOnClickListener(this);
        text_View126.setOnClickListener(this);
        text_View127.setOnClickListener(this);
        text_View128.setOnClickListener(this);
        text_View129.setOnClickListener(this);
        text_View130.setOnClickListener(this);
        text_View131.setOnClickListener(this);
        text_View132.setOnClickListener(this);
        text_View133.setOnClickListener(this);
        text_View134.setOnClickListener(this);
        text_View135.setOnClickListener(this);
        text_View136.setOnClickListener(this);
        text_View137.setOnClickListener(this);
        text_View138.setOnClickListener(this);
        text_View139.setOnClickListener(this);
        text_View140.setOnClickListener(this);
        text_View141.setOnClickListener(this);
        text_View142.setOnClickListener(this);
        text_View143.setOnClickListener(this);
        text_View144.setOnClickListener(this);
        text_View145.setOnClickListener(this);
        text_View146.setOnClickListener(this);
        text_View147.setOnClickListener(this);
        text_View148.setOnClickListener(this);
        text_View149.setOnClickListener(this);
        text_View150.setOnClickListener(this);
        text_View151.setOnClickListener(this);
        text_View152.setOnClickListener(this);
        text_View153.setOnClickListener(this);
        text_View154.setOnClickListener(this);
        text_View155.setOnClickListener(this);
        text_View156.setOnClickListener(this);
        text_View157.setOnClickListener(this);
        text_View158.setOnClickListener(this);
        text_View159.setOnClickListener(this);
        text_View160.setOnClickListener(this);
        text_View161.setOnClickListener(this);
        text_View162.setOnClickListener(this);
        text_View163.setOnClickListener(this);
        text_View164.setOnClickListener(this);
        text_View165.setOnClickListener(this);
        text_View166.setOnClickListener(this);
        text_View167.setOnClickListener(this);
        text_View168.setOnClickListener(this);
        text_View169.setOnClickListener(this);
        text_View170.setOnClickListener(this);
        text_View171.setOnClickListener(this);
        text_View172.setOnClickListener(this);
        text_View173.setOnClickListener(this);
        text_View174.setOnClickListener(this);
        text_View175.setOnClickListener(this);
        text_View176.setOnClickListener(this);
        text_View177.setOnClickListener(this);
        text_View178.setOnClickListener(this);
        text_View179.setOnClickListener(this);
        text_View180.setOnClickListener(this);
        text_View181.setOnClickListener(this);
        text_View182.setOnClickListener(this);
        text_View183.setOnClickListener(this);
        text_View184.setOnClickListener(this);
        text_View185.setOnClickListener(this);
        text_View186.setOnClickListener(this);
        text_View187.setOnClickListener(this);
        text_View188.setOnClickListener(this);
        text_View189.setOnClickListener(this);
        text_View190.setOnClickListener(this);
        text_View191.setOnClickListener(this);
        text_View192.setOnClickListener(this);
        text_View193.setOnClickListener(this);
        text_View194.setOnClickListener(this);
        text_View195.setOnClickListener(this);
        text_View196.setOnClickListener(this);
        text_View197.setOnClickListener(this);
        text_View198.setOnClickListener(this);
        text_View199.setOnClickListener(this);
        text_View200.setOnClickListener(this);
        text_View201.setOnClickListener(this);
        text_View202.setOnClickListener(this);
        text_View203.setOnClickListener(this);
        text_View204.setOnClickListener(this);
        text_View205.setOnClickListener(this);
        text_View206.setOnClickListener(this);
        text_View207.setOnClickListener(this);
        text_View208.setOnClickListener(this);
        text_View209.setOnClickListener(this);
        text_View210.setOnClickListener(this);
        text_View211.setOnClickListener(this);
        text_View212.setOnClickListener(this);
        text_View213.setOnClickListener(this);
        text_View214.setOnClickListener(this);
        text_View215.setOnClickListener(this);
        text_View216.setOnClickListener(this);
        text_View217.setOnClickListener(this);
        text_View218.setOnClickListener(this);
        text_View219.setOnClickListener(this);
        text_View220.setOnClickListener(this);
        text_View221.setOnClickListener(this);
        text_View222.setOnClickListener(this);
        text_View223.setOnClickListener(this);
        text_View224.setOnClickListener(this);
        text_View225.setOnClickListener(this);
        text_View226.setOnClickListener(this);
        text_View227.setOnClickListener(this);
        text_View228.setOnClickListener(this);
        text_View229.setOnClickListener(this);
        text_View230.setOnClickListener(this);
        text_View231.setOnClickListener(this);
        text_View232.setOnClickListener(this);
        text_View233.setOnClickListener(this);
        text_View234.setOnClickListener(this);
        text_View235.setOnClickListener(this);
        text_View236.setOnClickListener(this);
        text_View237.setOnClickListener(this);
        text_View238.setOnClickListener(this);
        text_View239.setOnClickListener(this);
        text_View240.setOnClickListener(this);
        text_View241.setOnClickListener(this);
        text_View242.setOnClickListener(this);
        text_View243.setOnClickListener(this);
        text_View244.setOnClickListener(this);
        text_View245.setOnClickListener(this);



        Log.d(TAG, "onCreate MainActivity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop MainActivity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy MainActivity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume MainActivity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause MainActivity");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart MainActivity");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart MainActivity");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent = new Intent(this, Activity_Create_file.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {


        switch (view.getId()) {

            case R.id.text_View1:
                Intent intent1= new Intent(this, Activity_find.class);
                intent1.putExtra("_id", "1");
                startActivity(intent1);break;
            case R.id.text_View2:
                Intent intent2= new Intent(this, Activity_find.class);
                intent2.putExtra("_id", "2");
                startActivity(intent2);break;
            case R.id.text_View3:
                Intent intent3= new Intent(this, Activity_find.class);
                intent3.putExtra("_id", "3");
                startActivity(intent3);break;
            case R.id.text_View4:
                Intent intent4= new Intent(this, Activity_find.class);
                intent4.putExtra("_id", "4");
                startActivity(intent4);break;
            case R.id.text_View5:
                Intent intent5= new Intent(this, Activity_find.class);
                intent5.putExtra("_id", "5");
                startActivity(intent5);break;
            case R.id.text_View6:
                Intent intent6= new Intent(this, Activity_find.class);
                intent6.putExtra("_id", "6");
                startActivity(intent6);break;
            case R.id.text_View7:
                Intent intent7= new Intent(this, Activity_find.class);
                intent7.putExtra("_id", "7");
                startActivity(intent7);break;
            case R.id.text_View8:
                Intent intent8= new Intent(this, Activity_find.class);
                intent8.putExtra("_id", "8");
                startActivity(intent8);break;
            case R.id.text_View9:
                Intent intent9= new Intent(this, Activity_find.class);
                intent9.putExtra("_id", "9");
                startActivity(intent9);break;
            case R.id.text_View10:
                Intent intent10= new Intent(this, Activity_find.class);
                intent10.putExtra("_id", "10");
                startActivity(intent10);break;
            case R.id.text_View11:
                Intent intent11= new Intent(this, Activity_find.class);
                intent11.putExtra("_id", "11");
                startActivity(intent11);break;
            case R.id.text_View12:
                Intent intent12= new Intent(this, Activity_find.class);
                intent12.putExtra("_id", "12");
                startActivity(intent12);break;
            case R.id.text_View13:
                Intent intent13= new Intent(this, Activity_find.class);
                intent13.putExtra("_id", "13");
                startActivity(intent13);break;
            case R.id.text_View14:
                Intent intent14= new Intent(this, Activity_find.class);
                intent14.putExtra("_id", "14");
                startActivity(intent14);break;
            case R.id.text_View15:
                Intent intent15= new Intent(this, Activity_find.class);
                intent15.putExtra("_id", "15");
                startActivity(intent15);break;
            case R.id.text_View16:
                Intent intent16= new Intent(this, Activity_find.class);
                intent16.putExtra("_id", "16");
                startActivity(intent16);break;
            case R.id.text_View17:
                Intent intent17= new Intent(this, Activity_find.class);
                intent17.putExtra("_id", "17");
                startActivity(intent17);break;
            case R.id.text_View18:
                Intent intent18= new Intent(this, Activity_find.class);
                intent18.putExtra("_id", "18");
                startActivity(intent18);break;
            case R.id.text_View19:
                Intent intent19= new Intent(this, Activity_find.class);
                intent19.putExtra("_id", "19");
                startActivity(intent19);break;
            case R.id.text_View20:
                Intent intent20= new Intent(this, Activity_find.class);
                intent20.putExtra("_id", "20");
                startActivity(intent20);break;
            case R.id.text_View21:
                Intent intent21= new Intent(this, Activity_find.class);
                intent21.putExtra("_id", "21");
                startActivity(intent21);break;
            case R.id.text_View22:
                Intent intent22= new Intent(this, Activity_find.class);
                intent22.putExtra("_id", "22");
                startActivity(intent22);break;
            case R.id.text_View23:
                Intent intent23= new Intent(this, Activity_find.class);
                intent23.putExtra("_id", "23");
                startActivity(intent23);break;
            case R.id.text_View24:
                Intent intent24= new Intent(this, Activity_find.class);
                intent24.putExtra("_id", "24");
                startActivity(intent24);break;
            case R.id.text_View25:
                Intent intent25= new Intent(this, Activity_find.class);
                intent25.putExtra("_id", "25");
                startActivity(intent25);break;
            case R.id.text_View26:
                Intent intent26= new Intent(this, Activity_find.class);
                intent26.putExtra("_id", "26");
                startActivity(intent26);break;
            case R.id.text_View27:
                Intent intent27= new Intent(this, Activity_find.class);
                intent27.putExtra("_id", "27");
                startActivity(intent27);break;
            case R.id.text_View28:
                Intent intent28= new Intent(this, Activity_find.class);
                intent28.putExtra("_id", "28");
                startActivity(intent28);break;
            case R.id.text_View29:
                Intent intent29= new Intent(this, Activity_find.class);
                intent29.putExtra("_id", "29");
                startActivity(intent29);break;
            case R.id.text_View30:
                Intent intent30= new Intent(this, Activity_find.class);
                intent30.putExtra("_id", "30");
                startActivity(intent30);break;
            case R.id.text_View31:
                Intent intent31= new Intent(this, Activity_find.class);
                intent31.putExtra("_id", "31");
                startActivity(intent31);break;
            case R.id.text_View32:
                Intent intent32= new Intent(this, Activity_find.class);
                intent32.putExtra("_id", "32");
                startActivity(intent32);break;
            case R.id.text_View33:
                Intent intent33= new Intent(this, Activity_find.class);
                intent33.putExtra("_id", "33");
                startActivity(intent33);break;
            case R.id.text_View34:
                Intent intent34= new Intent(this, Activity_find.class);
                intent34.putExtra("_id", "34");
                startActivity(intent34);break;
            case R.id.text_View35:
                Intent intent35= new Intent(this, Activity_find.class);
                intent35.putExtra("_id", "35");
                startActivity(intent35);break;
            case R.id.text_View36:
                Intent intent36= new Intent(this, Activity_find.class);
                intent36.putExtra("_id", "36");
                startActivity(intent36);break;
            case R.id.text_View37:
                Intent intent37= new Intent(this, Activity_find.class);
                intent37.putExtra("_id", "37");
                startActivity(intent37);break;
            case R.id.text_View38:
                Intent intent38= new Intent(this, Activity_find.class);
                intent38.putExtra("_id", "38");
                startActivity(intent38);break;
            case R.id.text_View39:
                Intent intent39= new Intent(this, Activity_find.class);
                intent39.putExtra("_id", "39");
                startActivity(intent39);break;
            case R.id.text_View40:
                Intent intent40= new Intent(this, Activity_find.class);
                intent40.putExtra("_id", "40");
                startActivity(intent40);break;
            case R.id.text_View41:
                Intent intent41= new Intent(this, Activity_find.class);
                intent41.putExtra("_id", "41");
                startActivity(intent41);break;
            case R.id.text_View42:
                Intent intent42= new Intent(this, Activity_find.class);
                intent42.putExtra("_id", "42");
                startActivity(intent42);break;
            case R.id.text_View43:
                Intent intent43= new Intent(this, Activity_find.class);
                intent43.putExtra("_id", "43");
                startActivity(intent43);break;
            case R.id.text_View44:
                Intent intent44= new Intent(this, Activity_find.class);
                intent44.putExtra("_id", "44");
                startActivity(intent44);break;
            case R.id.text_View45:
                Intent intent45= new Intent(this, Activity_find.class);
                intent45.putExtra("_id", "45");
                startActivity(intent45);break;
            case R.id.text_View46:
                Intent intent46= new Intent(this, Activity_find.class);
                intent46.putExtra("_id", "46");
                startActivity(intent46);break;
            case R.id.text_View47:
                Intent intent47= new Intent(this, Activity_find.class);
                intent47.putExtra("_id", "47");
                startActivity(intent47);break;
            case R.id.text_View48:
                Intent intent48= new Intent(this, Activity_find.class);
                intent48.putExtra("_id", "48");
                startActivity(intent48);break;
            case R.id.text_View49:
                Intent intent49= new Intent(this, Activity_find.class);
                intent49.putExtra("_id", "49");
                startActivity(intent49);break;
            case R.id.text_View50:
                Intent intent50= new Intent(this, Activity_find.class);
                intent50.putExtra("_id", "50");
                startActivity(intent50);break;
            case R.id.text_View51:
                Intent intent51= new Intent(this, Activity_find.class);
                intent51.putExtra("_id", "51");
                startActivity(intent51);break;
            case R.id.text_View52:
                Intent intent52= new Intent(this, Activity_find.class);
                intent52.putExtra("_id", "52");
                startActivity(intent52);break;
            case R.id.text_View53:
                Intent intent53= new Intent(this, Activity_find.class);
                intent53.putExtra("_id", "53");
                startActivity(intent53);break;
            case R.id.text_View54:
                Intent intent54= new Intent(this, Activity_find.class);
                intent54.putExtra("_id", "54");
                startActivity(intent54);break;
            case R.id.text_View55:
                Intent intent55= new Intent(this, Activity_find.class);
                intent55.putExtra("_id", "55");
                startActivity(intent55);break;
            case R.id.text_View56:
                Intent intent56= new Intent(this, Activity_find.class);
                intent56.putExtra("_id", "56");
                startActivity(intent56);break;
            case R.id.text_View57:
                Intent intent57= new Intent(this, Activity_find.class);
                intent57.putExtra("_id", "57");
                startActivity(intent57);break;
            case R.id.text_View58:
                Intent intent58= new Intent(this, Activity_find.class);
                intent58.putExtra("_id", "58");
                startActivity(intent58);break;
            case R.id.text_View59:
                Intent intent59= new Intent(this, Activity_find.class);
                intent59.putExtra("_id", "59");
                startActivity(intent59);break;
            case R.id.text_View60:
                Intent intent60= new Intent(this, Activity_find.class);
                intent60.putExtra("_id", "60");
                startActivity(intent60);break;
            case R.id.text_View61:
                Intent intent61= new Intent(this, Activity_find.class);
                intent61.putExtra("_id", "61");
                startActivity(intent61);break;
            case R.id.text_View62:
                Intent intent62= new Intent(this, Activity_find.class);
                intent62.putExtra("_id", "62");
                startActivity(intent62);break;
            case R.id.text_View63:
                Intent intent63= new Intent(this, Activity_find.class);
                intent63.putExtra("_id", "63");
                startActivity(intent63);break;
            case R.id.text_View64:
                Intent intent64= new Intent(this, Activity_find.class);
                intent64.putExtra("_id", "64");
                startActivity(intent64);break;
            case R.id.text_View65:
                Intent intent65= new Intent(this, Activity_find.class);
                intent65.putExtra("_id", "65");
                startActivity(intent65);break;
            case R.id.text_View66:
                Intent intent66= new Intent(this, Activity_find.class);
                intent66.putExtra("_id", "66");
                startActivity(intent66);break;
            case R.id.text_View67:
                Intent intent67= new Intent(this, Activity_find.class);
                intent67.putExtra("_id", "67");
                startActivity(intent67);break;
            case R.id.text_View68:
                Intent intent68= new Intent(this, Activity_find.class);
                intent68.putExtra("_id", "68");
                startActivity(intent68);break;
            case R.id.text_View69:
                Intent intent69= new Intent(this, Activity_find.class);
                intent69.putExtra("_id", "69");
                startActivity(intent69);break;
            case R.id.text_View70:
                Intent intent70= new Intent(this, Activity_find.class);
                intent70.putExtra("_id", "70");
                startActivity(intent70);break;
            case R.id.text_View71:
                Intent intent71= new Intent(this, Activity_find.class);
                intent71.putExtra("_id", "71");
                startActivity(intent71);break;
            case R.id.text_View72:
                Intent intent72= new Intent(this, Activity_find.class);
                intent72.putExtra("_id", "72");
                startActivity(intent72);break;
            case R.id.text_View73:
                Intent intent73= new Intent(this, Activity_find.class);
                intent73.putExtra("_id", "73");
                startActivity(intent73);break;
            case R.id.text_View74:
                Intent intent74= new Intent(this, Activity_find.class);
                intent74.putExtra("_id", "74");
                startActivity(intent74);break;
            case R.id.text_View75:
                Intent intent75= new Intent(this, Activity_find.class);
                intent75.putExtra("_id", "75");
                startActivity(intent75);break;
            case R.id.text_View76:
                Intent intent76= new Intent(this, Activity_find.class);
                intent76.putExtra("_id", "76");
                startActivity(intent76);break;
            case R.id.text_View77:
                Intent intent77= new Intent(this, Activity_find.class);
                intent77.putExtra("_id", "77");
                startActivity(intent77);break;
            case R.id.text_View78:
                Intent intent78= new Intent(this, Activity_find.class);
                intent78.putExtra("_id", "78");
                startActivity(intent78);break;
            case R.id.text_View79:
                Intent intent79= new Intent(this, Activity_find.class);
                intent79.putExtra("_id", "79");
                startActivity(intent79);break;
            case R.id.text_View80:
                Intent intent80= new Intent(this, Activity_find.class);
                intent80.putExtra("_id", "80");
                startActivity(intent80);break;
            case R.id.text_View81:
                Intent intent81= new Intent(this, Activity_find.class);
                intent81.putExtra("_id", "81");
                startActivity(intent81);break;
            case R.id.text_View82:
                Intent intent82= new Intent(this, Activity_find.class);
                intent82.putExtra("_id", "82");
                startActivity(intent82);break;
            case R.id.text_View83:
                Intent intent83= new Intent(this, Activity_find.class);
                intent83.putExtra("_id", "83");
                startActivity(intent83);break;
            case R.id.text_View84:
                Intent intent84= new Intent(this, Activity_find.class);
                intent84.putExtra("_id", "84");
                startActivity(intent84);break;
            case R.id.text_View85:
                Intent intent85= new Intent(this, Activity_find.class);
                intent85.putExtra("_id", "85");
                startActivity(intent85);break;
            case R.id.text_View86:
                Intent intent86= new Intent(this, Activity_find.class);
                intent86.putExtra("_id", "86");
                startActivity(intent86);break;
            case R.id.text_View87:
                Intent intent87= new Intent(this, Activity_find.class);
                intent87.putExtra("_id", "87");
                startActivity(intent87);break;
            case R.id.text_View88:
                Intent intent88= new Intent(this, Activity_find.class);
                intent88.putExtra("_id", "88");
                startActivity(intent88);break;
            case R.id.text_View89:
                Intent intent89= new Intent(this, Activity_find.class);
                intent89.putExtra("_id", "89");
                startActivity(intent89);break;
            case R.id.text_View90:
                Intent intent90= new Intent(this, Activity_find.class);
                intent90.putExtra("_id", "90");
                startActivity(intent90);break;
            case R.id.text_View91:
                Intent intent91= new Intent(this, Activity_find.class);
                intent91.putExtra("_id", "91");
                startActivity(intent91);break;
            case R.id.text_View92:
                Intent intent92= new Intent(this, Activity_find.class);
                intent92.putExtra("_id", "92");
                startActivity(intent92);break;
            case R.id.text_View93:
                Intent intent93= new Intent(this, Activity_find.class);
                intent93.putExtra("_id", "93");
                startActivity(intent93);break;
            case R.id.text_View94:
                Intent intent94= new Intent(this, Activity_find.class);
                intent94.putExtra("_id", "94");
                startActivity(intent94);break;
            case R.id.text_View95:
                Intent intent95= new Intent(this, Activity_find.class);
                intent95.putExtra("_id", "95");
                startActivity(intent95);break;
            case R.id.text_View96:
                Intent intent96= new Intent(this, Activity_find.class);
                intent96.putExtra("_id", "96");
                startActivity(intent96);break;
            case R.id.text_View97:
                Intent intent97= new Intent(this, Activity_find.class);
                intent97.putExtra("_id", "97");
                startActivity(intent97);break;
            case R.id.text_View98:
                Intent intent98= new Intent(this, Activity_find.class);
                intent98.putExtra("_id", "98");
                startActivity(intent98);break;
            case R.id.text_View99:
                Intent intent99= new Intent(this, Activity_find.class);
                intent99.putExtra("_id", "99");
                startActivity(intent99);break;
            case R.id.text_View100:
                Intent intent100= new Intent(this, Activity_find.class);
                intent100.putExtra("_id", "100");
                startActivity(intent100);break;
            case R.id.text_View101:
                Intent intent101= new Intent(this, Activity_find.class);
                intent101.putExtra("_id", "101");
                startActivity(intent101);break;
            case R.id.text_View102:
                Intent intent102= new Intent(this, Activity_find.class);
                intent102.putExtra("_id", "102");
                startActivity(intent102);break;
            case R.id.text_View103:
                Intent intent103= new Intent(this, Activity_find.class);
                intent103.putExtra("_id", "103");
                startActivity(intent103);break;
            case R.id.text_View104:
                Intent intent104= new Intent(this, Activity_find.class);
                intent104.putExtra("_id", "104");
                startActivity(intent104);break;
            case R.id.text_View105:
                Intent intent105= new Intent(this, Activity_find.class);
                intent105.putExtra("_id", "105");
                startActivity(intent105);break;
            case R.id.text_View106:
                Intent intent106= new Intent(this, Activity_find.class);
                intent106.putExtra("_id", "106");
                startActivity(intent106);break;
            case R.id.text_View107:
                Intent intent107= new Intent(this, Activity_find.class);
                intent107.putExtra("_id", "107");
                startActivity(intent107);break;
            case R.id.text_View108:
                Intent intent108= new Intent(this, Activity_find.class);
                intent108.putExtra("_id", "108");
                startActivity(intent108);break;
            case R.id.text_View109:
                Intent intent109= new Intent(this, Activity_find.class);
                intent109.putExtra("_id", "109");
                startActivity(intent109);break;
            case R.id.text_View110:
                Intent intent110= new Intent(this, Activity_find.class);
                intent110.putExtra("_id", "110");
                startActivity(intent110);break;
            case R.id.text_View111:
                Intent intent111= new Intent(this, Activity_find.class);
                intent111.putExtra("_id", "111");
                startActivity(intent111);break;
            case R.id.text_View112:
                Intent intent112= new Intent(this, Activity_find.class);
                intent112.putExtra("_id", "112");
                startActivity(intent112);break;
            case R.id.text_View113:
                Intent intent113= new Intent(this, Activity_find.class);
                intent113.putExtra("_id", "113");
                startActivity(intent113);break;
            case R.id.text_View114:
                Intent intent114= new Intent(this, Activity_find.class);
                intent114.putExtra("_id", "114");
                startActivity(intent114);break;
            case R.id.text_View115:
                Intent intent115= new Intent(this, Activity_find.class);
                intent115.putExtra("_id", "115");
                startActivity(intent115);break;
            case R.id.text_View116:
                Intent intent116= new Intent(this, Activity_find.class);
                intent116.putExtra("_id", "116");
                startActivity(intent116);break;
            case R.id.text_View117:
                Intent intent117= new Intent(this, Activity_find.class);
                intent117.putExtra("_id", "117");
                startActivity(intent117);break;
            case R.id.text_View118:
                Intent intent118= new Intent(this, Activity_find.class);
                intent118.putExtra("_id", "118");
                startActivity(intent118);break;
            case R.id.text_View119:
                Intent intent119= new Intent(this, Activity_find.class);
                intent119.putExtra("_id", "119");
                startActivity(intent119);break;
            case R.id.text_View120:
                Intent intent120= new Intent(this, Activity_find.class);
                intent120.putExtra("_id", "120");
                startActivity(intent120);break;
            case R.id.text_View121:
                Intent intent121= new Intent(this, Activity_find.class);
                intent121.putExtra("_id", "121");
                startActivity(intent121);break;
            case R.id.text_View122:
                Intent intent122= new Intent(this, Activity_find.class);
                intent122.putExtra("_id", "122");
                startActivity(intent122);break;
            case R.id.text_View123:
                Intent intent123= new Intent(this, Activity_find.class);
                intent123.putExtra("_id", "123");
                startActivity(intent123);break;
            case R.id.text_View124:
                Intent intent124= new Intent(this, Activity_find.class);
                intent124.putExtra("_id", "124");
                startActivity(intent124);break;
            case R.id.text_View125:
                Intent intent125= new Intent(this, Activity_find.class);
                intent125.putExtra("_id", "125");
                startActivity(intent125);break;
            case R.id.text_View126:
                Intent intent126= new Intent(this, Activity_find.class);
                intent126.putExtra("_id", "126");
                startActivity(intent126);break;
            case R.id.text_View127:
                Intent intent127= new Intent(this, Activity_find.class);
                intent127.putExtra("_id", "127");
                startActivity(intent127);break;
            case R.id.text_View128:
                Intent intent128= new Intent(this, Activity_find.class);
                intent128.putExtra("_id", "128");
                startActivity(intent128);break;
            case R.id.text_View129:
                Intent intent129= new Intent(this, Activity_find.class);
                intent129.putExtra("_id", "129");
                startActivity(intent129);break;
            case R.id.text_View130:
                Intent intent130= new Intent(this, Activity_find.class);
                intent130.putExtra("_id", "130");
                startActivity(intent130);break;
            case R.id.text_View131:
                Intent intent131= new Intent(this, Activity_find.class);
                intent131.putExtra("_id", "131");
                startActivity(intent131);break;
            case R.id.text_View132:
                Intent intent132= new Intent(this, Activity_find.class);
                intent132.putExtra("_id", "132");
                startActivity(intent132);break;
            case R.id.text_View133:
                Intent intent133= new Intent(this, Activity_find.class);
                intent133.putExtra("_id", "133");
                startActivity(intent133);break;
            case R.id.text_View134:
                Intent intent134= new Intent(this, Activity_find.class);
                intent134.putExtra("_id", "134");
                startActivity(intent134);break;
            case R.id.text_View135:
                Intent intent135= new Intent(this, Activity_find.class);
                intent135.putExtra("_id", "135");
                startActivity(intent135);break;
            case R.id.text_View136:
                Intent intent136= new Intent(this, Activity_find.class);
                intent136.putExtra("_id", "136");
                startActivity(intent136);break;
            case R.id.text_View137:
                Intent intent137= new Intent(this, Activity_find.class);
                intent137.putExtra("_id", "137");
                startActivity(intent137);break;
            case R.id.text_View138:
                Intent intent138= new Intent(this, Activity_find.class);
                intent138.putExtra("_id", "138");
                startActivity(intent138);break;
            case R.id.text_View139:
                Intent intent139= new Intent(this, Activity_find.class);
                intent139.putExtra("_id", "139");
                startActivity(intent139);break;
            case R.id.text_View140:
                Intent intent140= new Intent(this, Activity_find.class);
                intent140.putExtra("_id", "140");
                startActivity(intent140);break;
            case R.id.text_View141:
                Intent intent141= new Intent(this, Activity_find.class);
                intent141.putExtra("_id", "141");
                startActivity(intent141);break;
            case R.id.text_View142:
                Intent intent142= new Intent(this, Activity_find.class);
                intent142.putExtra("_id", "142");
                startActivity(intent142);break;
            case R.id.text_View143:
                Intent intent143= new Intent(this, Activity_find.class);
                intent143.putExtra("_id", "143");
                startActivity(intent143);break;
            case R.id.text_View144:
                Intent intent144= new Intent(this, Activity_find.class);
                intent144.putExtra("_id", "144");
                startActivity(intent144);break;
            case R.id.text_View145:
                Intent intent145= new Intent(this, Activity_find.class);
                intent145.putExtra("_id", "145");
                startActivity(intent145);break;
            case R.id.text_View146:
                Intent intent146= new Intent(this, Activity_find.class);
                intent146.putExtra("_id", "146");
                startActivity(intent146);break;
            case R.id.text_View147:
                Intent intent147= new Intent(this, Activity_find.class);
                intent147.putExtra("_id", "147");
                startActivity(intent147);break;
            case R.id.text_View148:
                Intent intent148= new Intent(this, Activity_find.class);
                intent148.putExtra("_id", "148");
                startActivity(intent148);break;
            case R.id.text_View149:
                Intent intent149= new Intent(this, Activity_find.class);
                intent149.putExtra("_id", "149");
                startActivity(intent149);break;
            case R.id.text_View150:
                Intent intent150= new Intent(this, Activity_find.class);
                intent150.putExtra("_id", "150");
                startActivity(intent150);break;
            case R.id.text_View151:
                Intent intent151= new Intent(this, Activity_find.class);
                intent151.putExtra("_id", "151");
                startActivity(intent151);break;
            case R.id.text_View152:
                Intent intent152= new Intent(this, Activity_find.class);
                intent152.putExtra("_id", "152");
                startActivity(intent152);break;
            case R.id.text_View153:
                Intent intent153= new Intent(this, Activity_find.class);
                intent153.putExtra("_id", "153");
                startActivity(intent153);break;
            case R.id.text_View154:
                Intent intent154= new Intent(this, Activity_find.class);
                intent154.putExtra("_id", "154");
                startActivity(intent154);break;
            case R.id.text_View155:
                Intent intent155= new Intent(this, Activity_find.class);
                intent155.putExtra("_id", "155");
                startActivity(intent155);break;
            case R.id.text_View156:
                Intent intent156= new Intent(this, Activity_find.class);
                intent156.putExtra("_id", "156");
                startActivity(intent156);break;
            case R.id.text_View157:
                Intent intent157= new Intent(this, Activity_find.class);
                intent157.putExtra("_id", "157");
                startActivity(intent157);break;
            case R.id.text_View158:
                Intent intent158= new Intent(this, Activity_find.class);
                intent158.putExtra("_id", "158");
                startActivity(intent158);break;
            case R.id.text_View159:
                Intent intent159= new Intent(this, Activity_find.class);
                intent159.putExtra("_id", "159");
                startActivity(intent159);break;
            case R.id.text_View160:
                Intent intent160= new Intent(this, Activity_find.class);
                intent160.putExtra("_id", "160");
                startActivity(intent160);break;
            case R.id.text_View161:
                Intent intent161= new Intent(this, Activity_find.class);
                intent161.putExtra("_id", "161");
                startActivity(intent161);break;
            case R.id.text_View162:
                Intent intent162= new Intent(this, Activity_find.class);
                intent162.putExtra("_id", "162");
                startActivity(intent162);break;
            case R.id.text_View163:
                Intent intent163= new Intent(this, Activity_find.class);
                intent163.putExtra("_id", "163");
                startActivity(intent163);break;
            case R.id.text_View164:
                Intent intent164= new Intent(this, Activity_find.class);
                intent164.putExtra("_id", "164");
                startActivity(intent164);break;
            case R.id.text_View165:
                Intent intent165= new Intent(this, Activity_find.class);
                intent165.putExtra("_id", "165");
                startActivity(intent165);break;
            case R.id.text_View166:
                Intent intent166= new Intent(this, Activity_find.class);
                intent166.putExtra("_id", "166");
                startActivity(intent166);break;
            case R.id.text_View167:
                Intent intent167= new Intent(this, Activity_find.class);
                intent167.putExtra("_id", "167");
                startActivity(intent167);break;
            case R.id.text_View168:
                Intent intent168= new Intent(this, Activity_find.class);
                intent168.putExtra("_id", "168");
                startActivity(intent168);break;
            case R.id.text_View169:
                Intent intent169= new Intent(this, Activity_find.class);
                intent169.putExtra("_id", "169");
                startActivity(intent169);break;
            case R.id.text_View170:
                Intent intent170= new Intent(this, Activity_find.class);
                intent170.putExtra("_id", "170");
                startActivity(intent170);break;
            case R.id.text_View171:
                Intent intent171= new Intent(this, Activity_find.class);
                intent171.putExtra("_id", "171");
                startActivity(intent171);break;
            case R.id.text_View172:
                Intent intent172= new Intent(this, Activity_find.class);
                intent172.putExtra("_id", "172");
                startActivity(intent172);break;
            case R.id.text_View173:
                Intent intent173= new Intent(this, Activity_find.class);
                intent173.putExtra("_id", "173");
                startActivity(intent173);break;
            case R.id.text_View174:
                Intent intent174= new Intent(this, Activity_find.class);
                intent174.putExtra("_id", "174");
                startActivity(intent174);break;
            case R.id.text_View175:
                Intent intent175= new Intent(this, Activity_find.class);
                intent175.putExtra("_id", "175");
                startActivity(intent175);break;
            case R.id.text_View176:
                Intent intent176= new Intent(this, Activity_find.class);
                intent176.putExtra("_id", "176");
                startActivity(intent176);break;
            case R.id.text_View177:
                Intent intent177= new Intent(this, Activity_find.class);
                intent177.putExtra("_id", "177");
                startActivity(intent177);break;
            case R.id.text_View178:
                Intent intent178= new Intent(this, Activity_find.class);
                intent178.putExtra("_id", "178");
                startActivity(intent178);break;
            case R.id.text_View179:
                Intent intent179= new Intent(this, Activity_find.class);
                intent179.putExtra("_id", "179");
                startActivity(intent179);break;
            case R.id.text_View180:
                Intent intent180= new Intent(this, Activity_find.class);
                intent180.putExtra("_id", "180");
                startActivity(intent180);break;
            case R.id.text_View181:
                Intent intent181= new Intent(this, Activity_find.class);
                intent181.putExtra("_id", "181");
                startActivity(intent181);break;
            case R.id.text_View182:
                Intent intent182= new Intent(this, Activity_find.class);
                intent182.putExtra("_id", "182");
                startActivity(intent182);break;
            case R.id.text_View183:
                Intent intent183= new Intent(this, Activity_find.class);
                intent183.putExtra("_id", "183");
                startActivity(intent183);break;
            case R.id.text_View184:
                Intent intent184= new Intent(this, Activity_find.class);
                intent184.putExtra("_id", "184");
                startActivity(intent184);break;
            case R.id.text_View185:
                Intent intent185= new Intent(this, Activity_find.class);
                intent185.putExtra("_id", "185");
                startActivity(intent185);break;
            case R.id.text_View186:
                Intent intent186= new Intent(this, Activity_find.class);
                intent186.putExtra("_id", "186");
                startActivity(intent186);break;
            case R.id.text_View187:
                Intent intent187= new Intent(this, Activity_find.class);
                intent187.putExtra("_id", "187");
                startActivity(intent187);break;
            case R.id.text_View188:
                Intent intent188= new Intent(this, Activity_find.class);
                intent188.putExtra("_id", "188");
                startActivity(intent188);break;
            case R.id.text_View189:
                Intent intent189= new Intent(this, Activity_find.class);
                intent189.putExtra("_id", "189");
                startActivity(intent189);break;
            case R.id.text_View190:
                Intent intent190= new Intent(this, Activity_find.class);
                intent190.putExtra("_id", "190");
                startActivity(intent190);break;
            case R.id.text_View191:
                Intent intent191= new Intent(this, Activity_find.class);
                intent191.putExtra("_id", "191");
                startActivity(intent191);break;
            case R.id.text_View192:
                Intent intent192= new Intent(this, Activity_find.class);
                intent192.putExtra("_id", "192");
                startActivity(intent192);break;
            case R.id.text_View193:
                Intent intent193= new Intent(this, Activity_find.class);
                intent193.putExtra("_id", "193");
                startActivity(intent193);break;
            case R.id.text_View194:
                Intent intent194= new Intent(this, Activity_find.class);
                intent194.putExtra("_id", "194");
                startActivity(intent194);break;
            case R.id.text_View195:
                Intent intent195= new Intent(this, Activity_find.class);
                intent195.putExtra("_id", "195");
                startActivity(intent195);break;
            case R.id.text_View196:
                Intent intent196= new Intent(this, Activity_find.class);
                intent196.putExtra("_id", "196");
                startActivity(intent196);break;
            case R.id.text_View197:
                Intent intent197= new Intent(this, Activity_find.class);
                intent197.putExtra("_id", "197");
                startActivity(intent197);break;
            case R.id.text_View198:
                Intent intent198= new Intent(this, Activity_find.class);
                intent198.putExtra("_id", "198");
                startActivity(intent198);break;
            case R.id.text_View199:
                Intent intent199= new Intent(this, Activity_find.class);
                intent199.putExtra("_id", "199");
                startActivity(intent199);break;
            case R.id.text_View200:
                Intent intent200= new Intent(this, Activity_find.class);
                intent200.putExtra("_id", "200");
                startActivity(intent200);break;
            case R.id.text_View201:
                Intent intent201= new Intent(this, Activity_find.class);
                intent201.putExtra("_id", "201");
                startActivity(intent201);break;
            case R.id.text_View202:
                Intent intent202= new Intent(this, Activity_find.class);
                intent202.putExtra("_id", "202");
                startActivity(intent202);break;
            case R.id.text_View203:
                Intent intent203= new Intent(this, Activity_find.class);
                intent203.putExtra("_id", "203");
                startActivity(intent203);break;
            case R.id.text_View204:
                Intent intent204= new Intent(this, Activity_find.class);
                intent204.putExtra("_id", "204");
                startActivity(intent204);break;
            case R.id.text_View205:
                Intent intent205= new Intent(this, Activity_find.class);
                intent205.putExtra("_id", "205");
                startActivity(intent205);break;
            case R.id.text_View206:
                Intent intent206= new Intent(this, Activity_find.class);
                intent206.putExtra("_id", "206");
                startActivity(intent206);break;
            case R.id.text_View207:
                Intent intent207= new Intent(this, Activity_find.class);
                intent207.putExtra("_id", "207");
                startActivity(intent207);break;
            case R.id.text_View208:
                Intent intent208= new Intent(this, Activity_find.class);
                intent208.putExtra("_id", "208");
                startActivity(intent208);break;
            case R.id.text_View209:
                Intent intent209= new Intent(this, Activity_find.class);
                intent209.putExtra("_id", "209");
                startActivity(intent209);break;
            case R.id.text_View210:
                Intent intent210= new Intent(this, Activity_find.class);
                intent210.putExtra("_id", "210");
                startActivity(intent210);break;
            case R.id.text_View211:
                Intent intent211= new Intent(this, Activity_find.class);
                intent211.putExtra("_id", "211");
                startActivity(intent211);break;
            case R.id.text_View212:
                Intent intent212= new Intent(this, Activity_find.class);
                intent212.putExtra("_id", "212");
                startActivity(intent212);break;
            case R.id.text_View213:
                Intent intent213= new Intent(this, Activity_find.class);
                intent213.putExtra("_id", "213");
                startActivity(intent213);break;
            case R.id.text_View214:
                Intent intent214= new Intent(this, Activity_find.class);
                intent214.putExtra("_id", "214");
                startActivity(intent214);break;
            case R.id.text_View215:
                Intent intent215= new Intent(this, Activity_find.class);
                intent215.putExtra("_id", "215");
                startActivity(intent215);break;
            case R.id.text_View216:
                Intent intent216= new Intent(this, Activity_find.class);
                intent216.putExtra("_id", "216");
                startActivity(intent216);break;
            case R.id.text_View217:
                Intent intent217= new Intent(this, Activity_find.class);
                intent217.putExtra("_id", "217");
                startActivity(intent217);break;
            case R.id.text_View218:
                Intent intent218= new Intent(this, Activity_find.class);
                intent218.putExtra("_id", "218");
                startActivity(intent218);break;
            case R.id.text_View219:
                Intent intent219= new Intent(this, Activity_find.class);
                intent219.putExtra("_id", "219");
                startActivity(intent219);break;
            case R.id.text_View220:
                Intent intent220= new Intent(this, Activity_find.class);
                intent220.putExtra("_id", "220");
                startActivity(intent220);break;
            case R.id.text_View221:
                Intent intent221= new Intent(this, Activity_find.class);
                intent221.putExtra("_id", "221");
                startActivity(intent221);break;
            case R.id.text_View222:
                Intent intent222= new Intent(this, Activity_find.class);
                intent222.putExtra("_id", "222");
                startActivity(intent222);break;
            case R.id.text_View223:
                Intent intent223= new Intent(this, Activity_find.class);
                intent223.putExtra("_id", "223");
                startActivity(intent223);break;
            case R.id.text_View224:
                Intent intent224= new Intent(this, Activity_find.class);
                intent224.putExtra("_id", "224");
                startActivity(intent224);break;
            case R.id.text_View225:
                Intent intent225= new Intent(this, Activity_find.class);
                intent225.putExtra("_id", "225");
                startActivity(intent225);break;
            case R.id.text_View226:
                Intent intent226= new Intent(this, Activity_find.class);
                intent226.putExtra("_id", "226");
                startActivity(intent226);break;
            case R.id.text_View227:
                Intent intent227= new Intent(this, Activity_find.class);
                intent227.putExtra("_id", "227");
                startActivity(intent227);break;
            case R.id.text_View228:
                Intent intent228= new Intent(this, Activity_find.class);
                intent228.putExtra("_id", "228");
                startActivity(intent228);break;
            case R.id.text_View229:
                Intent intent229= new Intent(this, Activity_find.class);
                intent229.putExtra("_id", "229");
                startActivity(intent229);break;
            case R.id.text_View230:
                Intent intent230= new Intent(this, Activity_find.class);
                intent230.putExtra("_id", "230");
                startActivity(intent230);break;
            case R.id.text_View231:
                Intent intent231= new Intent(this, Activity_find.class);
                intent231.putExtra("_id", "231");
                startActivity(intent231);break;
            case R.id.text_View232:
                Intent intent232= new Intent(this, Activity_find.class);
                intent232.putExtra("_id", "232");
                startActivity(intent232);break;
            case R.id.text_View233:
                Intent intent233= new Intent(this, Activity_find.class);
                intent233.putExtra("_id", "233");
                startActivity(intent233);break;
            case R.id.text_View234:
                Intent intent234= new Intent(this, Activity_find.class);
                intent234.putExtra("_id", "234");
                startActivity(intent234);break;
            case R.id.text_View235:
                Intent intent235= new Intent(this, Activity_find.class);
                intent235.putExtra("_id", "235");
                startActivity(intent235);break;
            case R.id.text_View236:
                Intent intent236= new Intent(this, Activity_find.class);
                intent236.putExtra("_id", "236");
                startActivity(intent236);break;
            case R.id.text_View237:
                Intent intent237= new Intent(this, Activity_find.class);
                intent237.putExtra("_id", "237");
                startActivity(intent237);break;
            case R.id.text_View238:
                Intent intent238= new Intent(this, Activity_find.class);
                intent238.putExtra("_id", "238");
                startActivity(intent238);break;
            case R.id.text_View239:
                Intent intent239= new Intent(this, Activity_find.class);
                intent239.putExtra("_id", "239");
                startActivity(intent239);break;
            case R.id.text_View240:
                Intent intent240= new Intent(this, Activity_find.class);
                intent240.putExtra("_id", "240");
                startActivity(intent240);break;
            case R.id.text_View241:
                Intent intent241= new Intent(this, Activity_find.class);
                intent241.putExtra("_id", "241");
                startActivity(intent241);break;
            case R.id.text_View242:
                Intent intent242= new Intent(this, Activity_find.class);
                intent242.putExtra("_id", "242");
                startActivity(intent242);break;
            case R.id.text_View243:
                Intent intent243= new Intent(this, Activity_find.class);
                intent243.putExtra("_id", "243");
                startActivity(intent243);break;
            case R.id.text_View244:
                Intent intent244= new Intent(this, Activity_find.class);
                intent244.putExtra("_id", "244");
                startActivity(intent244);break;
            case R.id.text_View245:
                Intent intent245= new Intent(this, Activity_find.class);
                intent245.putExtra("_id", "245");
                startActivity(intent245);break;





            default:
                break;
        }
    }

    private void showToast(String Message) {

        Toast toast = Toast.makeText(getApplicationContext(), Message, Toast.LENGTH_SHORT);
        toast.show();
    }
}
