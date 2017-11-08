package ffadilaputra.org.salazar.model;

import com.orm.SugarRecord;

/**
 * Created by ffadilaputra on 07/11/17.
 */

public class Kategori extends SugarRecord<Kategori> {

    public Kategori(){

    }

    public Kategori(String namaKategori) {
        this.namaKategori = namaKategori;
    }

    public String getNamaKategori() {
        return namaKategori;
    }

    public void setNamaKategori(String namaKategori) {
        this.namaKategori = namaKategori;
    }

    public String namaKategori;


}
