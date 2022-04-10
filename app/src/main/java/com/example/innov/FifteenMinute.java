package com.example.innov;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.provider.Contacts;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.HashMap;
import java.util.Map;

public class FifteenMinute extends AppCompatActivity {
    Button callfambtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fifteen_min_activity);


        callfambtn= (Button) findViewById(R.id.callfamilybtn);
        callfambtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
               /* TODO improvise only favourites list
                String[] projection = new String[] { ContactsContract.Contacts._ID, ContactsContract.Contacts.DISPLAY_NAME, ContactsContract.Contacts.STARRED};
                Map contactMap = new HashMap();
                String selection =ContactsContract.Contacts.STARRED + "=1";
                Cursor cursor = getContentResolver().query(ContactsContract.Contacts.CONTENT_URI, projection, selection,null,null);
                String contactID = cursor.getString(cursor.getColumnIndex(ContactsContract.Contacts._ID));
//                Intent intent = new Intent(Contacts.Intents.UI.LIST_STARRED_ACTION);
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                Uri uri=Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_URI, String.valueOf(contactID));
                callIntent.setData(uri);
                startActivity(callIntent);*/
                Intent intent= new Intent(Intent.ACTION_PICK,  ContactsContract.Contacts.CONTENT_URI);
                startActivityForResult(intent, 1);
            }
        });
    }
}
