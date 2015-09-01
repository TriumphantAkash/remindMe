package com.remindme.android.remindme.activities;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.remindme.android.remindme.R;


public class AddItemActivity extends ActionBarActivity {

    Button addButton, clearButton;
    EditText editItemName, editQuantity, editDescription;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);

        //Views initialization
        addButton = (Button)findViewById(R.id.button_add);
        clearButton = (Button)findViewById(R.id.button_clear);
        editItemName = (EditText)findViewById(R.id.edit_item_name);
        editQuantity = (EditText)findViewById(R.id.edit_quantity);
        editDescription = (EditText)findViewById(R.id.edit_description);
        spinner = (Spinner)findViewById(R.id.spinner);

        //onclick Listeners for the buttons
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //clear the input data
                editItemName.setText("");
                editQuantity.setText("");
                editDescription.setText("");
                spinner.setSelection(0);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_add_item, menu);
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
