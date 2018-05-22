package com.taruc.activityresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editText;
    private Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        buttonSubmit = findViewById(R.id.buttonSubmit);
        editText = findViewById(R.id.editText);

        buttonSubmit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        //grab text from editText
        String message = editText.getText().toString();

        Intent intent = new Intent();
        intent.putExtra("key", message);

        setResult(0, intent);
        finish();


    }
}
