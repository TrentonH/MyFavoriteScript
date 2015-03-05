package com.example.trenton.myfavoritescript;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class FavoiteScripture extends ActionBarActivity {

    public final static String EXTRA_MESSAGE = "my first app";

    public void share(View view){

    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayScript.class);
        EditText book = (EditText) findViewById(R.id.bookInput);
        EditText chapter = (EditText) findViewById(R.id.chapterInput);
        EditText verse = (EditText) findViewById(R.id.verseInput);

        String message = "your favorite scripture is ";
        message += book.getText().toString();
        message += chapter.getText().toString();
        message += ":";
         message += verse.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoite_scripture);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_favoite_scripture, menu);
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
