package com.androidexample.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView todos;
    EditText etTodo;
    Button btnAdd;
    ArrayList list = new ArrayList();
    Teachers teachers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etTodo = findViewById(R.id.etTodo);
        btnAdd = findViewById(R.id.btnAdd);
        todos = findViewById(R.id.rvList);
        todos.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

         teachers = new Teachers(list);
        todos.setAdapter(teachers);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            
            public void onClick(View v) {
                String todo = String.valueOf(etTodo.getText());
                list.add(todo);
                teachers.notifyDataSetChanged();
            }
        });


    }
}
