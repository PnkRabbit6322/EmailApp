package com.example.emailapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    List<itemModel> items;
    Faker faker = new Faker();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        items = new ArrayList<>();
        for(int i = 0; i < 20; i++)
        {
            items.add(new itemModel(faker.name().firstName(),
                    faker.lorem().sentence(3,4),
                    faker.lorem().sentence(6,8),
                    faker.date().future(1, TimeUnit.HOURS).toString()));
        }

        ItemAdapter adapter = new ItemAdapter(items);

        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}