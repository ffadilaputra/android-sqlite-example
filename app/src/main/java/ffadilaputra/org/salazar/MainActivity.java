package ffadilaputra.org.salazar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import ffadilaputra.org.salazar.adapter.BukuAdapter;
import ffadilaputra.org.salazar.model.Buku;

public class MainActivity extends AppCompatActivity {

    private BukuAdapter mBukuAdapter;
    private List<Buku> mDaftarBuku = new ArrayList<>();
    private Button btnAdd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_buku);
        mDaftarBuku = Buku.listAll(Buku.class);

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerBuku);
        recyclerView.setHasFixedSize(true);
        mBukuAdapter = new BukuAdapter(getApplicationContext(),mDaftarBuku);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mBukuAdapter);
        mBukuAdapter.notifyDataSetChanged();

        btnAdd = (Button)findViewById(R.id.tmbh_buku);

        btnAdd.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),TambahBuku.class);
                startActivity(i);
            }
        });

    }
}
