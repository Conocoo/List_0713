package com.dodream.www.list_0713;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.dodream.www.list_0713.data.person;
import com.dodream.www.list_0713.widget.v_person;

public class a_custom extends AppCompatActivity {
    ListView listView;
    ada_custom ada_custom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_custom);
        listView = (ListView) findViewById(R.id.lv_custom);
        ada_custom = new ada_custom();
        ada_custom.setOnAdapterImageClickListener(new ada_custom.OnAdapterImageClickListener() {

            @Override
            public void onAdapterImageClick(ada_custom adapter, v_person view, person person) {
                //작동
            }
        });

        listView.setAdapter(ada_custom);

        init_data();

    }

    private void init_data() {
        person[] persons = new person[20];
        for (int i = 0; i < 20; i++) {
            persons[i] = new person();
            persons[i].setAge(i + 2);
            persons[i].setName("이영균");
            persons[i].setPhoto(ContextCompat.getDrawable(this, R.drawable.lyk));
            ada_custom.add(persons[i]);
        }
    }
}
