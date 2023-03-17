package com.example.projecttest1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=findViewById(R.id.edittext);
        button = findViewById(R.id.button);
        listView=findViewById(R.id.listview);


        ArrayList ar = new ArrayList();

        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,ar);
        listView.setAdapter(adapter);

        button.setOnClickListener(i->{
            if(editText.getText().length()>0){
                ar.add(editText.getText().toString());
                adapter.notifyDataSetChanged();
                editText.setText("");
            }else{
                Toast.makeText(this, "list is empty", Toast.LENGTH_SHORT).show();
            }

        });




    }
}