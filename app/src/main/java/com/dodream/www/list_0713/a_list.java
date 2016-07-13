package com.dodream.www.list_0713;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class a_list extends AppCompatActivity {

    EditText editText;
    Button button;
    ListView listView;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_list);
        init_f();
        init_list();
        init_btn();
    }

    private void init_f() {
        editText = (EditText) findViewById(R.id.lv_edit);
        button = (Button) findViewById(R.id.lv_btn);
        listView = (ListView) findViewById(R.id.lv_lv);
    }

    private void init_list() {
        adapter = new ArrayAdapter<String>(a_list.this, android.R.layout.simple_list_item_1);
        listView.setAdapter(adapter);
        String[] s = getResources().getStringArray(R.array.items);
        adapter.addAll(s);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String n = (String) adapterView.getItemAtPosition(i);
            }
        });
    }

    private void init_btn() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s = editText.getText().toString();
                adapter.add(s);
                listView.smoothScrollByOffset(adapter.getCount() - 1);
            }
        });
    }

}
