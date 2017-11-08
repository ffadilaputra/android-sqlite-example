package ffadilaputra.org.salazar.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import ffadilaputra.org.salazar.R;
import ffadilaputra.org.salazar.model.Movies;

/**
 * Created by ffadilaputra on 08/11/2017.
 */

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MyViewHolder>{

    private List<Movies> movieList;

    public MovieAdapter(List<Movies> movieList){
        this.movieList = movieList;
    }

    @Override
    public MovieAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_list_row,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MovieAdapter.MyViewHolder holder, int position) {
        Movies movies = movieList.get(position);
        holder.txtMovieName.setText(movies.getMovieName());
        holder.txtSynopsys.setText(movies.getSynopsys());
        holder.txtDirector.setText(movies.getDirector());
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        public TextView txtMovieName,txtSynopsys,txtDirector;

        public MyViewHolder(View itemView) {
            super(itemView);
            txtMovieName = (TextView)itemView.findViewById(R.id.title);
            txtSynopsys  = (TextView)itemView.findViewById(R.id.synopsys);
            txtDirector  = (TextView)itemView.findViewById(R.id.director);
        }
    }

}
