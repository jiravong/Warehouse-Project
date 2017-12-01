package com.project.p.warehousefp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class AddActivity extends AppCompatActivity {
    AutoCompleteTextView autoCompleteTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        autoCom();
    }

    public void autoCom() {
        autoCompleteTextView = findViewById(R.id.at_NameProduct);
        ArrayAdapter<String> adapPro = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item,NameProduct);
        autoCompleteTextView.setAdapter(adapPro);
    }

    public static String[] NameProduct = new String[]{"ถุงพลาสติก","หินเจียร์ (GRINGDING)","หินเจียร์แกนสีชมพู 3.0มม","ลูกยางขัดเงา","สกรูตัวหนอนสีดำ ","งพลาสติกa","งพลาสติกb",
    "งพลาสติกasdfghjjjjjjj","งพลาสติกeeeeeee","งพลาสติกqwrqrws0pdgis;dj","asdfakshfdhsflk","asda;skdfwijfwefroiwe","awwerwipet","aqwporfg"
    };

}
