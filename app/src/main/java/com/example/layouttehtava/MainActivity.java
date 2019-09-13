package com.example.layouttehtava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // assign buttons
    Button Button1;
    Button Button2;
    Button Button3;

    // assign the image
    ImageView Image;

    // let's make a boolean to check if the button 1 is toggled
    boolean Buttonsdisabled = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // find buttons
        Button1 = (Button) findViewById(R.id.Button1);
        Button2 = (Button) findViewById(R.id.Button2);
        Button3 = (Button) findViewById(R.id.Button3);

        // find image
        Image = (ImageView) findViewById(R.id.imageView);

        // set onclicklisteners
        Button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // if button 1 is toggled...
                if (Buttonsdisabled == true){
                    // make it false
                    Buttonsdisabled = false;
                    // and inform the user
                    Toast.makeText(getApplicationContext(),"Buttons are available!", Toast.LENGTH_SHORT)
                            .show();
                } // if end
                // if button 1 is not toggled...
                else{
                    // make it true
                    Buttonsdisabled = true;
                    // and inform the user
                    Toast.makeText(getApplicationContext(),"Buttons are disabled!", Toast.LENGTH_SHORT)
                            .show();
                } // else end
            }
        }); // Button1 onclicklistener end

        Button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // if buttons are disable
                if (Buttonsdisabled == true) {
                    Toast.makeText(getApplicationContext(), "Buttons are disabled!", Toast.LENGTH_SHORT)
                            .show();
                } //if end
                // if buttons are available
                else {
                    Image.setVisibility(view.GONE);
                }

            }
        }); // Button2 onclicklistener end

        Button3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                // if buttons are disable
                if (Buttonsdisabled == true){
                    Toast.makeText(getApplicationContext(),"Buttons are disabled!", Toast.LENGTH_SHORT)
                            .show();
                } // if end
                // if buttons are available
                else {
                    Image.setVisibility(view.VISIBLE);
                } // else end
                return true;
            }
        }); // Button3 onclicklistener end


    }
}
