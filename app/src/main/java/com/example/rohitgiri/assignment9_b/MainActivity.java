package com.example.rohitgiri.assignment9_b;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView mtextview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar();

        //connecting mtextview object to layout textview
        mtextview=(TextView)findViewById(R.id.text);
    }

    //method getting called option menu on call of activity
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);
        return true;
    }

    //method getting called on selection of particular menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.computer)
        {
            //printing the toast message on selecting option computer
            Toast.makeText(MainActivity.this,"You clicked on Computer",Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.gamepad)
        {
            //printing the toast message on selecting option Gamepad
            Toast.makeText(MainActivity.this,"You clicked on Gamepad",Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.camera)
        {
            //printing the toast message on selecting option Camera
            Toast.makeText(MainActivity.this,"You clicked on Camera",Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.video)
        {
            //printing the toast message on selecting option Video
            Toast.makeText(MainActivity.this,"You clicked on Video",Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.email)
        {
            //printing the toast message on selecting option Email
            Toast.makeText(MainActivity.this,"You clicked on Email",Toast.LENGTH_SHORT).show();
        }
        if(id==R.id.device)
        {
            //printing the toast message on selecting option device icon
            Toast.makeText(MainActivity.this,"You clicked on Device icon",Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
