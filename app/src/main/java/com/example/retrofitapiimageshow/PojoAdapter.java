package com.example.retrofitapiimageshow;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class PojoAdapter extends RecyclerView.Adapter<PojoViewHolder> {
    Context context;
    List<Pojo.Datum> list;

    public PojoAdapter(Context context, List<Pojo.Datum> list) {
        this.context = context;
        this.list = list;

    }



    @NonNull
    @Override
    public PojoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.items,parent,false);
        return new PojoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PojoViewHolder holder, int position) {
        holder.userId.setText(String.valueOf(list.get(position).getId()));
        holder.firstName.setText(String.valueOf(list.get(position).getFirstName()));
        holder.lastName.setText(String.valueOf(list.get(position).getLastName()));
        holder.email.setText(String.valueOf(list.get(position).getEmail()));
        Picasso.get().load(list.get(position).getAvatar()).fit().placeholder(R.drawable.ic_launcher_background).into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
class PojoViewHolder extends RecyclerView.ViewHolder {
    TextView firstName,lastName,email,userId;
    ImageView imageView;

    public PojoViewHolder(@NonNull View itemView) {
        super(itemView);

        firstName = itemView.findViewById(R.id.nameTxtId);
        lastName = itemView.findViewById(R.id.lastTxtId);
        email = itemView.findViewById(R.id.emailId);
        userId = itemView.findViewById(R.id.userId);
        imageView = itemView.findViewById(R.id.imageId);
    }
}



