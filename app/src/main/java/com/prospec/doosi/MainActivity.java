package com.prospec.doosi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioGroup redLandBuilding = findViewById(R.id.redLandBuilding);
        RadioButton radio1 = findViewById(R.id.radio1);
        TextView textView1 = findViewById(R.id.textView1);
        EditText EditText1 = findViewById(R.id.EditText1);
        TextView textView2 = findViewById(R.id.textView2);
        EditText EditText2 = findViewById(R.id.EditText2);
        TextView textView3 = findViewById(R.id.textView3);
        EditText EditText3 = findViewById(R.id.EditText3);
        CheckBox checkboxYes = findViewById(R.id.checkboxYes);
        TextView textView4 = findViewById(R.id.textView4);
        CheckBox checkbox1 = findViewById(R.id.checkbox1);
        EditText EditText4 = findViewById(R.id.EditText4);
        CheckBox checkbox2 = findViewById(R.id.checkbox2);
        EditText EditText5 = findViewById(R.id.EditText5);
        CheckBox checkbox3 = findViewById(R.id.checkbox3);
        EditText EditText6 = findViewById(R.id.EditText6);
        CheckBox checkboxNo = findViewById(R.id.checkboxNo);
        RadioGroup radRabob = findViewById(R.id.radRabob);
        RadioButton radio2 = findViewById(R.id.radio2);
        TextView textView5 = findViewById(R.id.textView5);
        CheckBox checkboxMee = findViewById(R.id.checkboxMee);
        CheckBox checkboxMaiMee = findViewById(R.id.checkboxMaiMee);
        EditText EditText7 = findViewById(R.id.EditText7);
        TextView textView6 = findViewById(R.id.textView6);
        CheckBox checkboxMee1 = findViewById(R.id.checkboxMee1);
        Spinner spinner = findViewById(R.id.spinner);
    }
}
