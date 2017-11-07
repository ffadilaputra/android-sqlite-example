package ffadilaputra.org.salazar.model;

import com.orm.SugarRecord;

/**
 * Created by ffadilaputra on 07/11/2017.
 */

public class Buku extends SugarRecord<Buku> {

    public String judul;
    public String ISBN;
    public String penerbit;

    public Buku(){

    }

    public Buku(String judul, String ISBN, String penerbit) {
        this.judul = judul;
        this.ISBN = ISBN;
        this.penerbit = penerbit;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }
}
