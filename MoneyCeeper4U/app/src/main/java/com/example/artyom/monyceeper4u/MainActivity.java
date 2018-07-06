package com.example.artyom.monyceeper4u;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText editText;
    Button button;
    TextView textView3;
    TextView textView5;
    TextView textView7;
    TextView textView9;
    TextView textView11;
    TextView textView13;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
        button = (Button) findViewById(R.id.button);
        textView3 = (TextView) findViewById(R.id.textView3);
        textView5 = (TextView) findViewById(R.id.textView5);
        textView7 = (TextView) findViewById(R.id.textView7);
        textView9 = (TextView) findViewById(R.id.textView9);
        textView11 = (TextView) findViewById(R.id.textView11);
        textView13 = (TextView) findViewById(R.id.textView13);

        button.setOnClickListener(this);
    }

            @Override
            public void onClick(View v) {
                double N = 0;
                double res = 0.62;
                double res2 = 0.07;
                double res3 = 0.11;
                double res4 = 0.04;
                double res5= 0.13;
                double res6 = 0.03;
                double settxt1 = 0;
                double settxt2 = 0;
                double settxt3 = 0;
                double settxt4 = 0;
                double settxt5 = 0;
                double settxt6 = 0;

                if (TextUtils.isEmpty(editText.getText().toString())) return;

                N = Double.parseDouble(editText.getText().toString());

                switch (v.getId()) {
                    case R.id.button:
                        settxt1 = N*res;
                        settxt2 = N*res2;
                        settxt3 = N*res3;
                        settxt4 = N*res4;
                        settxt5 = N*res5;
                        settxt6 = N*res6;
                        break;
                    default:
                            break;
                }

                textView3.setText(Double.toString(settxt1));
                textView5.setText(Double.toString(settxt2));
                textView7.setText(Double.toString(settxt3));
                textView9.setText(Double.toString(settxt4));
                textView11.setText(Double.toString(settxt5));
                textView13.setText(Double.toString(settxt6));
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
