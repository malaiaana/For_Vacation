package com.example.forvacation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class GeneralPage extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_page);

        // получаем экземпляр элемента ListView
       listView = findViewById(R.id.list);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,
                getResources().getStringArray(R.array.sightseeing_greece));
                listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, itemClicked, position, id) -> {

            Intent intent = new Intent(GeneralPage.this, SearchResultPage.class);
            intent.putExtra("position", position);
            startActivity(intent);

        });
    }
}