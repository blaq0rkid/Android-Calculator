package com.example.kelley.calculator;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends Activity implements View.OnClickListener {

    EditText editText_first_number;
    EditText getEditText_second_number;

    Button button_add;
    Button button_sub;
    Button button_mul;
    Button button_div;

    TextView textView_result
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);

        editText_first_number = (EditText) findViewById(R.id.editText_first_number);
        editText_second_number = (EditText) findViewById(R.id.editText_second_number);

        button_add = (Button) findViewById(R.id.button_add);
        button_add.setOnClickListener(this);

        button_sub = (Button) findViewById(R.id.button_sub);
        button_sub.setOnClickListener(this);

        button_mul = (Button) findViewById(R.id.button_mul);
        button_mul.setOnClickListener(this);

        button_div = (Button) findViewById(R.id.button_div);
        button_div.setOnClickListener(this);

        textView_result = (TextView) findViewById(R.id.textView_result);

    }

    @Override
    public void onClick(View v) {
        int num1 = Integer.parseInt(editText_first_number.getText().toString());
        int num2 = Integer.parseInt(getEditText_second_number.getText().toString());
        int result = 0;
        switch (v.getId()) {
            case R.id.button_add:
                result = num1 + num2;
                break;
            case R.id.button_sub:
                result = Math.abs(num1 - num2);
                break;
            case R.id.button_mul:
                result = Math.abs(num1 * num2);
                break;
            case R.id.button_div:
                if (num2 != 0) {
                    result = Math.abs(num1 / num2);
                } else {
                    Toast.makeText(getBaseContext(), "Second number Should not be zero",
                            Toast.LENGTH_LONG).show();
                }
                ;
                break;
        }
        textView_result.setText("Result " + result);
    }

}

