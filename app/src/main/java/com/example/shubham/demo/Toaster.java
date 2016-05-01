package com.example.shubham.demo;

/**
 * Created by DELL3542 on 4/28/2016.
 */
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Toaster extends Activity {

    public void myClickHandler(View v){
        Button but=(Button)findViewById(R.id.switch1);
        but.isClickable();
        switch(v.getId()){
            case R.id.switch1:
                if(but.isPressed()){
                    Toast toast=Toast.makeText(this, "Your notifications have been muted", Toast.LENGTH_LONG);
                    toast.show();
                }
                else but.setText("Nothing happened");
                break;
        }
    }
}
