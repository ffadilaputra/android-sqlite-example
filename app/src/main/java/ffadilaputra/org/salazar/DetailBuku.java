package ffadilaputra.org.salazar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import ffadilaputra.org.salazar.model.Buku;

/**
 * Created by wirasyafri on 07/11/2017.
 */

public class DetailBuku extends AppCompatActivity {

    TextView judulBuku,isbnBuku,penerbitBuku;
    Button btnUpdate,btnDelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_buku);

        Intent i = getIntent();
        final Long idBuku = i.getLongExtra("bukuId",0L);

        Buku detailBuku = Buku.findById(Buku.class,idBuku);
        judulBuku = (TextView)findViewById(R.id.judulBuku);
        judulBuku.setText(detailBuku.getJudul());

        isbnBuku = (TextView)findViewById(R.id.isbnBuku);
        isbnBuku.setText(detailBuku.getISBN());

        penerbitBuku = (TextView)findViewById(R.id.penerbitBuku);
        penerbitBuku.setText(detailBuku.getPenerbit());

        btnUpdate = (Button)findViewById(R.id.edit_buku);

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Buku buku = Buku.findById(Buku.class,idBuku);
                Intent intent = new Intent(v.getContext(),EditBuku.class);
                intent.putExtra("idBuku",buku.getId());
                v.getContext().startActivity(intent);
            }
        });

        btnDelete = (Button)findViewById(R.id.delete_buku);

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Buku buku = Buku.findById(Buku.class,idBuku);
                buku.delete();
                Intent i = new Intent(v.getContext(),MainActivity.class);
                v.getContext().startActivity(i);
            }
        });

    }
}
