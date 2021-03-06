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
import com.pablojuice.itslviv.homeMenu.NewsMainActivity;

import java.util.ArrayList;
import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {

    private DataBaseHelper dataBaseHelper;
    private Context context;
    private List<NewsPack> newsList;

    public NewsAdapter(Context context, DataBaseHelper dataBaseHelper) {
        this.context = context;
        this.dataBaseHelper = dataBaseHelper;
        this.newsList = new ArrayList<>();
        new GetAllNewsTask().execute();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.news_list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        NewsPack newsPack = newsList.get(position);

        holder.getImgSource().setImageResource(context.getResources().getIdentifier(newsPack.getImgSource(), "drawable", context.getPackageName() ));
        holder.getHeader().setText(newsPack.getHeader());


        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, NewsMainActivity.class);
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


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imgSource = itemView.findViewById(R.id.news_list_item_img);
            header = itemView.findViewById(R.id.news_list_item_header);

        }

        public ImageView getImgSource() { return imgSource;}
        public TextView getHeader(){ return header;}

    }
    private class GetAllNewsTask extends AsyncTask<Void, Void, List<NewsPack>> {

        @Override
        protected List<NewsPack> doInBackground(Void... voids) {
            return dataBaseHelper.getAllNews();
        }
        @Override
        protected void onPostExecute(List<NewsPack> news) {
            newsList.addAll(news);
            notifyDataSetChanged();
        }

    }






}
