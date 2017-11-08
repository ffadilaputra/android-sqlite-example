package ffadilaputra.org.salazar.model;

import com.orm.SugarRecord;

/**
 * Created by ffadilaputra on 08/11/2017.
 */

public class Movies extends SugarRecord <Movies>{

    public String movieName;
    public String synopsys;
    public String director;

    public Movies(){

    }

    public Movies(String movieName, String synopsys, String director) {
        this.movieName = movieName;
        this.synopsys = synopsys;
        this.director = director;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getSynopsys() {
        return synopsys;
    }

    public void setSynopsys(String synopsys) {
        this.synopsys = synopsys;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
