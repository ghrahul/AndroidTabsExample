package org.weibeld.example.tabs;

/**
 * Created by rahul on 3/18/2018.
 */

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import org.weibeld.example.R;

public class BugHunter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bughunter);
    }
    public void codejam(View view){
        Intent CodejamIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSede-70APY2pGNwpQKG5yDBK68Mi7j-AnxQ9lUJmDTQqKwFcQ/viewform"));
        startActivity(CodejamIntent);
    }



}
