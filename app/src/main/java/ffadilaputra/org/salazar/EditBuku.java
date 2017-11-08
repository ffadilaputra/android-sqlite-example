package ffadilaputra.org.salazar;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import ffadilaputra.org.salazar.model.Buku;

/**
 * Created by ffadilaputra on 07/11/2017.
 */

public class EditBuku extends AppCompatActivity {

    EditText txtJudulUpd,txtISBNUpd,txtPenerbitUpd;
    Button btnUpdate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_buku);

        Intent i = getIntent();
        final Long idBuku = i.getLongExtra("idBuku",0L);
        Buku detailBuku = Buku.findById(Buku.class,idBuku);

        btnUpdate      = (Button)findViewById(R.id.btnUpdate);
        txtJudulUpd    = (EditText)findViewById(R.id.edtJudul);
        txtISBNUpd     = (EditText)findViewById(R.id.edtISBN);
        txtPenerbitUpd = (EditText)findViewById(R.id.edtPenerbit);

        txtJudulUpd.setText(detailBuku.getJudul());
        txtISBNUpd.setText(detailBuku.getISBN());
        txtPenerbitUpd.setText(detailBuku.getPenerbit());

        btnUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Buku  buku = Buku.findById(Buku.class,idBuku);
                buku.setJudul(txtJudulUpd.getText().toString());
                buku.setISBN(txtISBNUpd.getText().toString());
                buku.setPenerbit(txtPenerbitUpd.getText().toString());
                buku.save();
                Snackbar uhuy = Snackbar.make(findViewById(R.id.edit_layout),"Data Berhasil Di Update",Snackbar.LENGTH_SHORT);
                uhuy.show();
            }
        });

    }
}
