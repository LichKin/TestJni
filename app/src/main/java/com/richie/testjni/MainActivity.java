package com.richie.testjni;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){
        JNIUtils jniUtils = new JNIUtils();
        TextView txtHello = (TextView) findViewById(R.id.txt_hello);
        txtHello.setText(jniUtils.getString());
    }
}
