package cubex.mahesh.recyclerview_cardviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
        RecyclerView rview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rview = findViewById(R.id.rview);

        LinearLayoutManager lManager =
                new LinearLayoutManager(this,
                    LinearLayoutManager.VERTICAL,
                        false    );
        rview.setLayoutManager(lManager);
        rview.setAdapter(new MyAdapter(this));
    }
}
