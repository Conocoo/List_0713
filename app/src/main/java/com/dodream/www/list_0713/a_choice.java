package com.dodream.www.list_0713;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.SparseBooleanArray;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class a_choice extends AppCompatActivity {

    Button button;
    ListView listView;
    ArrayAdapter<String> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_choice);

        listView = (ListView) findViewById(R.id.ch_list);
        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_multiple_choice);
        listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
//        arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_single_choice);
//        listView.setChoiceMode(AbsListView.CHOICE_MODE_SINGLE);
        listView.setAdapter(arrayAdapter);
        arrayAdapter.addAll(getResources().getStringArray(R.array.items));
        listView.setItemChecked(2, true);

        init_btn();
    }

    private void init_btn() {
        button = (Button) findViewById(R.id.ch_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (arrayAdapter.getCount() == 0) return;
                if (listView.getChoiceMode() == ListView.CHOICE_MODE_SINGLE) {
                    int i = listView.getCheckedItemPosition();
                    arrayAdapter.remove((String) listView.getItemAtPosition(i));
                } else if (listView.getChoiceMode() == ListView.CHOICE_MODE_MULTIPLE) {
                    SparseBooleanArray array = listView.getCheckedItemPositions();
                    List<String> relist = new ArrayList<>();
                    for (int idx = 0; idx < array.size(); idx++) {
                        int key = array.keyAt(idx);
                        if (array.get(key)) {
                            String s = (String) listView.getItemAtPosition(key);
                            relist.add(s);
                        }
                    }

                    for (String s : relist) {
                        arrayAdapter.remove(s);
                    }
                }
            }
        });
    }
}
