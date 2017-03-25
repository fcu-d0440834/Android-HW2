package com.example.frank.homework;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class HELLO extends AppCompatActivity {

    private Button submit;
    private EditText input;
    private View.OnClickListener result = new View.OnClickListener(){
        @Override
        public void onClick(View v){
            String input_str = input.getText().toString();


            Toast t = Toast.makeText(HELLO.this,"Hello  "+input_str, Toast. LENGTH_LONG);
            t.show();
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        submit = (Button)findViewById(R.id.bt_submit);
        input = (EditText)findViewById(R.id.et_input);
        submit.setOnClickListener(result);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_hello, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch(item.getItemId()) {

            case R.id.action_about:
                AlertDialog.Builder ad = new AlertDialog.Builder(this);
                ad.setTitle("關於本程式");
                ad.setMessage("作者:D0440834 吳承翰");

                DialogInterface.OnClickListener listener = new DialogInterface.OnClickListener(){
                    public void onClick(DialogInterface di, int i){
                    }
                };
                ad.setPositiveButton("確定", listener);
                ad.show();
                break;
            case R.id.action_reset:
                input.setText("");
                break;

        }
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
