package ffadilaputra.org.salazar.adapter;


import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import ffadilaputra.org.salazar.DetailBuku;
import ffadilaputra.org.salazar.R;
import ffadilaputra.org.salazar.model.Buku;

/**
 * Created by ffadilaputra on 07/11/2017.
 */

public class BukuAdapter extends RecyclerView.Adapter<BukuAdapter.BukuViewHolder> {

    private Context context;
    private List<Buku> bukuList;

    public BukuAdapter(Context context,List<Buku> listBuku){
        this.context = context;
        this.bukuList = listBuku;
    }

    @Override
    public BukuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_buku,parent,false);

        return new BukuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(BukuViewHolder holder, int position) {
        final Buku buku = bukuList.get(position);
        holder.judulBuku.setText(buku.getJudul());
        holder.judulBuku.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),buku.getId().toString(),Toast.LENGTH_SHORT).show();
                Intent i = new Intent(v.getContext(),DetailBuku.class);
                i.putExtra("bukuId",buku.getId());
                v.getContext().startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return bukuList.size();
    }

    public class BukuViewHolder extends RecyclerView.ViewHolder{
        public TextView judulBuku;

        public BukuViewHolder(View itemView) {
            super(itemView);
            judulBuku= (TextView) itemView.findViewById(R.id.judul_buku);
        }

    }
}
