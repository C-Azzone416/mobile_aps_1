package com.ualr.helloworld;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView userMsgTV;
    private EditText userInputET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userMsgTV = findViewById(R.id.userMsgTV);
        userInputET = findViewById(R.id.userInputET);
    }

    public void showTextMessage(View view) {
        String userInput = userInputET.getText().toString();
        if(userInput.equals(" ")) return;
        else {
            userMsgTV.setText(userInput);
        }
    }

    public void clearTextMessage(View view) {
        String blankInput = " ";
        userInputET.setText(blankInput);
    }
}
