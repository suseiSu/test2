package com.example.myapp;
<<<<<<< HEAD
/*xxxxxxxxxxx*/
=======
/*yyy*/
>>>>>>> dd220d372969859f6534a25f742f5c6c6add1ff8
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button bt = (Button) findViewById(R.id.bt);

    }
}
