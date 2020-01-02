package com.example.optionmenu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.android:
                Toast.makeText(this, "Android selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.java:
                Toast.makeText(this, "Java selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.html:
                Toast.makeText(this, "HTML selected", Toast.LENGTH_SHORT).show();
                break;
            case R.id.css:
                Toast.makeText(this, "CSS Selected", Toast.LENGTH_SHORT).show();
                break;
        }


        return super.onOptionsItemSelected(item);
    }
}
