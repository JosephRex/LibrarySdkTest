package com.tmcsrex.testmodule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TestActivityDisplay extends AppCompatActivity {

    Button btn;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_display);
        editText = (EditText)findViewById(R.id.editText);
        btn = (Button) findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.getText().toString().trim().equals("")||editText.getText().toString().trim().equals(null)){
                    Toast.makeText(TestActivityDisplay.this,"enter any text",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(TestActivityDisplay.this,editText.getText().toString().trim(),Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}
