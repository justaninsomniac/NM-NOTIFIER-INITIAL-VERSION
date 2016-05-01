package com.example.shubham.demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.MenuItem;
import android.content.Intent;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }



    public void openNewActivity(View view)
    {

        Intent intent=new Intent(this,NewActivity.class);
        startActivity(intent);


    }
    public void openmain1(View view)
    {

        Intent intent=new Intent(this,main1.class);
        startActivity(intent);


    }
    public void opencredit(View view)
    {

        Intent intent=new Intent(this,credit.class);
        startActivity(intent);


    }
    public void openabout(View view)
    {

        Intent intent=new Intent(this,about.class);
        startActivity(intent);


    }
    public void openhostel(View view)
    {

        Intent intent=new Intent(this,hosteln.class);
        startActivity(intent);


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


        return super.onOptionsItemSelected(item);
    }
}
