package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

//import android.widget.*;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private TextView textView;
    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
//        for only one line method
//        button.setOnClickListener(view -> Toast.makeText(MainActivity.this, "Hi Click Listener Worked", Toast.LENGTH_SHORT).show());

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Thanks for using the App", Toast.LENGTH_SHORT).show();
                String s = editText.getText().toString();  //taking the value as String
                int a = Integer.parseInt(s);
                double pound = a * 2.20462;
                textView.setText("The value in pound is : " + pound);
            }
        });
    }
//    using onClick attribute in xml
//    public void showToast(View view){
//        Toast.makeText(MainActivity.this, "Hi Click Listener Worked", Toast.LENGTH_SHORT).show();
//    }
}