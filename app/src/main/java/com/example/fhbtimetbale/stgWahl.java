package com.example.fhbtimetbale;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import com.example.fhbtimetbale.DRVinterface.LoadMore;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import stgundfb.StaticRvAdapter;
import stgundfb.StativRvModel;

public class stgWahl extends AppCompatActivity {

    private RecyclerView recyclerView;
    private StaticRvAdapter staticRvAdapter;

    List<DynamicRVModel> items = new ArrayList();
    DynamicRVAdapter dynamicRVAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stg_wahl);

        ArrayList<StativRvModel> item = new ArrayList<>();
        item.add(new StativRvModel(R.drawable.mathbiall, "Ingenieurwissenschaften und Mathematik - Allgemein Bielefeld"));
        item.add(new StativRvModel(R.drawable.mathbiv, "Ingenieurwissenschaften und Mathematik - Verbund Bielefeld"));
        item.add(new StativRvModel(R.drawable.mathg, "Ingenieurwissenschaften und Mathematik - Gütersloh"));
        item.add(new StativRvModel(R.drawable.wirtschaft, "Wirtschaft"));
        item.add(new StativRvModel(R.drawable.social, "Sozialwesen"));
        item.add(new StativRvModel(R.drawable.gestaltung, "Gestaltung"));
        item.add(new StativRvModel(R.drawable.healthcare, "Pflege und Gesundheit"));

        recyclerView =findViewById(R.id.recyclerView);
        staticRvAdapter = new StaticRvAdapter(item);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setAdapter(staticRvAdapter);


        items.add(new DynamicRVModel("Ingenieurinformatik"));
        items.add(new DynamicRVModel("Ingenieurinformatik"));
        items.add(new DynamicRVModel("Ingenieurinformatik"));
        items.add(new DynamicRVModel("Ingenieurinformatik"));
        items.add(new DynamicRVModel("Ingenieurinformatik"));
        items.add(new DynamicRVModel("Ingenieurinformatik"));
        items.add(new DynamicRVModel("Ingenieurinformatik"));
        items.add(new DynamicRVModel("Ingenieurinformatik"));
        items.add(new DynamicRVModel("Ingenieurinformatik"));
        items.add(new DynamicRVModel("Ingenieurinformatik"));
        items.add(new DynamicRVModel("Ingenieurinformatik"));
        items.add(new DynamicRVModel("Ingenieurinformatik"));
        items.add(new DynamicRVModel("Ingenieurinformatik"));
        items.add(new DynamicRVModel("Ingenieurinformatik"));
        items.add(new DynamicRVModel("Ingenieurinformatik"));
        items.add(new DynamicRVModel("Ingenieurinformatik"));

        RecyclerView drv = findViewById(R.id.recyclerView2);
        drv.setLayoutManager(new LinearLayoutManager(this));
        dynamicRVAdapter = new DynamicRVAdapter(drv, this,items);
        drv.setAdapter(dynamicRVAdapter);

        dynamicRVAdapter.setLoadMore(new LoadMore() {
            @Override
            public void onLoadMore() {
                if (items.size()<=10){
                    item.add(null);
                    dynamicRVAdapter.notifyItemInserted(item.size()-1);
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            items.remove(items.size()-1);
                            dynamicRVAdapter.notifyItemRemoved(items.size());

                            int index = items.size();
                            int end = index+10;
                            for (int i=index; i<end; i++){
                                String name = UUID.randomUUID().toString();
                                DynamicRVModel item = new DynamicRVModel(name);
                                items.add(item);
                            }
                            dynamicRVAdapter.notifyDataSetChanged();
                            dynamicRVAdapter.setLoaded();
                        }
                    }, 4000);
                }
                else
                    Toast.makeText(stgWahl.this, "Data Completed", Toast.LENGTH_SHORT).show();
            }
        });

    }
}