package com.example.choosegender;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCheckboxClicked(View view) {
        // Получаем флажок
        CheckBox checkBox = (CheckBox) view;
        // Получаем, отмечен ли данный флажок
        boolean checked = checkBox.isChecked();

        TextView selection = findViewById(R.id.selection);

        CheckBox java = findViewById(R.id.femenin);
        CheckBox kotlin = findViewById(R.id.masculin);

        String selectedText = "";

        if (checkBox.getId() == R.id.femenin) {
            java.setChecked(checked);
            kotlin.setChecked(!checked);
            selectedText = checked ? "Voi ati ales Femenin" : "";
        } else if (checkBox.getId() == R.id.masculin) {
            kotlin.setChecked(checked);
            java.setChecked(!checked);
            selectedText = checked ? "Voi ati ales Masculin" : "";
        }
        selection.setText(selectedText);
    }


}