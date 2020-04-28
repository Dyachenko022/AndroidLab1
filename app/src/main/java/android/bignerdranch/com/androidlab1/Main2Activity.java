package android.bignerdranch.com.androidlab1;

import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class Main2Activity extends AppCompatActivity {
    private Adapter adapter;
    private RecyclerView imageList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main2);
        imageList = findViewById(R.id.recycler);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this );
        imageList.setLayoutManager(layoutManager);
        imageList.setHasFixedSize(true);

        adapter = new Adapter(1000000);
        imageList.setAdapter(adapter);
    }

}
