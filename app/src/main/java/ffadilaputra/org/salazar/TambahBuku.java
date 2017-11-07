package ffadilaputra.org.salazar;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import ffadilaputra.org.salazar.model.Buku;

/**
 * Created by wirasyafri on 07/11/2017.
 */

public class TambahBuku extends AppCompatActivity {

    EditText txtJudul,txtPenerbit,txtISBN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tambah_buku);

        Button btnSubmit = (Button) findViewById(R.id.submit);
        txtJudul = (EditText) findViewById(R.id.judul);
        txtJudul.requestFocus();
        txtISBN = (EditText) findViewById(R.id.isbn);
        txtPenerbit = (EditText) findViewById(R.id.penerbit);

        btnSubmit.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Buku mBuku = new Buku(txtJudul.getText().toString(),txtISBN.getText().toString(),txtPenerbit.getText().toString());
                mBuku.save();
                txtJudul.setText("");
                txtISBN.setText("");
                txtPenerbit.setText("");

//                Snackbar mySnackbar = Snackbar.make(findViewById(R.id.test),"Data Berhasil Disimpan",Snackbar.LENGTH_SHORT);
//                mySnackbar.show();

            }
        });
    }
}
