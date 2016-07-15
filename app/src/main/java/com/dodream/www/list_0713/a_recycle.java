package com.dodream.www.list_0713;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.dodream.www.list_0713.data.person;

import java.util.Random;

public class a_recycle extends AppCompatActivity {

    RecyclerView recyclerView;
    ada_recycle mada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_recycle);
        recyclerView = (RecyclerView) findViewById(R.id.rv_list);
        mada = new ada_recycle();
        recyclerView.setAdapter(mada);

        GridLayoutManager manager =
                new GridLayoutManager(this, 2, GridLayoutManager.HORIZONTAL, false);
        recyclerView.setLayoutManager(manager);

        initDate();
    }

    private void initDate() {
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            person p = new person();
            p.setName("name " + i);
            p.setAge(20 + r.nextInt(30));
            p.setPhoto(ContextCompat.getDrawable(this, R.drawable.lyk));
            mada.add(p);
        }
    }
}
