package com.example.shubham.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class main1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        Button btn1 = (Button) findViewById(R.id.switch1);
        btn1.setOnClickListener(new View.OnClickListener(){
            
        });
    }
    public void openNewActivity(View view)
    {

        Intent intent=new Intent(this,NewActivity.class);
        startActivity(intent);


    }
    public void openhostel(View view)
    {

        Intent intent=new Intent(this,hosteln.class);
        startActivity(intent);


    }
    public void opensports(View view)
    {

        Intent intent=new Intent(this,sports.class);
        startActivity(intent);


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main1, menu);
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
