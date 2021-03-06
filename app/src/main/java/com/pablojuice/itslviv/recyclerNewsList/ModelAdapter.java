package com.pablojuice.itslviv.recyclerNewsList;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.pablojuice.itslviv.R;
import com.pablojuice.itslviv.db.DataBaseHelper;
import com.pablojuice.itslviv.homeMenu.ModelMainActivity;

import java.util.ArrayList;
import java.util.List;

public class ModelAdapter extends RecyclerView.Adapter<ModelAdapter.ViewHolder> {

    private Context context;
    private List<NewsPack> newsList;
    private DataBaseHelper dataBaseHelper;
    private String type;

    public ModelAdapter(Context context, DataBaseHelper dataBaseHelper, String type) {
        this.context = context;
        this.dataBaseHelper = dataBaseHelper;
        this.type = type;

        newsList = new ArrayList<>();
        new GetAllModelsTask().execute();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.model_list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        NewsPack newsPack = newsList.get(position);

        holder.getImgSource().setImageResource(context.getResources().getIdentifier(newsPack.getImgSource(), "drawable", context.getPackageName()));
        holder.getHeader().setText(newsPack.getHeader());
        holder.getAddress().setText(newsPack.getAddress());
        holder.getMark().setText(newsPack.getMark());

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, ModelMainActivity.class);
            intent.putExtra("newsPack", newsPack);
            context.startActivity(intent);
        });


    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgSource;
        private TextView header;
        private TextView address;
        private TextView mark;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imgSource = itemView.findViewById(R.id.news_list_item_img);
            header = itemView.findViewById(R.id.news_list_item_header);
            address = itemView.findViewById(R.id.news_list_item_address);
            mark = itemView.findViewById(R.id.news_list_item_mark);
        }

        public ImageView getImgSource() {
            return imgSource;
        }

        public TextView getHeader() {
            return header;
        }

        public TextView getAddress() {
            return address;
        }

        public TextView getMark() {
            return mark;
        }
    }

    private class GetAllModelsTask extends AsyncTask<Void, Void, List<NewsPack>> {

        @Override
        protected List<NewsPack> doInBackground(Void... voids) {
            switch (type) {
                case "Museums":
                    return dataBaseHelper.getAllMuseums();
                case "Banks":
                    return dataBaseHelper.getAllBanks();
                case "Hotels":
                    return dataBaseHelper.getAllHotels();
                case "Parks":
                    return dataBaseHelper.getAllParks();
                case "Shopping":
                    return dataBaseHelper.getAllShopping();
                default:
                    List<NewsPack> newsPackList = new ArrayList<>();
                    newsPackList.add(new NewsPack("hotels_icon", "header1", "address1", "4", "infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1", 49.2, 24.1));
                    newsPackList.add(new NewsPack("new_icon", "header1", "address1", "4", "infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1", 33, 33));
                    newsPackList.add(new NewsPack("museums_icon", "header1", "address1", "4", "infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1", 33, 33));
                    newsPackList.add(new NewsPack("hotels_icon", "header1", "address1", "4", "infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1", 33, 33));
                    newsPackList.add(new NewsPack("new_icon", "header1", "address1", "4", "infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1", 33, 33));
                    newsPackList.add(new NewsPack("museums_icon", "header1", "address1", "4", "infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1", 33, 33));
                    newsPackList.add(new NewsPack("hotels_icon", "header1", "address1", "4", "infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1", 33, 33));
                    newsPackList.add(new NewsPack("new_icon", "header1", "address1", "4", "infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1", 33, 33));
                    newsPackList.add(new NewsPack("museums_icon", "header1", "address1", "4", "infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1infooo1", 33, 33));
                    return newsPackList;
            }
        }

        @Override
        protected void onPostExecute(List<NewsPack> models) {
            newsList.addAll(models);
            notifyDataSetChanged();
        }

    }

}
