package com.lendmybook.dagorik.feelme;

import android.content.Context;
import android.content.pm.LabeledIntent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lendmybook.dagorik.feelme.models.Face;

import java.util.List;

/**
 * Created by Dagorik on 30/10/2016.
 */

public class FacesAdapter extends RecyclerView.Adapter<FacesAdapter.ViewHolderAdapter> {

    private List<Face> faceList;
    private Context context;

    public FacesAdapter(List<Face> faceList) {
        this.faceList = faceList;
    }


    @Override
    public ViewHolderAdapter onCreateViewHolder(ViewGroup parent, int viewType) {

        context = parent.getContext();
        View view = LayoutInflater.from(context).inflate(R.layout.item_face, parent, false);
        ViewHolderAdapter viewholder = new ViewHolderAdapter(view);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(ViewHolderAdapter holder, int position) {
//        Face face = faceList.get(position);
//        holder.bindTrack(face);
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public class ViewHolderAdapter extends RecyclerView.ViewHolder {

        public ViewHolderAdapter(View itemView) {
            super(itemView);
        }

        public void bindTrack(final Face faceArrayList) {


        }


    }

}
