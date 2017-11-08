package ffadilaputra.org.salazar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

import ffadilaputra.org.salazar.adapter.MovieAdapter;
import ffadilaputra.org.salazar.model.Movies;

/**
 * Created by mkhamdank on 08/11/2017.
 */

public class MovieActivity extends AppCompatActivity {

    private List<Movies> moviesList = new ArrayList<>();
    private RecyclerView recyclerView;
    private MovieAdapter movieAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movie_list_row);

        //Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);

        recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        movieAdapter = new MovieAdapter(moviesList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(this,LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(movieAdapter);
        movieAdapter.notifyDataSetChanged();

        cobaData();

    }

    private void cobaData(){
        Movies movies = new Movies("Star Wars Last Jedi","Awesomeness","Bane");
        moviesList.add(movies);
    }


}
